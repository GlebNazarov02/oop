package pz5.service;

import pz5.repository.UserRepository;

public class UserBalanceServiceImp implements UserBalanceService {

    @Override
    public void addition(int index, int amount) {
        UserRepository.addition(index, amount);

    }

    @Override
    public void removing(int index, int amount) {
        UserRepository.removing(index, amount);
    }

    @Override
    public int getBalance(int index) {
        return UserRepository.getBalance(index);
    }
    
    @Override
    public int getDuty(int index) {
        return UserRepository.getDuty(index);
    }

    @Override
    public void payDebt(int index,int amount){
        UserRepository.payDebt(index, amount);
    }
}