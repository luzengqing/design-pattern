package org.java.p10_responsibility_chain.introduction;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by lzq on 2018/3/27.
 */
public class Client {


    @Test
    public void t1() {

        Random random = new Random();
        List<IWomen> list = new ArrayList<>();
        //随机产生几个状况的女性
        for (int i = 0; i < 3; i++) {
            list.add(new Women(random.nextInt(4), "我要出去逛街"));
        }

        //定义三个请示对象
        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();


        for (IWomen women : list) {
            if (women.getType() == 1) {
                System.out.println("--------女儿向父亲请示-------");
                father.handleMessage(women);
            }
            else if (women.getType() == 2) {
                System.out.println("--------妻子向丈夫请示-------");
                husband.handleMessage(women);
            }
            else if (women.getType() == 3) {
                System.out.println("--------母亲向儿子请示-------");
                son.handleMessage(women);
            }
            else {
                System.out.println("--------妇女什么也不请示-------");
                //什么也不做
            }
        }


        /**
         * 问题：
         * 1.职责界定不清晰
         * 原本Father类应该是知道女儿的请求自己处理，而不是在Client类中进行组装出来，也就是说
         原本应该是父亲这个类做的事情抛给了其他类进行处理
         2.代码臃肿
            以后对于请示的节点越来越多，那么if-else判断也越多，与开闭原则不符合
         3.异常情况欠考虑
         女儿像父亲提出请示，父亲该怎么办？ 父亲如果不能正常处理，应该指定出下一个处理的节点，程序没有体现
         */

        /**
         * 解决思路：
         * 每个节点应根据妇女的个人状况，做相应的判断，符合我的要求就做处理，不符合转接给下一个节点，
         * 也就是说，妇女提出一个请示，有且只有一个节点给出处理，并且得到唯一的答复，想成一条责任链。
         *
         * 可以抽象出这样的结构：女性的请求先发送到父亲类，父亲类一看是自己要处理的，就
         作出回应处理，如果女儿已经出嫁了，那就要把这个请求转发到女婿来处理，那女婿一旦去
         天国报道了，那就由儿子来处理这个请求。。
         */
    }
}
