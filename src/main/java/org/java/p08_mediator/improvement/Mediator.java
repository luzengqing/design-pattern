package org.java.p08_mediator.improvement;

/**
 * Created by lzq on 2018/3/26.
 * 中介者
 */
public interface Mediator {

    /**
     * 中介者的事件方法
     * @param behaviorEnum 行为
     * @param objects 参数
     */
    void execute(BehaviorEnum behaviorEnum, Object... objects);

}
