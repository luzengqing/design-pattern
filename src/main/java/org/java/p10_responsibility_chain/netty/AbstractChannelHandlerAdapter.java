package org.java.p10_responsibility_chain.netty;

public abstract class AbstractChannelHandlerAdapter implements ChannelHandler {



    @Override
    public void handle(ChannelHandlerContext context, Object msg) {
        // 适配器不做任何事情，丢给下一个context
        context.nextHandle(msg);
    }
}
