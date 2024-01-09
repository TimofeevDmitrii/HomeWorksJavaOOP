package Seminar2hwOOPalternative;

public interface ActorBehaviour {
    void setMakeOrder(boolean make);
    void setTakeOrder(boolean take);
    boolean isMakeOrder();
    boolean isTakeOrder();
    void setOrderNumber(int number);
    int getOrderNumber();
}
