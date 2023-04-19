package dz6.Model;

import java.util.Map;

public abstract class Product {
    private String name;
    private Integer cost;

    public Product(Map<String, Object> productData) {
        this.name = (String) productData.get("name");
        this.cost = (Integer) productData.get("cost");
    }

    public String getName() {
        return name;
    }

    public Integer getCost() {
        return cost;
    }

    public String toString() {
        return String.format("Product name: %s price: %d ", name, cost);
    }

    public boolean isMatch(Map<String, Object> match_smth) {
        boolean matchByCost = !match_smth.containsKey("cost") || match_smth.containsKey("cost")
                && (match_smth.get("cost") instanceof Integer) && ((Integer) match_smth.get("cost")).equals(cost);
        boolean matchByName = !match_smth.containsKey("name") || match_smth.containsKey("name")
                && (match_smth.get("name") instanceof String) && ((String) match_smth.get("name")).equals(name);

        return matchByCost && matchByName;
    }
}