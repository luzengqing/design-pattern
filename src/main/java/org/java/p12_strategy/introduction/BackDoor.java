package org.java.p12_strategy.introduction;

/**
 * Created by lzq on 2018/3/29.
 * 妙计一： 乔国老开后门
 */
public class BackDoor implements IStrategy {


    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }
}
