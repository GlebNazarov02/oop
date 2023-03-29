import java.util.ArrayList;
import java.util.List;

/**
 * Класс автомата горячих напитков
 */
public class HotDrinksMachine implements Machine {
    List<HotDrinks> hotDrinksList = new ArrayList<>();


    @Override
    public void addProduct() {
    }


    public void addProduct(List<HotDrinks> hotdrink) {
        this.hotDrinksList = hotdrink;
    }

    @Override
    public String getProduct () {
        return null;
    }
    
    public String getProduct(String name, double volume, int temp){
        for (HotDrinks el :hotDrinksList) {
            if ((el.getName().equals(name)) && (el.getVolume() == volume) && (el.getTemp()==temp)) return el.toString();
        }
        return "Не найдено";
    }

    @Override
    public String getProductByname () {
        return null;
    }

   

    @Override
    public String getProductByPrice () {
        return null;
    }

    
}
