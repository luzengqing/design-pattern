package org.java.p10_responsibility_chain.definition;

/**
 * Created by lzq on 2018/3/27.
 * 责任链的一个处理节点
 */
public class ConcreteHandler2 extends AbstractHandler {


    public ConcreteHandler2(Level level) {
        super(level);
    }

    @Override
    public Response doEcho(Request request) {
        //针对该级别的请求自己做业务处理
        return null;
    }
}
