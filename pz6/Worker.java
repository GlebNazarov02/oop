package pz6;

public class Worker {
private String name;
private int cabinet;
private int phoneNumber;
private int salary;


public void setName(String name) {
    this.name = name;
}

public void setSalary(int salary) {
    this.salary = salary;
}


public void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
}

public void setCabinet(int cabinet) {
    this.cabinet = cabinet;
} 


@Override
public String toString() {
    
    return String.format("Name: %s, cabinet: %d, phone: %d, salary: %d", name, cabinet, phoneNumber,salary);
}
}