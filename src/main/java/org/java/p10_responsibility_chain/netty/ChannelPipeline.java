package org.java.p10_responsibility_chain.netty;

public interface ChannelPipeline {

    // 返回该管道(责任链)的通道（连接）
    Channel channel();

    // 将该handler添加到该管道的尾部，也就是添加到责任链的尾部
    ChannelPipeline addLast(ChannelHandler handler);

    // 管道处理一个消息
    ChannelPipeline handle(Object msg);


}
