import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("ПОИСК ОСВЕЖАЮЩИХ НАПИТКОВ");
        BoutleMachine vmBottle = new BoutleMachine();
        List<BouttleWater> bottleList = new ArrayList<>(Arrays.asList(
                new BouttleWater(prod.Cola.toString(), 39.3, 0.5),
                new BouttleWater(prod.Sprite.toString(), 49.5, 0.45),
                new BouttleWater(prod.Fanta.toString(), 55.7, 0.43),
                new BouttleWater("Aqua Minerale", 30.1, 0.5)));
        vmBottle.addProduct(bottleList);
        System.out.println(vmBottle.getProductByname("Aqua Minerale"));
        System.out.println(vmBottle.getProductByPrice(49.5));

        System.out.println(" ПОИСК ГОРЯЧИХ НАПИТКОВ");
        HotDrinksMachine vmHotDrinks = new HotDrinksMachine();
        List<HotDrinks> hotDrinksList = new ArrayList<>(Arrays.asList(
                new HotDrinks("Coffee", 39.3, 0.3, 90),
                new HotDrinks("Tea", 49.5, 0.4, 80),
                new HotDrinks("Milk", 55.7, 1.0, 50)));
        vmHotDrinks.addProduct(hotDrinksList);
        System.out.println("Поиск по параметрам: " + vmHotDrinks.getProduct("Coffee",0.3,90));
    }

    enum prod {
        Cola,
        Sprite,
        Fanta,
    }
}