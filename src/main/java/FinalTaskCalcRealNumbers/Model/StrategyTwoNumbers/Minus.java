package FinalTaskCalcRealNumbers.Model.StrategyTwoNumbers;

public class Minus implements CountOperation {
    @Override
    public double count(double a, double b) {
        return a-b;
    }

    @Override
    public String toString() {
        return "Вычитание";
    }
}
