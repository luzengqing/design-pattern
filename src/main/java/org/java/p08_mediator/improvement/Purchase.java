package org.java.p08_mediator.improvement;

/**
 * Created by lzq on 2018/3/26.
 * 采购管理
 */
public class Purchase extends AbstractColleague {

    //通过构造函数，关联中介者
    public Purchase(Mediator broker) {
        super(broker);
    }

    //依赖方法， 必须要通过中介者完成
    public void buyIBMComputer(int number) {
        //牵扯到其他模块关联太多，交由中介者去处理
        this.mediator.execute(BehaviorEnum.PURCHASE, number);
    }


    //自有方法，改变对象本身的状态，处理自己的行为
    //与其他的同事类或中介者没有任何的依赖
    public void refuseBuyIBM(){
        System.out.println("不再采购IBM电脑");
    }
}
