package FinalTaskCalcRealNumbers.Model;


public abstract class ModelCalculator {
    protected double result;
    public abstract double getResult();
    public abstract void work();

    public abstract String getCurrentDataToPrint();
}
