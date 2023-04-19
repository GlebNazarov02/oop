package dz6.Model;


import java.util.Map;

public class Drinkable extends Product {
    private Double volume;

    public Drinkable(Map<String, Object> productData) {
        super(productData);
        this.volume = (Double) productData.get("volume");
    }

    public Double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return String.format("%s volume: %.2f", super.toString(), this.volume);
    }

    @Override
    public boolean isMatch(Map<String, Object> match_smth) {
        boolean matchBySuper = super.isMatch(match_smth);
        boolean matchByVolume = !match_smth.containsKey("volume") || match_smth.containsKey("volume")
                && (match_smth.get("volume") instanceof Double)
                && ((Double) match_smth.get("volume")).equals(volume);
        return matchBySuper && matchByVolume;
    }

}