package pz5.controller;

import pz5.service.UserBalanceService;
import pz5.service.UserBalanceServiceImp;

public class UserBalanceController {
    private UserBalanceService userBalanceService = new UserBalanceServiceImp();

    public int getBalance(int index) {
        return userBalanceService.getBalance(index);
    }

    public void removing(int index, int amount) {
       userBalanceService.removing(index, amount);
    }

    public void addition (int index, int amount) {
        userBalanceService.addition(index, amount);
    }

    public int getDuty(int index) {
        return userBalanceService.getDuty(index);
    }

    public void payDebt(int index,int amount){
        userBalanceService.payDebt(index, amount);
    }
}