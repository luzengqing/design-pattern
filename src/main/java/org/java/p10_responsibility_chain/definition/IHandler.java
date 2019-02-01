package org.java.p10_responsibility_chain.definition;



/**
 * Created by lzq on 2018/3/27.
 * 处理请求的接口
 */
public interface IHandler {

    /**
     * 处理一个请求
     * @param request
     */
    Response handleRequest(Request request);

    /**
     * 责任传递，设置自己的下一个处理人
     * @param handler
     */
    void setNext(IHandler handler);

}
