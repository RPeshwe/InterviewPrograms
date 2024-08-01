package Inheritance;

public class ChildClass extends ParentClass {

    public ChildClass(){
        System.out.println("Child Class interface");
    }

    @Override
    public void m1() {
        System.out.println("Overridden child class M1");
    }

    public void m2(){
        System.out.println("Child class M2");
    }
}
