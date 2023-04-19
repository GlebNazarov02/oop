package dz6.View;

import java.util.Map;

import dz6.Conrtoller.VendingMachineController;

public class View {
    public static void main(String[] args) {
        VendingMachineController vMachineController = new VendingMachineController();
        vMachineController.addProduct("Drinkable", Map.of("name", "Cola", "cost", 50, "volume", 0.5));
        vMachineController.addProduct("Drinkable", Map.of("name", "Fanta", "cost", 55, "volume", 0.5));
        vMachineController.addProduct("Drinkable", Map.of("name", "Pepsi", "cost", 40, "volume", 0.5));
        vMachineController.addProduct("Drinkable", Map.of("name", "Citro", "cost", 50, "volume", 0.5));
        vMachineController.addProduct("HotDrink",Map.of("name", "Coffee", "cost", 90, "volume", 0.22, "temperature", 70));
        vMachineController.addProduct("HotDrink",Map.of("name", "Black tea", "cost", 90, "volume", 0.22, "temperature", 80));

        for (String priceItem : vMachineController.getPpriceList()) {
            System.out.println(priceItem);

        }
        System.out.println(vMachineController.getProductByMatchPattern(Map.of("cost", 50)));

    }
}