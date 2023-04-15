package pz5.view;

import java.util.List;
import pz5.controller.UserBalanceController;
import pz5.controller.UserController;
import pz5.model.User;

public class UserView {
    public static void main(String[] args) {
        UserController userController = new UserController();
        userController.saveUser("Alexey", 40);
        userController.saveUser("Arseniy", 50);
        userController.saveUser("Vasya", 60);
        userController.saveUser("Valera", 80);
        userController.saveUser("Tolya", 20);
        User Michael = new User("Michael", 30);
        userController.addUser(Michael);
        printUsers(userController.getUserList());
        System.out.println("_____________________________");
        userController.removeUser(Michael);
        printUsers(userController.getUserList());
        System.out.println("_____________________________");

        UserBalanceController userBalanceController = new UserBalanceController();
        userBalanceController.addition(0, 20000);
        userBalanceController.addition(1, 2000);
        userBalanceController.addition(2, 40000);
        userBalanceController.addition(3, 9000);
        userBalanceController.addition(4, 5000);
        printUsers(userController.getUserList());
        System.out.println("_____________________________");
        
        userBalanceController.removing(1, 99000);
        userBalanceController.removing(2, 90000);
        userBalanceController.removing(3, 99000);
        userBalanceController.payDebt(1, 97000);
        userBalanceController.payDebt(2, 100000);
        printUsers(userController.getUserList());

    }

    public static void printUsers(List<User> userList) {
        int i = 0;
        for (User user : userList) {
            System.out.printf("index: %d %s \n", i, user);
            i++;
        }
    }
}