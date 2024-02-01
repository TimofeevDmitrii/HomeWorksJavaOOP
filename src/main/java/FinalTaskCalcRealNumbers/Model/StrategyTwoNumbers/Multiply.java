package FinalTaskCalcRealNumbers.Model.StrategyTwoNumbers;

public class Multiply implements CountOperation {

    @Override
    public double count(double a, double b) {
        return a*b;
    }

    @Override
    public String toString() {
        return "Умножение";
    }
}
