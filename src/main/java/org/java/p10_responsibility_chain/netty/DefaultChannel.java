package org.java.p10_responsibility_chain.netty;

public class DefaultChannel implements Channel {

    String name;
    ChannelPipeline pipeline;

    public DefaultChannel(String name) {
        this.name = name;
        this.pipeline = new DefaultChannelPipeline(this);
    }

    @Override
    public ChannelPipeline pipeline() {
        return pipeline;
    }

    @Override
    public String getName() {
        return name;
    }
}
