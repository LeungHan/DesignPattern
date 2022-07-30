package com.leunghan.factory;

public class OperationAdd extends Operation {
    @Override
    public double opt(double numberA, double numberB) {
        return numberA + numberB;
    }
}
