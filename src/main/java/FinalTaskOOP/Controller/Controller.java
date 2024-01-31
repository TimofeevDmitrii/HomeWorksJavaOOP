package FinalTaskOOP.Controller;

import FinalTaskOOP.Model.Model;
import FinalTaskOOP.View.ConsoleView;
import FinalTaskOOP.View.SendToConsole;


public class Controller {

    Model model;
    SendToConsole view;

    public Controller(Model model, SendToConsole view) {
        this.model = model;
        this.view = view;
    }

    public void start(){
        while (true) {
            model.work();
            view.sendResultToConsole(model.getResult());
        }
    }

}
