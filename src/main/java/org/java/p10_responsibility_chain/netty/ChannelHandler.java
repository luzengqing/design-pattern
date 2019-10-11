package org.java.p10_responsibility_chain.netty;

public interface ChannelHandler {

    /**
     * 处理一部分逻辑
     * @param context 该handler所处的上下文
     * @param msg 处理的消息
     */
    void handle(ChannelHandlerContext context, Object msg);
}
