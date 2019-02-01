package org.java.p10_responsibility_chain.definition;

/**
 * Created by lzq on 2018/3/27.
 */
public abstract class AbstractHandler implements IHandler {

    /**
     * 责任链的职责：
     * 1.定义处理请求的方法 handleRequest
     * 2.定义一个链的编排方法 nextHandler
     * 3.定义一个自己能够处理级别的具体方法 doEcho,具体子类去实现
     */

    //自己能够处理请求的级别
    protected Level level;

    //下一个责任人
    protected IHandler nextHandler;

    public AbstractHandler(Level level) {
        this.level = level;
    }

    //模板方法，父类实现请求的传递功能
    @Override
    public Response handleRequest(Request request) {
        if (this.level.getLevel().equals(request.getLevel().getLevel())) {
            //请求对象的级别符合自己能够处理的级别，自己做反应处理
            return this.doEcho(request);
        } else {
            if (this.nextHandler != null) {
                //交由下一个责任人处理
                return this.nextHandler.handleRequest(request);
            } else {
                System.out.println("自己最后一个了，后面没人处理了。。。。");
                return null;
            }
        }
    }

    @Override
    public void setNext(IHandler handler) {
        this.nextHandler = handler;
    }

    /**
     * 请求具体处理交由子类完成
     * @param request
     * @return
     */
    protected abstract Response doEcho(Request request);





    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }


}
