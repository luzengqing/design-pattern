package org.java.p10_responsibility_chain.netty;

public class TailChannelHandlerContext extends AbstractChannelHandlerContext implements ChannelHandler {

    public TailChannelHandlerContext(ChannelPipeline pipeline) {
        this.pipeline = pipeline;
    }

    @Override
    public ChannelHandler handler() {
        return this;
    }

    @Override
    public void handle(ChannelHandlerContext context, Object msg) {
        // do nothing
    }
}
