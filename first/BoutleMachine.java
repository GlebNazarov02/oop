import java.util.ArrayList;
import java.util.List;


public class BoutleMachine implements Machine {
    List<BouttleWater> bottleOfWaterList = new ArrayList<>();


    @Override
    public void addProduct() {
    }


    public void addProduct(List<BouttleWater> bottle) {
        this.bottleOfWaterList = bottle;
    }

  
    @Override
    public String getProductByname () {
        return null;
    }

    @Override
    public String getProduct () {
        return null;
    }


 
    public String getProductByname(String name) {
        for (BouttleWater el : bottleOfWaterList) {
            if (el.getName().equals(name)) return el.toString();
        }
        return "Не найдено";
    }

    @Override
    public String getProductByPrice () {
        return null;
    }

   
    public String getProductByPrice(double cost) {
        for (BouttleWater el : bottleOfWaterList) {
            if (el.getCost() == cost) return el.toString();
        }
        return "Не найдено";
    }
}