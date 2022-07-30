package com.leunghan.factory;

public class OperationFactory {
    private volatile OperationAdd optAdd = null;
    private volatile OperationSub optSub = null;

    public Operation createOperate(String opt){
        Operation res;
        switch (opt) {
            case "+":
                res = this.optAdd == null ? new OperationAdd() : this.optAdd;
                return res;
            case "-":
                res = this.optAdd == null ? new OperationSub() : this.optSub;
                return res;
            default:
                return null;
        }
    }
}
