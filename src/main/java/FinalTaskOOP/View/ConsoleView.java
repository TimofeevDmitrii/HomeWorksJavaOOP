package FinalTaskOOP.View;

public class ConsoleView implements SendToConsole {
    @Override
    public void sendResultToConsole(double result) {
        System.out.printf("Результат операции --> %.5f%n",result);
        System.out.println("|--------------------------------------------------------|");
        System.out.println();
    }
}
