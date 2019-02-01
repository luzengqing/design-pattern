package org.java.p10_responsibility_chain.improvement;


/**
 * Created by lzq on 2018/3/27.
 * 具有控制权的节点接口
 */
public interface IHandler {

    /**
     * 处理一个女性的请求
     * @param women
     */
    void handleMessage(IWomen women);

    /**
     * 做出自己的响应
     * @param women
     */
    void response(IWomen women);

    /**
     * 责任传递，设置自己的下一个处理人
     * @param handler
     */
    void setNext(IHandler handler);

}
