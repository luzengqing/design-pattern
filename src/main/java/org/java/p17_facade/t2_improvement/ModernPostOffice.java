package org.java.p17_facade.t2_improvement;

/**
 * Created by lzq on 2018/4/4.
 * 现代邮局
 */
public class ModernPostOffice {

    //邮局负责处理邮递过程
    private ILetterProcess letterProcess = new LetterProcess();


    //写信，封装，投递，一体化
    public void sendLetter(String context,String address) {
        //帮你写信
        letterProcess.writeContext(context);
        //写好信封
        letterProcess.fillEnvelope(address);
        //把信放到信封中
        letterProcess.letterIntoEnvelope();
        //邮递信件
        letterProcess.sendLetter();
    }
}
