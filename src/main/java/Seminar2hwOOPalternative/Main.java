package Seminar2hwOOPalternative;

import java.util.List;

public class Main {

    public static void printQueue(List<HumanCustomer> listQueue){
        System.out.println("Статус очереди на данной итерации: ");
        for (HumanCustomer customer: listQueue){
            System.out.print(customer);
            if(customer.isMakeOrder())
                System.out.println(" - ждет заказ №"+customer.getOrderNumber());
            else
                System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        HumanOrderPicker humanOrderPicker8 = new HumanOrderPicker("Александр", 8);
        HumanOrderPicker humanOrderPicker10 = new HumanOrderPicker("Марина", 10);
        HumanCustomer humanCustomer1 = new HumanCustomer("Лапин Олег", 223);
        HumanCustomer humanCustomer2 = new HumanCustomer("Горохов Александр",1224);
        HumanCustomer humanCustomer3 = new HumanCustomer("Савин Сергей",7709);
        HumanCustomer humanCustomer4 = new HumanCustomer("Шаталова Алина",8834);
        HumanCustomer humanCustomer5 = new HumanCustomer("Буянова Ольга",9356);
        HumanCustomer humanCustomer6 = new HumanCustomer("Антонова Елена",554);
        HumanCustomer humanCustomer7 = new HumanCustomer("Рубцов Борис",1005);
        HumanCustomer humanCustomer8 = new HumanCustomer("Павлов Владимир",333);
        Market market = new Market();
        market.acceptToMarket(humanOrderPicker8);
        market.acceptToMarket(humanOrderPicker10);
        market.acceptToMarket(humanCustomer1);
        market.acceptToMarket(humanCustomer2);
        market.acceptToMarket(humanCustomer3);
        market.update();
        printQueue(market.marketCustomers);

        market.acceptToMarket(humanCustomer4);
        market.acceptToMarket(humanCustomer5);
        market.update();
        printQueue(market.marketCustomers);

        market.acceptToMarket(humanCustomer6);
        market.acceptToMarket(humanCustomer7);
        market.acceptToMarket(humanCustomer8);
        market.update();
        printQueue(market.marketCustomers);

        while (market.marketCustomers.size()!=0) {
            market.update();
            printQueue(market.marketCustomers);
        }

    }
}
