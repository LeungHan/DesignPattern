package com.leunghan.strategy;

import org.junit.Assert;
import org.junit.Test;

public class StrategyTest {
    @Test
    public void CashNormalTest(){
        CashSuper cashNormal = new CashNormal();
        Assert.assertEquals(
                cashNormal.AcceptCash(100.1), 100.1, 0);
    }

    @Test
    public void CashRebateTest(){
        CashSuper cashRebate = new CashRebate(0.8);
        Assert.assertEquals(
                cashRebate.AcceptCash(100.1), 100.1 * 0.8, 0);
    }

    @Test
    public void CashReturnTest(){
        CashSuper cashReturn = new CashReturn(300.0, 100.0);
        Assert.assertEquals(
                cashReturn.AcceptCash(300.1), 200.1, 0.0001);
    }
}
