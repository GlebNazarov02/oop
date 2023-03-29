public abstract class Product {
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
    
    Product(){

    }
    Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

}