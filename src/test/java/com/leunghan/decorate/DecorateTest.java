package com.leunghan.decorate;

import org.junit.Test;

public class DecorateTest {
    @Test
    public void ShowTest(){
        Person person = new Person("test");
        PersonDecorate tShirts = new TShirts();
        PersonDecorate tee = new Tee();

        tShirts.SetComponent(person);
        tee.SetComponent(tShirts);

        tee.Show();
    }
}
