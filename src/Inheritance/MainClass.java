package Inheritance;

public class MainClass {

    public static void main(String[] args) {
        /*ParentClass parentClass = new ChildClass();
        parentClass.m1();*/

        I1 i1 = new ImpleClass();
        i1.m1();

        I2 i2 = new ImpleClass();
        i2.m2();
    }
}
