package Seminar1hwOOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainHotBeveragesVendingMachine {

    static HotBeverageVendingMachine hotBeverageVendingMachine1 = new HotBeverageVendingMachine();
    static HotBeverageVendingMachine hotBeverageVendingMachine2 = new HotBeverageVendingMachine();

    public static String prompt(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    static void workWithVendingMachines(){
        HotBeverageVendingMachine[] hotVendMachines = {hotBeverageVendingMachine1, hotBeverageVendingMachine2};
        System.out.println("Здравствуйте! Введите цифру, соответствующую необходимому автомату горячих напитков\n"+
                "Далее введите название напитка, его объем и температуру.\n" +
                "Для выхода введите 3");
        StringBuilder sb = new StringBuilder();
        sb.append("1. Автомат горячих напитков №1"+"\n");
        sb.append("2. Автомат горячих напитков №2"+"\n");
        sb.append("3. Выход"+"\n");
        int inputNum = 0;
        while (inputNum!=3) {
            System.out.println(sb);
            inputNum = Integer.parseInt(prompt());
            if (inputNum==1 || inputNum==2){
                for (Product product: hotVendMachines[inputNum-1].getProductList()){
                    System.out.println(product.getName()+", "+((HotBeverage) product).getVolume()+" л, "+
                            ((HotBeverage) product).getTemperature()+" °C");
                }
                System.out.println("Введите название напитка: ");
                String prodName = prompt();
                System.out.println("Введите объем напитка: ");
                double volume = Double.parseDouble(prompt());
                System.out.println("Введите температуру напитка: ");
                int temperature = Integer.parseInt(prompt());
                Product resultBeverage = hotVendMachines[inputNum-1].getProduct(prodName,volume,temperature);
                if (resultBeverage!=null)
                    System.out.println("Ваш напиток готов: "+resultBeverage);
                else
                    System.out.println("Такого напитка нет");
            }
        }
    }

    public static void main(String[] args) {
        List<Product> hotBeverList1 = new ArrayList<>();
        hotBeverList1.add(new HotBeverage("Americano",50,0.3,80));
        hotBeverList1.add(new HotBeverage("Americano",40,0.2,80));
        hotBeverList1.add(new HotBeverage("Espresso", 30,0.1, 60));
        hotBeverList1.add(new HotBeverage("BlackTea", 25,0.3, 80));
        hotBeverList1.add(new HotBeverage("GreenTea", 25,0.25, 70));
        hotBeverageVendingMachine1.initProduct(hotBeverList1);

        List<Product> hotBeverList2 = new ArrayList<>();
        hotBeverList2.add(new HotBeverage("Americano",50,0.3,80));
        hotBeverList2.add(new HotBeverage("Latte",50,0.3,60));
        hotBeverList2.add(new HotBeverage("Espresso", 30,0.1, 60));
        hotBeverList2.add(new HotBeverage("MilkTea", 30,0.3, 80));
        hotBeverList2.add(new HotBeverage("GreenTea", 25,0.25, 70));
        hotBeverageVendingMachine2.initProduct(hotBeverList2);

        workWithVendingMachines();

//        System.out.println(hotBeverageVendingMachine1.getProduct("Americano",0.2,80));
    }
}
