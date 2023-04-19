package dz4;

import java.util.List;
import java.util.ArrayList;

public class VendingMachime <T extends Product1> {
    private List<T> products = new ArrayList<>();

    public void addProducts(T product){
        products.add(product);
    }

    public String getProductbyName(String name){
        for (T el :products) {
            if ((el.getName().equals(name))) return el.toString();
        }
        return "Не найдено";
    }

    public String getProductByPrice(double cost) {
        for (T el :products) {
            if (el.getCost() == cost) return el.toString();
        }
        return "Не найдено";
    }
}


