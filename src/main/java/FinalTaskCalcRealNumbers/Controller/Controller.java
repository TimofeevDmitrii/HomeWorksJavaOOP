package FinalTaskCalcRealNumbers.Controller;

import FinalTaskCalcRealNumbers.Model.ModelCalcTwoRealNum;
import FinalTaskCalcRealNumbers.Model.ModelCalculator;
import FinalTaskCalcRealNumbers.View.SendToConsole;


public class Controller {

    ModelCalculator modelCalcNum;
    SendToConsole view;

    public Controller(ModelCalculator modelCalcNum, SendToConsole view) {
        this.modelCalcNum = modelCalcNum;
        this.view = view;
    }

    public void start(){
        while (true) {
            modelCalcNum.work();
            view.sendMessageToConsole(modelCalcNum.getCurrentDataToPrint());
            view.sendResultToConsole(modelCalcNum.getResult());
        }
    }

}
