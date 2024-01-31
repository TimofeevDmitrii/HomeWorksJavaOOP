package FinalTaskOOP.Model.ErrorCheck;

import java.util.Arrays;
import java.util.List;

public class CheckStringNumber implements ValidityCheck {

    private List<Character> validSymbols = Arrays.asList('1','2','3','4','5','6','7','8','9','0','-','+','.');


    @Override
    public boolean isValidData(String mathExpression) {
        char[] charMathExpression = mathExpression.toCharArray();
        return isValidSymbols(charMathExpression);
    }

    private boolean isValidSymbols(char[] MathExpression){
        for (char symbol: MathExpression){
            if (!validSymbols.contains(symbol)){
                System.out.println("Неверный символ: "+ symbol);
                return false;
            }
        }
        return true;
    }
}
