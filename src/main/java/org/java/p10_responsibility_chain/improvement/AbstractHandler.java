package org.java.p10_responsibility_chain.improvement;

/**
 * Created by lzq on 2018/3/27.
 */
public abstract class AbstractHandler implements IHandler {


    //自己的处理等级
    protected int level;

    //自己的下一个责任人
    protected IHandler nextHandler;

    //强制子类声明能处理哪些请求
    public AbstractHandler(int level) {
        this.level = level;
    }

    /**
     * 女性有吃饭，逛街，看电影请求，自己要处理这个请求
     * 这也是个模板方法，给出一个通用的流程，如果女生的状况和自己的处理能力相同，则调用基本方法，否则给下一个
     * @param women
     */
    @Override
    public void handleMessage(IWomen women) {
        if (this.level == women.getType()) {
            //符合自己的要求，自己来处理
            this.response(women);
        }
        else {
            if (this.nextHandler != null) {
                //告诉下一个负责人去处理请求
                this.nextHandler.handleMessage(women);
            }
            else {
                System.out.println("我是最后一个负责人了，后面没有人可处理了。。。");
            }
        }
    }

    /*
     * 如果不属于自己处理的请求，应该让她找下一个环节的人，如女儿出嫁了，
     * 还向父亲请示是否可以逛街，那父亲就应该告诉女儿，应该找丈夫请示
     */
    @Override
    public void setNext(IHandler handler) {
        this.nextHandler = handler;
    }
}
