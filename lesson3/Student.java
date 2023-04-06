package lesson3;


public class Student extends People{

   
    private Integer average;

    Student(String name, String lastName, Integer average) {
        super(name, lastName);
        this.average = average;

    }

    public String toString() {
        return String.format("Average: %d Name:%s LastName %s", average, name, lastName);
    }

    public Integer getAverage() {
        return average;
    }
}