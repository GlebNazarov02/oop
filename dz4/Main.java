package dz4;

public class Main {
    public static void main(String[] args) {
        System.out.println("ПОИСК ОСВЕЖАЮЩИХ НАПИТКОВ");
        VendingMachime<BouttleWater> vmBottle = new VendingMachime<>();
        vmBottle.addProducts(new BouttleWater("COLA",95,0.5));
        vmBottle.addProducts(new BouttleWater("FANTA",100,0.5));
        System.out.println("Поиск по цене: " + vmBottle.getProductByPrice(95));
        System.out.println("Поиск по имени: " + vmBottle.getProductbyName("FANTA"));


        System.out.println(" ПОИСК ГОРЯЧИХ НАПИТКОВ");
        VendingMachime<HotDrinks> vmHot= new VendingMachime<>();
        vmHot.addProducts(new HotDrinks("Coffee", 39.3, 0.3, 90));
        vmHot.addProducts(new HotDrinks("Tea", 49.5, 0.4, 80));
        vmHot.addProducts(new HotDrinks("Milk", 55.7, 1.0, 50));
        System.out.println("Поиск по цене: " + vmHot.getProductByPrice(49.5));
        System.out.println("Поиск по имени: " + vmHot.getProductbyName("Milk"));

    }

   
}