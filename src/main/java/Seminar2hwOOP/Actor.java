package Seminar2hwOOP;

public abstract class Actor implements ActorBehaviour {
    protected String name;
    protected boolean isMakeOrder = false; //??????
    protected boolean isTakeOrder = false; //????? опреедлиь в конструкторе или оставить здесь?

    public Actor(String name) {
        this.name = name;
    }

    abstract String getName();
}
