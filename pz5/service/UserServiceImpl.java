package pz5.service;

import java.util.List;

import pz5.model.User;
import pz5.repository.UserRepository;

public class UserServiceImpl implements UserService {

    @Override
    public void saveUser(User user) {
        if (user == null) {
            System.out.println("User is null!");
        }else{
            UserRepository.saveUser(user);
        }
    }

    @Override
    public void addUser(User user) {
        if (user == null) {
            System.out.println("User is null!");
        }else{
            UserRepository.addUser(user);
            }
    }

    @Override
    public void removeUser(User user) {
        if (user != null) {
            UserRepository.removeUser(user);
        } else {
            System.out.println("User is null!");
        }
    }

    @Override
    public List<User> getUserList() {
        return UserRepository.getUserList();
    }
}