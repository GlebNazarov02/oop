package pz5.service;

import java.util.List;

import pz5.model.User;

public interface UserService {
     void addUser(User user);

     void saveUser(User user);

     void removeUser(User user);

     List<User> getUserList();
}