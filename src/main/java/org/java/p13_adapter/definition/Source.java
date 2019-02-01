package org.java.p13_adapter.definition;

/**
 * Created by lzq on 2018/4/3.
 * 源角色
 * 你想把谁转换成目标角色，这个“谁”就是源角色，它是已经存在的、运行良好的类或对
 象，经过适配器角色的包装，它会成为一个崭新、靓丽的角色。
 */
public class Source {

    //原有的业务逻辑
    public void doSomething(){
        System.out.println("I'm kind of busy,leave me alone,pls!");
    }
}
