package Seminar2hwOOP;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour{
    protected List<Actor> marketCustomers = new ArrayList<>();
    protected int currentOrderNumber=0;


    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println("Новый покупатель ("+actor.getName()+") прибыл в магазин");
        takeInQueue(actor);
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
        marketCustomers.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor customer: marketCustomers) {
            if (!customer.isMakeOrder()) {
                customer.setOrderNumber(++currentOrderNumber);
                System.out.println("Покупатель ("+customer.getName()+") сделал заказ №"+customer.getOrderNumber());
                customer.setMakeOrder(true);
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor customer: marketCustomers) {
            if (!customer.isTakeOrder() && customer.isMakeOrder()) {
                System.out.println("Покупатель ("+customer.getName()+") получил заказ №"+customer.getOrderNumber());
                customer.setTakeOrder(true);
            }
        }
    }

    @Override
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
