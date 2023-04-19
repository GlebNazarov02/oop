package pz6;

public class Cat {
    private String name;
    private String breed;
    private int age;
    private int weight;
    private boolean isInGoodMood;
    private String color;

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setIsInGoodMood(boolean IsInGoodMood) {
        this.isInGoodMood = IsInGoodMood;
    } 

    public void setColor(String color) {
        this.color = color;

    }

    @Override
    public String toString() {
        
        return String.format("Name: %s, breed: %s, age: %d, weight: %d, goodmodd: %b,color: %s", name, breed, age,weight,isInGoodMood,color);
    }
}