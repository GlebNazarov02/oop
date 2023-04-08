package dz5;

public class HotDrinks extends BouttleWater {
    private int temp;

    public HotDrinks(String name, double cost, Double volume, int temp) {
        super(name, cost, volume);
        this.temp = temp;
    }

    HotDrinks(){}

    public int getTemp() {
        return temp;
    }


    @Override
    public String toString() {
        return String.format("Product name %s, cost %.2f, volume %.2f, temp %d", name, cost, volume,temp);
    }

    public void setTemp(int temp) {
        if (temp > 30) this.temp = temp;
        else System.out.println("Напиток не горячий!");
    }
}

