package pz5.model;

public class User {
    private String name;
    private int age;
    private int balance;
    private int duty;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.balance = 0;
        this.duty = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBalance() {
        return this.balance;
    }

    public int getDuty() {
        return this.duty;
    }


    public void addition(int amount) {
        this.balance += amount;
    }

    public void removing(int amount) {
        if (amount > this.balance){
            System.out.println("недостаточно средств у " + name);
            this.duty = this.duty + amount - this.balance;
            this.balance = 0;
        }
        else{
            this.balance -= amount;
        }
    }
    
    public void payDebt(int amount){
        if (this.duty > 0){
            this.duty -= amount;
            if (this.duty < 0){
                this.balance -=this.duty;
                this.duty = 0;
            }
            System.out.println("долг погашен у " + name);
        }
        else{
            addition(amount);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name:'" + name + '\'' +
                ", age:'" + age + '\'' +
                ", balance:'" + balance + '\'' +
                ", duty:'" + duty + '\'' +
                '}';
    }
}