package org.java.p10_responsibility_chain.netty;

public interface Channel {

    // 返回该连接(通道)的管道（责任链）
    ChannelPipeline pipeline();

    String getName();
}
