package Seminar2hwOOPalternative;

import java.util.*;
import java.util.stream.Collectors;

public class Market implements MarketBehaviour {
    protected List<HumanCustomer> marketCustomers = new ArrayList<>();
    protected List<HumanOrderPicker> marketOrderPickers = new ArrayList<>();
    protected int currentOrderNumber=0;


    @Override
    public void acceptToMarket(Actor actor) {
        if (actor instanceof HumanCustomer) {
            System.out.println("Новый покупатель (" + actor.getName() + ") прибыл в магазин");
            takeInQueue(actor);
        }
        else{
            System.out.println("Новый сборщик заказов (" + actor.getName() + ") добавлен в команду магазина");
            marketOrderPickers.add((HumanOrderPicker) actor);
        }
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor: actors) {
            System.out.println("Покупатель ("+actor.getName()+") ушел из магазина");
            marketCustomers.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println("Покупатель ("+actor.getName()+") добавлен в очередь");
        marketCustomers.add((HumanCustomer) actor);
    }

    @Override
    public void takeOrders() {
        List<HumanOrderPicker> readyPickers = marketOrderPickers.stream()
                                                                .filter(hPicker->hPicker.isTakeOrder()==false)
                                                                .collect(Collectors.toList());
        List<HumanCustomer> nonOrderCustomer = marketCustomers.stream()
                                                              .filter(customer->customer.isMakeOrder()==false)
                                                              .collect(Collectors.toList());
        int currentIndex = 0;
        while(currentIndex<=readyPickers.size()-1 && currentIndex<=nonOrderCustomer.size()-1){

            HumanCustomer currCustomer = nonOrderCustomer.get(currentIndex);
            HumanOrderPicker currPicker = readyPickers.get(currentIndex);
            currCustomer.setOrderNumber(++currentOrderNumber);
            System.out.println("Покупатель (" + currCustomer.getName() + ") сделал заказ №" + currCustomer.getOrderNumber());
            currCustomer.setMakeOrder(true);

            currPicker.setOrderNumber(currentOrderNumber);
            System.out.println("Сборщик (" + currPicker.getName() + ") принял заказ №" + currPicker.getOrderNumber());
            currPicker.setTakeOrder(true);

            currentIndex++;
        }
    }

    @Override
    public void giveOrders() {
        for (HumanOrderPicker hPicker: marketOrderPickers)
            hPicker.prepareOrder();

        Map<Integer, HumanOrderPicker> doneOrders = new HashMap<>();
        for (HumanOrderPicker hPicker: marketOrderPickers)
            if (hPicker.isMakeOrder())
                doneOrders.put(hPicker.getOrderNumber(), hPicker);

        List<HumanCustomer> waitOrderCustomer = marketCustomers.stream()
                                                               .filter(customer->!customer.isTakeOrder() && customer.isMakeOrder())
                                                               .collect(Collectors.toList());
        for (HumanCustomer customer: waitOrderCustomer) {
            if (doneOrders.containsKey(customer.getOrderNumber())) {
                System.out.println("Сборщик ("+doneOrders.get(customer.getOrderNumber()).getName()+
                        ") передал покупателю (" + customer.getName() + ") заказ №" + customer.getOrderNumber());
                customer.setTakeOrder(true);
                doneOrders.get(customer.getOrderNumber()).setTakeOrder(false);
                doneOrders.get(customer.getOrderNumber()).setMakeOrder(false);
            }
        }
    }

    @Override // переписать ?
    public void releaseFromQueue() {
        List<Actor> releaseFromQueue = new ArrayList<>();
        for (Actor customer: marketCustomers) {
            if (customer.isTakeOrder()) {
                System.out.println("Покупатель ("+customer.getName()+") вышел из очереди");
                releaseFromQueue.add(customer);
            }
        }
        releaseFromMarket(releaseFromQueue);
    }
}
