package dz6.Conrtoller;

import java.util.List;
import java.util.Map;
import dz6.Service.VendingMachineImp;

public class VendingMachineController {
    private VendingMachineImp vendingMachineService = new VendingMachineImp();

    public void addProduct(String productType, Map<String, Object> productData) {
        if (vendingMachineService.getProductTypes().contains(productType)) {
            vendingMachineService.addProduct(productType, productData);
        }
    }

    public List<String> getPpriceList() {
        return vendingMachineService.getProductPriceList();
    }

    public List<String> getProductByMatchPattern(Map<String, Object> matchPattern) {
        return vendingMachineService.getProducts(matchPattern);
    }
}