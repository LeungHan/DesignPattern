package com.leunghan.strategy;

public class CashNormal implements CashSuper {
    @Override
    public double AcceptCash(double money) {
        return money;
    }
}
