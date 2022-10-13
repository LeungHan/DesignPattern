package com.leunghan.strategy;

public class CashContext {
    private CashSuper cashSuper;

    public CashContext(String type) {
        switch (type) {
            case "Normal":
                cashSuper = new CashNormal();
                break;
            case "Return":
                cashSuper = new CashReturn(300,100);
                break;
            case "Rebate":
                cashSuper = new CashRebate(0.8);
                break;
        }
    }

    public double GetResult(double money) {
        return cashSuper.AcceptCash(money);
    }
}
