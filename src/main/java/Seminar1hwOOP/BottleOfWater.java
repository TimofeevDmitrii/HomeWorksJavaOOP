package Seminar1hwOOP;

public class BottleOfWater extends Product {
    private double volume;

    public BottleOfWater(String name, int cost, double volume) {
        super(name, cost);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("type = %s, name = %s, cost = %d руб., volume = %.2f л",
                super.getType(),super.getName(),super.getCost(),volume);
    }
}
