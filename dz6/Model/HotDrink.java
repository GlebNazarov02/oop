package dz6.Model;
import java.util.Map;

public class HotDrink extends Drinkable {
    private Integer temperature;

    public HotDrink(Map<String, Object> productData) {
        super(productData);
        this.temperature = (Integer) productData.get("temperature");

    }

    public Integer getTemperature() {
        return temperature;
    }

   
    @Override
    public String toString() {
        return String.format("%s temperature: %d ", super.toString(), temperature);
    }

    @Override
    public boolean isMatch(Map<String, Object> match_smth) {
        boolean matchBySuper = super.isMatch(match_smth);
        boolean matchByTemperature = !match_smth.containsKey("temperature") || match_smth.containsKey("temperature")
                && (match_smth.get("temperature") instanceof Integer)
                && ((Integer) match_smth.get("temperature")).equals(temperature);

        return matchByTemperature && matchBySuper;
    }

}