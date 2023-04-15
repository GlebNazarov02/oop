package pz5.controller;

import java.util.List;

import pz5.model.User;
import pz5.service.UserService;
import pz5.service.UserServiceImpl;

public class UserController {
    private UserService userService = new UserServiceImpl();

    public void addUser(User user) {
        userService.addUser(user);
    }


    public void saveUser(String name, int age) {
        userService.saveUser(new User(name, age));
    }

    public void removeUser(User user) {
        userService.removeUser(user);
    }

    public List<User> getUserList() {
        return userService.getUserList();
    }
}
