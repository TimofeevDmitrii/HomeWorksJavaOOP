package FinalTaskOOP.Model.GetData;

import FinalTaskOOP.Model.StrategyTwoNumbers.CountOperation;

public interface GetTwoNumExpression {
    CountOperation getTheOperation();
    double getFirstNumber();
    double getSecondNumber();
}
