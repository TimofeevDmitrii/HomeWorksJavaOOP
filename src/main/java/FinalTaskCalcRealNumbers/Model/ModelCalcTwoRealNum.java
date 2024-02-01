package FinalTaskCalcRealNumbers.Model;

import FinalTaskCalcRealNumbers.Model.Calculator.CalculateTwoRealNumbers;
import FinalTaskCalcRealNumbers.Model.Calculator.Operations;
import FinalTaskCalcRealNumbers.Model.GetData.GetDataToCalculate;

public class ModelCalcTwoRealNum extends ModelCalculator{

    private CalculateTwoRealNumbers calculator = new CalculateTwoRealNumbers();
    private GetDataToCalculate getDataForCount = new GetDataToCalculate(new Operations());

    public void work(){
        getDataForCount.getData();
        calculator.setCountOperation(getDataForCount.getTheOperation());
        calculator.setNumber1(getDataForCount.getFirstNumber());
        calculator.setNumber2(getDataForCount.getSecondNumber());
        result=calculator.makeCount();
    }

    public double getResult(){
        return result;
    }

    public String getCurrentDataToPrint(){
        return getDataForCount.getAllInputData();
    }

}

