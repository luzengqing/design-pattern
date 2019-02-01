package org.java.p19_visitor.t3_definition;

import org.junit.Test;

/**
 * Created by lzq on 2018/4/6.
 */
public class Client {



    @Test
    public void t1() {

        //拉出一个访问
        Visitor visitor = new Visitor();

        for (int i = 0; i < 10; i++) {
            //产生对象
            Element element = ObjectStructure.createElement();
            //接受访问者对她的访问
            element.accept(visitor);
        }
    }
}
