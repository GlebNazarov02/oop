package dz5;

public abstract class Product1 {
    protected String name;
    protected double cost;

    public String getName() {
        return name;
    }


    public double getCost() {
        return cost;
    }

    public String toString() {
        return String.format("Product name %s, cost %.2f", name, cost);
    }
    
    Product1(){

    }
    Product1(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
}
