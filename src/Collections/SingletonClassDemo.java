package Collections;

public class SingletonClassDemo {

    private static final SingletonClassDemo singletonClass = new SingletonClassDemo();

    private SingletonClassDemo(){

    }

    public static SingletonClassDemo getSingleTonClassInstance(){
        return singletonClass;
    }
}
