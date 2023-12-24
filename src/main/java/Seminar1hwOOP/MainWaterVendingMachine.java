package Seminar1hwOOP;

import java.util.ArrayList;
import java.util.List;

public class MainWaterVendingMachine {
    public static void main(String[] args) {
        List<Product> bottleWaterLst = new ArrayList<>();
        bottleWaterLst.add(new BottleOfWater("Chernogolovka", 35,1));
        bottleWaterLst.add(new BottleOfWater("Chernogolovka",42,1.25));
        bottleWaterLst.add(new BottleOfWater("LesnoyDar", 45,1.25));
        bottleWaterLst.add(new BottleOfWater("LesnoyDar", 60,1.5));
        bottleWaterLst.add(new BottleOfWater("JivoyRodnik", 25,0.5));
//        for (Product product: bottleWaterLst)
//            System.out.println(product);
        BottleOfWaterVendingMachine waterVendingMachine = new BottleOfWaterVendingMachine();
        waterVendingMachine.initProduct(bottleWaterLst);
        System.out.println(waterVendingMachine.getProduct("LesnoyDar",1.25));
    }
}
