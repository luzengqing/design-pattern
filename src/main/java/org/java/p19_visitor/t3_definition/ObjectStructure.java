package org.java.p19_visitor.t3_definition;

import java.util.Random;

/**
 * Created by lzq on 2018/4/6.
 * 结构数据
 */
public class ObjectStructure {

    //对象生成器，通过静态工厂方法模拟产生
    public static Element createElement() {
        Random random = new Random();
        if(random.nextInt(100) > 50){
            return new ConcreteElement1();
        }else{
            return new ConcreteElement2();
        }
    }
}
