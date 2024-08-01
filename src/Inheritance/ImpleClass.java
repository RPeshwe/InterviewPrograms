package Inheritance;

public class ImpleClass implements I1, I2{

    @Override
    public void m1() {
        System.out.println("M1 clas");
    }

    @Override
    public void m2() {
        I1.super.m2();
    }
}
