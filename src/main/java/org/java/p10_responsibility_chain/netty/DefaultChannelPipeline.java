package org.java.p10_responsibility_chain.netty;

public class DefaultChannelPipeline implements ChannelPipeline {

    Channel channel;

    final AbstractChannelHandlerContext head;
    final AbstractChannelHandlerContext tail;

    public DefaultChannelPipeline(Channel channel) {
        this.channel = channel;
        head = new HeadChannelHandlerContext(this);
        tail = new TailChannelHandlerContext(this);

        head.next = tail;
        tail.prev = head;
    }

    @Override
    public Channel channel() {
        return channel;
    }

    @Override
    public ChannelPipeline addLast(ChannelHandler handler) {
        // 先将handler封装成context，然后将context添加到管道中
        AbstractChannelHandlerContext newContext = newContext(handler);
        addLast0(newContext);
        return this;
    }

    @Override
    public ChannelPipeline handle(Object msg) {
        // 从管道的头结点开始依次顺序执行
        AbstractChannelHandlerContext.invokeHandle(head, msg);
        return this;
    }


    AbstractChannelHandlerContext newContext(ChannelHandler handler) {
        AbstractChannelHandlerContext context = new DefaultChannelHandlerContext(this, handler);
        return context;
    }

    private void addLast0(AbstractChannelHandlerContext newCtx) {
        AbstractChannelHandlerContext prev = tail.prev;
        newCtx.prev = prev;
        newCtx.next = tail;
        prev.next = newCtx;
        tail.prev = newCtx;
    }

}
