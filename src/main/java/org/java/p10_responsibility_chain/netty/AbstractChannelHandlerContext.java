package org.java.p10_responsibility_chain.netty;

public abstract class AbstractChannelHandlerContext implements ChannelHandlerContext{


    AbstractChannelHandlerContext prev;
    AbstractChannelHandlerContext next;

    // context所处的pipeline
    ChannelPipeline pipeline;

    // context包含的handler
    ChannelHandler handler;




    @Override
    public ChannelHandlerContext nextHandle(Object msg) {
        // 找到下一个context，执行一样的方法
        invokeHandle(findNext(), msg);
        return this;
    }



    static void invokeHandle(AbstractChannelHandlerContext next, Object msg) {
        // 获取当前context包含的handler，去执行handler的方法
        next.handler().handle(next, msg);
    }


    AbstractChannelHandlerContext findNext() {
        AbstractChannelHandlerContext context = this;
        context = context.next;
        return context;
    }

    @Override
    public Channel channel() {
        return pipeline.channel();
    }

    @Override
    public ChannelHandler handler() {
        return handler;
    }
}
