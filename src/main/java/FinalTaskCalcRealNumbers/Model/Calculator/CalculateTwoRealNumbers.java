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


    public double makeCount(double number1, double number2) {
        return countOperation.count(number1,number2);
    }


}
