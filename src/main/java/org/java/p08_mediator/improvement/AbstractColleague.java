package org.java.p08_mediator.improvement;

/**
 * Created by lzq on 2018/3/26.
 */
public abstract class AbstractColleague implements Colleague{

    //同事类角色必须关联中介者
    protected Mediator mediator;

    public AbstractColleague(Mediator broker) {
        this.mediator = broker;
    }
}
