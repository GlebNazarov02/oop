package dz6.View;

import java.util.Map;

import dz6.Conrtoller.VendingMachineController;


/*
 
 * Что сделано в сравнении с дз4
 * 1)Во View теперь идет взаимодействие только с контроллером(добавление,получение)
 * 2)Контроллер дает доступ к VendingMachine
 * 3)VendingMachine работает с репозиторием и с типами продуктов
 * 4)Репозиторий - List<Product>
 * S - Single responsibility principle: Ответственность разделена между классами 
 *     Контроллер работает с View и VendingMachineImpl, 
 *     VendingMachineImpl работает  с репозиторием и типами продуктов
 *     Классы продуктов - наследники
 *     Репозиторий - хранит продукты
 * O - Open-closed principle: классы наследуются от Product, можно создавать новые,наследуя базовые параметры и добавляя свои
 * L - Liskov substitution principle:поиск продуктов по различным признакам
 * I - Interface segregation principle: один сервис - один интерфейс
 * D - View работает с контроллером, не зная классов HotDrink и Drinkable, VendingMachineImpl не знает про View и Controller(использует толькоHotDrink,Drinkable и репозитори),ъ
 *      Controller осуществляет взаимодейтсвие View с VendingMachineImpl.Все это облегчает внесение новых функций без изменения старых.
 *
  */

public class View {
    public static void main(String[] args) {
        VendingMachineController vMachineController = new VendingMachineController();
        vMachineController.addProduct("Drinkable", Map.of("name", "Cola", "cost", 50, "volume", 0.5));
        vMachineController.addProduct("Drinkable", Map.of("name", "Fanta", "cost", 55, "volume", 0.5));
        vMachineController.addProduct("Drinkable", Map.of("name", "Pepsi", "cost", 40, "volume", 0.5));
        vMachineController.addProduct("Drinkable", Map.of("name", "Citro", "cost", 50, "volume", 0.5));
        vMachineController.addProduct("HotDrink",Map.of("name", "Coffee", "cost", 90, "volume", 0.22, "temperature", 70));
        vMachineController.addProduct("HotDrink",Map.of("name", "Black tea", "cost", 90, "volume", 0.22, "temperature", 70));
        for (String priceItem : vMachineController.getPpriceList()) {
            System.out.println(priceItem);

        }
        System.out.println(vMachineController.getProductByMatchPattern(Map.of("cost", 50)));

    }
}