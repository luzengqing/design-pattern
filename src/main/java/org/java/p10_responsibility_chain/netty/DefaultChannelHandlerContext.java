package org.java.p10_responsibility_chain.netty;

public class DefaultChannelHandlerContext extends AbstractChannelHandlerContext {


    public DefaultChannelHandlerContext(ChannelPipeline pipeline, ChannelHandler handler) {

        this.pipeline = pipeline;
        this.handler = handler;
    }


}
