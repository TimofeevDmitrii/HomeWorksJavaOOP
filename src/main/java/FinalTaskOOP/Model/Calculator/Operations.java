package FinalTaskOOP.Model.Calculator;

import FinalTaskOOP.Model.StrategyTwoNumbers.*;

import java.util.HashMap;
import java.util.Map;

public class Operations {

    private Map<String, CountOperation> operationMap = new HashMap<>();

    public Operations(){
        fillTheOperationMap();
    }

    public Operations(Map<String, CountOperation> operationMap){
        this.operationMap = operationMap;
    }

    private void fillTheOperationMap(){
        operationMap.put("+",new Plus());
        operationMap.put("-",new Minus());
        operationMap.put("*",new Multiply());
        operationMap.put("/",new Divide());
    }

    public void addTheOperation(String operation, CountOperation countOperation){
        operationMap.put(operation, countOperation);
    }

    public Map<String, CountOperation> getOperationMap() {
        return operationMap;
    }

    public void setOperationMap(Map<String, CountOperation> operationMap) {
        this.operationMap = operationMap;
    }
}
