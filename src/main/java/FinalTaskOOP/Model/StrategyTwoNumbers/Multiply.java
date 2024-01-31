package FinalTaskOOP.Model.StrategyTwoNumbers;

public class Multiply implements CountOperation {

    @Override
    public double Count(double a, double b) {
        return a*b;
    }

    @Override
    public String toString() {
        return "Умножение";
    }
}
