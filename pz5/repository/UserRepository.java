package pz5.repository;

import pz5.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    static private List<User> userList = new ArrayList<>();

    static public void saveUser(User user) {
        userList.add(user);
    }

    static public void addUser(User user) {
        userList.add(user);
    }

    static public void removeUser(User user) {
        System.out.println("remove user");
        userList.remove(user);
    }

    static public List<User> getUserList() {
        return userList;
    }

    static public void addition(int index, int amount) {
        userList.get(index).addition(amount);
    }

    static public void removing(int index, int amount) {
        userList.get(index).removing(amount);
    }

    static public int getBalance(int index) {
        return userList.get(index).getBalance();
    }

    static public int getDuty(int index) {
        return userList.get(index).getDuty();
    }

    static public void payDebt(int index, int amount) {
        userList.get(index).payDebt(amount);
    }
}