package Seminar2hwOOPalternative;

public abstract class Actor implements ActorBehaviour {
    protected int orderNumber;
    protected String name;
    protected String type;
    protected boolean isMakeOrder = false;
    protected boolean isTakeOrder = false;

    public Actor(String name) {
        this.name = name;
        this.type = getClass().getName();
    }

    @Override
    public void setOrderNumber(int number) {
        orderNumber=number;
    }

    @Override
    public int getOrderNumber() {
        return orderNumber;
    }

    @Override
    public void setMakeOrder(boolean make){
        isMakeOrder = make;
    }

    @Override
    public void setTakeOrder(boolean take){
        isTakeOrder = take;
    }

    @Override
    public boolean isMakeOrder(){
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder(){
        return isTakeOrder;
    }

    public String getName(){
        return name;
    }
}
