package FinalTaskCalcRealNumbers.Model.GetData;

import FinalTaskCalcRealNumbers.Model.StrategyTwoNumbers.CountOperation;

public interface GetTwoNumExpression {
    CountOperation getTheOperation();
    double getFirstNumber();
    double getSecondNumber();
}
