package Seminar2hwOOPalternative;

import java.util.Random;

public class HumanOrderPicker extends Actor {
    protected int personnelNumber;

    public HumanOrderPicker(String name, int idNum) {
        super(name);
        personnelNumber = idNum;
        orderNumber=0;
    }

    public void prepareOrder(){
        Random rnd = new Random();
        // minValue + (int) (Math.random() * (maxValue - minValue + 1)); для нашей задачи minValue=0; maxValue=1
        int readyOrder = (int) (Math.random() * 2); // генерируем числа от 0 до 1: 0 - заказ не готов, 1 - заказ готов
        if (readyOrder==1)
            setMakeOrder(true);
    }

    @Override
    public String toString(){
        return String.format("%s, %d, %s", type, personnelNumber,name);
    }
}
