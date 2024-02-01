package FinalTaskCalcRealNumbers.Controller;

import FinalTaskCalcRealNumbers.Model.ModelCalcTwoRealNum;
import FinalTaskCalcRealNumbers.Model.ModelCalculator;
import FinalTaskCalcRealNumbers.View.SendToConsole;


public class Controller {

    ModelCalcTwoRealNum modelCalcTwoNum;
    SendToConsole view;

    public Controller(ModelCalcTwoRealNum modelCalcTwoRealNum, SendToConsole view) {
        this.modelCalcTwoNum = modelCalcTwoRealNum;
        this.view = view;
    }

    public void start(){
        while (true) {
            modelCalcTwoNum.work();
            view.sendMessageToConsole(modelCalcTwoNum.getCurrentDataToPrint());
            view.sendResultToConsole(modelCalcTwoNum.getResult());
        }
    }

}
