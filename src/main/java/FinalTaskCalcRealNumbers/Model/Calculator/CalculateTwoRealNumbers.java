package FinalTaskCalcRealNumbers.Model.Calculator;


import FinalTaskCalcRealNumbers.Model.StrategyTwoNumbers.CountOperation;

public class CalculateTwoRealNumbers{

    private CountOperation countOperation;


    public CountOperation getCountOperation() {
        return countOperation;
    }

    public void setCountOperation(CountOperation countOperation) {
        this.countOperation = countOperation;
    }

    private double number1;
    private double number2;


    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double makeCount() {
        return countOperation.count(number1,number2);
    }


}
