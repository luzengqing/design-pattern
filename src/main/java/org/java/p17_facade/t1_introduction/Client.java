package org.java.p17_facade.t1_introduction;

import org.junit.Test;

/**
 * Created by lzq on 2018/4/4.
 */
public class Client {

    @Test
    public void t1() {

        //创建一个处理信件的过程
        ILetterProcess letterProcess = new LetterProcess();
        //开始写信
        letterProcess.writeContext("Hello,It's me,do you know who I am? I'm //开始写信封");
        //开始信封
        letterProcess.fillEnvelope("Happy Road No. 666,God Province,Heaven");
        //把信放到信封里，并封装好
        letterProcess.letterIntoEnvelope();
        //跑到邮局把信塞到邮箱，投递
        letterProcess.sendLetter();


        /**
         * 这个过程，它与高内聚的要求相差甚远，更不要说迪米特法则、接口
         隔离原则了。你想想，你要知道这4个步骤，而且还要知道它们的顺序，一旦出错，信就不
         可能邮寄出去，这在面向对象的编程中是极度地不适合，它根本就没有完成一个类所具有的
         单一职责。
         */

        /**
         * 现在邮局开发了一个新业务，你只要把信件的必要信息告诉
         邮局，邮局给你发，邮局来完成这4个过程，只要把信件交给邮局就成了，其他就不要管了。
         */

    }
}
