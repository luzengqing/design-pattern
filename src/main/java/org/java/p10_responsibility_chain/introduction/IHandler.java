package org.java.p10_responsibility_chain.introduction;

/**
 * Created by lzq on 2018/3/27.
 * 具有控制权的节点接口
 */
public interface IHandler {

    //针对该女性处理消息
    void handleMessage(IWomen women);
}
