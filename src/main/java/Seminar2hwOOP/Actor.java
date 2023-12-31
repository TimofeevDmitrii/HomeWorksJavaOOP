package Seminar2hwOOP;

public abstract class Actor implements ActorBehaviour {
    protected String name;
    protected boolean isMakeOrder = false;
    protected boolean isTakeOrder = false;

    public Actor(String name) {
        this.name = name;
    }

    abstract String getName();
}
