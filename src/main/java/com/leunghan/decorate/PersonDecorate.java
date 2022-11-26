package com.leunghan.decorate;


// Person 类装饰器，装饰Person中show方法
public class PersonDecorate extends Person {
    private Person component;

    public void SetComponent(Person component) {
        this.component = component;
    }

    @Override
    public void Show() {
        if (component != null){
            component.Show();
        }
    }
}

// 装饰器具体实现类，对show方法进行扩展
class TShirts extends PersonDecorate {
    @Override
    public void Show() {
        System.out.println("TShirts");
        super.Show();
    }
}

class Tee extends PersonDecorate {
    @Override
    public void Show() {
        System.out.println("Tee");
        super.Show();
    }
}

