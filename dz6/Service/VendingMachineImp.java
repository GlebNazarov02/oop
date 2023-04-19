package dz6.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import dz6.Model.Drinkable;
import dz6.Model.HotDrink;
import dz6.Repository.VendingMachineRepository;

public class VendingMachineImp implements VendingMachine {
    List<String> productTypes = Arrays.asList("HotDrink", "Drinkable");

    @Override
    public List<String> getProductPriceList() {
        return VendingMachineRepository.productList.stream()
                .map(product -> product.getClass().getSimpleName() + " - " + Objects.toString(product)).toList();
    }

    @Override
    public void addProduct(String productType, Map<String, Object> productData) {
        switch (productType) {
            case "HotDrink":
                VendingMachineRepository.productList.add(new HotDrink(productData));
                break;
            case "Drinkable":
                VendingMachineRepository.productList.add(new Drinkable(productData));
                break;
            default:
                break;
        }
    }

    @Override
    public List<String> getProducts(Map<String, Object> matchsmth) {
        return VendingMachineRepository.productList.stream().filter(product -> product.isMatch(matchsmth))
                .map(product -> product.getClass().getSimpleName() + " - " + Objects.toString(product)).toList();

    }

    @Override
    public List<String> getProductTypes() {
        return productTypes;
    }

}