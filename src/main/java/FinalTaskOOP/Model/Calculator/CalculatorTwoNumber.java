package FinalTaskOOP.Model.Calculator;

import FinalTaskOOP.Model.GetData.GetDataToCalculate;
import FinalTaskOOP.Model.StrategyTwoNumbers.CountOperation;

public class CalculatorTwoNumber extends Calculator {

    private CountOperation countOperation;
    private GetDataToCalculate getDataForCount = new GetDataToCalculate(new Operations());


    public void setOperation(CountOperation countOperation) {
        this.countOperation = countOperation;
    }


    @Override
    public double makeCount() {
        getDataForCount.getData();
        countOperation=getDataForCount.getTheOperation();
        double number1=getDataForCount.getFirstNumber();
        double number2=getDataForCount.getSecondNumber();
        getDataForCount.printInputData();
        System.out.println("Выбрана операция: "+countOperation);
        return countOperation.Count(number1,number2);
    }


}
