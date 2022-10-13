package com.leunghan.strategy;

public class CashReturn implements CashSuper {
    private double moneyCondition;
    private double moneyReturn;


    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double AcceptCash(double money) {
        if (money >= moneyCondition) {
            money -= moneyReturn;
        }
        return money;
    }
}
