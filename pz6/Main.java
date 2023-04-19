package pz6;

public class Main {
    public static void main(String[] args) {
        Cat cat = CatBuilder.getInstance().setName("Мурзик").setBreed("персидский").setAge(3).setColor("White").setBreed("idn").setIsInGoodMood(false).build();
        System.out.println(cat.toString());

    }
    
}