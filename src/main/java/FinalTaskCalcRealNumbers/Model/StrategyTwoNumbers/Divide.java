package FinalTaskCalcRealNumbers.Model.StrategyTwoNumbers;

public class Divide implements CountOperation {
    @Override
    public double count(double a, double b) {
        if (b==0) {
            System.out.println("Ошибка - деление на ноль");
            return 0;
        }
        return a/b;
    }

    @Override
    public String toString() {
        return "Деление";
    }
}
