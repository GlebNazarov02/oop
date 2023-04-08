package dz5;

public class BouttleWater extends Product1 {
    protected Double volume;


    BouttleWater(String name, double cost, Double volume) {
        super(name, cost);
        this.volume = volume;
    }

    BouttleWater(){

    }

    public double getVolume() {
        return volume;
    }


    @Override
    public String toString() {
        return String.format("Product name %s, cost %.2f, volume %.2f", name, cost, volume);
    }


    public void setVolume(double volume) {
        if (volume > 0) this.volume = volume;
        else System.out.println("Объем напитка должен быть больше нуля!");
    }
}
