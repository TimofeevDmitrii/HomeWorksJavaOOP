package FinalTaskCalcRealNumbers.View;

public class ConsoleView implements SendToConsole {
    @Override
    public void sendMessageToConsole(String mess) {
        System.out.println(mess);
    }

    @Override
    public void sendResultToConsole(double result) {
        System.out.printf("Результат операции --> %.5f%n",result);
        System.out.println("|--------------------------------------------------------|");
        System.out.println();
    }
}
