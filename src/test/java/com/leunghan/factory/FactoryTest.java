package com.leunghan.factory;

import org.junit.Assert;
import org.junit.Test;

public class FactoryTest {
    @Test
    public void OperationAddTest(){
        OperationFactory factory = new OperationFactory();
        Operation opt = factory.createOperate("+");
        Assert.assertEquals(opt.opt(2, 1), 3.0, 0);
    }

    @Test
    public void OperationSubTest(){
        OperationFactory factory = new OperationFactory();
        Operation opt = factory.createOperate("-");
        Assert.assertEquals(opt.opt(2, 1), 1.0, 0);
    }
}
