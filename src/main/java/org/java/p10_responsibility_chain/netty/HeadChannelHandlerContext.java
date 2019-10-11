package org.java.p10_responsibility_chain.netty;

public class HeadChannelHandlerContext extends AbstractChannelHandlerContext implements ChannelHandler {

    public HeadChannelHandlerContext(ChannelPipeline pipeline) {
        this.pipeline = pipeline;
    }

    @Override
    public ChannelHandler handler() {
        // 头结点不处理任何内容，直接把自己返回
        return this;
    }

    @Override
    public void handle(ChannelHandlerContext context, Object msg) {
        context.nextHandle(msg);
    }
}
