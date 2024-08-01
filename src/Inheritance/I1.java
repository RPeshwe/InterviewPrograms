package Inheritance;

public interface I1 {
    void m1();

    default void m2(){
        System.out.println("I1");
    }
}
