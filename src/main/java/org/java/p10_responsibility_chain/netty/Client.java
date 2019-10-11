package org.java.p10_responsibility_chain.netty;

public class Client {

    public static void main(String[] args) {

        /**
         * 责任链在Netty的应用
         * Channel：通道、连接
         * Pipeline：管道、责任链
         * 一条连接对应着一个Channel，这个Channel的所有处理逻辑都封装在Pipeline中。
         * Pipeline是一个双向链表结构
         * Channel与Pipeline是一一对应的
         */


        // 创建一个通道
        Channel channel = new DefaultChannel("管道A");
        // 向该通道的管道中添加几个逻辑处理器
        channel.pipeline().addLast(new ChannelHandlerA());
        channel.pipeline().addLast(new ChannelHandlerB());
        channel.pipeline().addLast(new ChannelHandlerC());

        channel.pipeline().handle("Hello World");

    }


    static class ChannelHandlerA extends AbstractChannelHandlerAdapter {

        @Override
        public void handle(ChannelHandlerContext context, Object msg) {
            System.out.println("handlerA 处理..." + msg.toString());
            super.handle(context, msg);
        }
    }
    static class ChannelHandlerB extends AbstractChannelHandlerAdapter {

        @Override
        public void handle(ChannelHandlerContext context, Object msg) {
            System.out.println("handlerB 处理..." + msg.toString());
            super.handle(context, msg);
        }
    }
    static class ChannelHandlerC extends AbstractChannelHandlerAdapter {

        @Override
        public void handle(ChannelHandlerContext context, Object msg) {
            System.out.println("handlerC 处理..." + msg.toString());
            super.handle(context, msg);
        }
    }
}
