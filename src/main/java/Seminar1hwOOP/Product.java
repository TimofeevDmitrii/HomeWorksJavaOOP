package Seminar1hwOOP;

public abstract class Product {
    private String name;
    private String type;
    private int cost;

    public Product(String name, int cost) {
        this.name = name;
        this.type = getClass().getName();
        this.cost = cost;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("type = %s, name = %s, cost = %d",type,name,cost);
    }
}
