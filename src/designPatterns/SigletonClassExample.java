package designPatterns;

import Collections.SingletonClassDemo;

import java.awt.image.SinglePixelPackedSampleModel;

public class SigletonClassExample {

    private static SigletonClassExample singletonClassDemoEx = new SigletonClassExample();

    private SigletonClassExample(){

    }

    public static SigletonClassExample getSignleTonClassExample(){
        if (singletonClassDemoEx == null){
            singletonClassDemoEx = new SigletonClassExample();
        }
        return singletonClassDemoEx;
    }
}
