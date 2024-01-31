package FinalTaskOOP.Model.GetData;


import FinalTaskOOP.Model.Calculator.Operations;
import FinalTaskOOP.Model.ErrorCheck.CheckStringNumber;
import FinalTaskOOP.Model.ErrorCheck.ValidityCheck;
import FinalTaskOOP.Model.InputFromConsole.InputFromConsole;
import FinalTaskOOP.Model.StrategyTwoNumbers.CountOperation;

import java.util.Map;

public class GetDataToCalculate implements GetTwoNumExpression {

    private Operations operations;
    private InputFromConsole inputFromConsole = new InputFromConsole();
    private ValidityCheck checkNumber = new CheckStringNumber();
    private double number1;
    private String currStringOperation;
    private double number2;

    public GetDataToCalculate(Operations operations){
        this.operations=operations;
    }

    public void setOperations(Operations operations) {
        this.operations = operations;
    }

    private String chooseOperation() {
        while(true) {
            Map<String, CountOperation> operationMap = operations.getOperationMap();
            String operation = inputFromConsole.getTheExpressionFromConsole();
            if(operationMap.containsKey(operation))
                return operation;
            else
                System.out.println("Неверный ввод оператора");
            if (operation.toCharArray().length>1)
                System.out.println("Количество символов превышает 1");
        }
    }



    public void getData() {
        System.out.println("Введите первое число:");
        number1=getNumber();
        System.out.println("Введите оператор: ");
        currStringOperation=chooseOperation();
        System.out.println("Введите второе число:");
        number2=getNumber();
    }


    private double getNumber() {
        while (true) {
            String inputNumber = inputFromConsole.getTheExpressionFromConsole();
            if (checkNumber.isValidData(inputNumber)){
                try {
                    return  Double.parseDouble(inputNumber);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Ошибка. Повторите ввод числа:");
        }
    }


    @Override
    public CountOperation getTheOperation() {
        return operations.getOperationMap().get(currStringOperation);
    }

    @Override
    public double getFirstNumber() {
        return number1;
    }

    @Override
    public double getSecondNumber() {
        return number2;
    }

    private String prepareNumberToPrint(double number){
        if (number<0)
            return "("+number+")";
        else
            return Double.toString(number);
    }

    public void printInputData(){
        StringBuilder sb = new StringBuilder("Исходное выражение: ");
        sb.append(prepareNumberToPrint(number1));
        sb.append(currStringOperation);
        sb.append(prepareNumberToPrint(number2));
        System.out.println(sb);
    }
}
