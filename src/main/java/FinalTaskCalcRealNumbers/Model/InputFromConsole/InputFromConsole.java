package FinalTaskCalcRealNumbers.Model.InputFromConsole;

import java.util.Scanner;

public class InputFromConsole implements ReadFromConsole {

    private Scanner scanner = new Scanner(System.in);

    public String getTheExpressionFromConsole(){
        return scanner.nextLine();
    }

}
