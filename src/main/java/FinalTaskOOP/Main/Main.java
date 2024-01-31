package FinalTaskOOP.Main;

import FinalTaskOOP.Controller.Controller;
import FinalTaskOOP.Model.Model;
import FinalTaskOOP.View.ConsoleView;


public class Main {

    public static void main(String[] args) {
        Model realNumbersCalculator = new Model();
        ConsoleView viewConsole = new ConsoleView();
        Controller controllerCalculator = new Controller(realNumbersCalculator, viewConsole);

        controllerCalculator.start();

    }
}
