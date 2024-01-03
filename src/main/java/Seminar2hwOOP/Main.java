package Seminar2hwOOP;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Лапин Олег");
        Human human2 = new Human("Горохов Александр");
        Human human3 = new Human("Савин Сергей");
        Human human4 = new Human("Шаталова Алина");
        Human human5 = new Human("Буянова Ольга");
        Market market = new Market();
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.update();
        System.out.println();
        market.acceptToMarket(human4);
        market.acceptToMarket(human5);
        market.update();
//        System.out.println(market.marketCustomers);

    }
}
