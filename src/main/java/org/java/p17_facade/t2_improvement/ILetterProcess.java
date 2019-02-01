package org.java.p17_facade.t2_improvement;

/**
 * Created by lzq on 2018/4/4.
 * 邮件处理接口
 */
public interface ILetterProcess {

    //首先要写信的内容
    void writeContext(String context);
    //其次写信封
    void fillEnvelope(String address);
    //把信放到信封里
    void letterIntoEnvelope();
    //然后邮递
    void sendLetter();
}
