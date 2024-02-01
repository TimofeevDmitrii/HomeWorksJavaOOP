package FinalTaskCalcRealNumbers.Main;

import FinalTaskCalcRealNumbers.Controller.Controller;
import FinalTaskCalcRealNumbers.Model.ModelCalcTwoRealNum;
import FinalTaskCalcRealNumbers.View.ConsoleView;


public class Main {

    public static void main(String[] args) {
        ModelCalcTwoRealNum realNumbersCalculator = new ModelCalcTwoRealNum();
        ConsoleView viewConsole = new ConsoleView();
        Controller controllerCalculator = new Controller(realNumbersCalculator, viewConsole);

        controllerCalculator.start();

    }
}
