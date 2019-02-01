package org.java.p17_facade.t2_improvement;

import org.junit.Test;

/**
 * Created by lzq on 2018/4/4.
 */
public class Client {


    @Test
    public void t1() {
        //现代化的邮局，有这项服务，邮局名称叫Hell Road
        ModernPostOffice modernPostOffice = new ModernPostOffice();
        //你只要把信的内容和收信人地址给他，他会帮你完成一系列的工作
        //定义一个地址
        String address = "Happy Road No. 666,God Province,Heaven";
        //信的内容
        String context = "Hello,It's me,do you know who I am? I'm your old lover. //你给我发送吧";
        modernPostOffice.sendLetter(context, address);
    }
}
