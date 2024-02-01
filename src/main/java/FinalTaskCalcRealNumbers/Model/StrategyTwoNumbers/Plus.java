package FinalTaskCalcRealNumbers.Model.StrategyTwoNumbers;

public class Plus implements CountOperation {
    @Override
    public double count(double a, double b) {
        return a+b;
    }

    @Override
    public String toString() {
        return "Сложение";
    }
}
