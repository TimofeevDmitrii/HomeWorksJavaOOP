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
        result=calculator.makeCount(getDataForCount.getFirstNumber(),getDataForCount.getSecondNumber());
    }

    public double getResult(){
        return result;
    }

    public String getCurrentDataToPrint(){
        return getDataForCount.getAllInputData();
    }

}

