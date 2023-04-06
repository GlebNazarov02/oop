package lesson3;

public class People {
    protected String name;
    protected String lastName;

    People(String name,String lastName){
        this.name = name;
        this.lastName =lastName;
    }
    public String getName(){
        return name;
    }

    public String getLastName(){
        return lastName;
    }

    public String toString() {
        return String.format("Name:%s LastName %s", name, lastName);
    }
}  


