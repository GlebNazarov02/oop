package pz5.service;

public interface UserBalanceService {
    void addition(int index, int amount);

    void removing(int index, int amount);

    int getBalance(int index);

    int getDuty(int index);

    void payDebt(int index,int amount);
}