package Seminar1hwOOP;

public class HotBeverage extends Product{
    private int temperature;
    private double volume;

    public HotBeverage(String name, int cost, double volume, int temperature ) {
        super(name, cost);
        this.volume = volume;
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public double getVolume() {
        return volume;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("type = %s, name = %s, cost = %d руб., volume = %.2f л, temperature = %d °C" ,
                super.getType(),super.getName(),super.getCost(),volume, temperature);
    }
}
