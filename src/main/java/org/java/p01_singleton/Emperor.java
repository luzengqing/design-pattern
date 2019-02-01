package org.java.p01_singleton;

/**
 * Created by lzq on 2018/3/21.
 * 单例模式
 */
public class Emperor {

    //皇帝只能有1个（饿汉模式，一开始就创建好）
    private static final Emperor emperor = new Emperor();

    //不让外界再创建皇帝
    private Emperor() {
    }

    //给外界提供一个途径，可以访问这有且仅有的一个皇帝
    public static Emperor getEmperor() {
        return emperor;
    }

    public void say() {
        System.out.println("我是皇帝 某某某[hash:"+this.hashCode()+"]");
    }

}
