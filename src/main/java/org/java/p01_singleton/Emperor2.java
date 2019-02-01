package org.java.p01_singleton;

/**
 * Created by lzq on 2018/3/21.
 * 单例模式-懒汉式
 */
public class Emperor2 {

    private static Emperor2 emperor2;

    private Emperor2(){
    }

    //多线程安全
    public static Emperor2 getEmperor2() {
        //为了速度
        if (emperor2 == null) {
            synchronized (Emperor2.class) {
                //为了安全性
                if (emperor2 == null) {
                    emperor2 = new Emperor2();
                }
            }
        }
        return emperor2;
    }

    public void say() {
        System.out.println("我是皇帝 某某某[hash:"+this.hashCode()+"]");
    }
}
