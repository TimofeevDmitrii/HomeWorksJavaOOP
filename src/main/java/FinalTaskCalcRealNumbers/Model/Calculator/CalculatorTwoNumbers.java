package FinalTaskCalcRealNumbers.Model.Calculator;


import FinalTaskCalcRealNumbers.Model.StrategyTwoNumbers.CountOperation;

public abstract class CalculatorTwoNumbers {
    private CountOperation countOperation;


    public CountOperation getCountOperation() {
        return countOperation;
    }

    public void setCountOperation(CountOperation countOperation) {
        this.countOperation = countOperation;
    }


}
