package com.leunghan.strategy;

public class CashRebate implements CashSuper{
    private double rebate;

    public CashRebate(double rebate) {
        this.rebate = rebate;
    }

    @Override
    public double AcceptCash(double money) {
        return money * rebate;
    }
}
