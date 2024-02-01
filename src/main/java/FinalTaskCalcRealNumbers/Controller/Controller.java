package FinalTaskCalcRealNumbers.Controller;

import FinalTaskCalcRealNumbers.Model.ModelCalcTwoRealNum;
import FinalTaskCalcRealNumbers.Model.ModelCalculator;
import FinalTaskCalcRealNumbers.View.SendToConsole;


public class Controller {

    ModelCalculator modelCalculator;
    SendToConsole view;

    public Controller(ModelCalculator modelCalcNum, SendToConsole view) {
        this.modelCalculator = modelCalcNum;
        this.view = view;
    }

    public void start(){
        while (true) {
            modelCalculator.work();
            view.sendMessageToConsole(modelCalculator.getCurrentDataToPrint());
            view.sendResultToConsole(modelCalculator.getResult());
        }
    }

}
