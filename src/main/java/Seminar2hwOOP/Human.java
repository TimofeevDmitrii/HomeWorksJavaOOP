package Seminar2hwOOP;

public class Human extends Actor {
    public Human(String name) {
        super(name);
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

    @Override
    public String getName() {
        return name;
    }
}
