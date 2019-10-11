package org.java.p10_responsibility_chain.netty;

public interface ChannelHandlerContext {

    Channel channel();

    ChannelHandler handler();

    /**
     * 丢给下一个上下文去处理
     * @param msg 消息
     * @return 下一个上下文
     */
    ChannelHandlerContext nextHandle(Object msg);

}
