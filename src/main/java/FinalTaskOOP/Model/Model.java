package FinalTaskOOP.Model;

import FinalTaskOOP.Model.Calculator.Calculator;
import FinalTaskOOP.Model.Calculator.CalculatorTwoNumber;

public class Model {

    protected Calculator calculator = new CalculatorTwoNumber();
    private double result;

    public void work(){
        result=calculator.makeCount();
    }

    public double getResult(){
        return result;
    }

}
