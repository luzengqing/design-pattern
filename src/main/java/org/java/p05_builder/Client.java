package org.java.p05_builder;

        import org.junit.Test;

/**
 * Created by lzq on 2018/3/22.
 */
public class Client {

    @Test
    public void t1() {
        //拉出导演
        Director director = new Director();

        //给我制造不同类型的车
        //不同的车，模板方法执行的顺序也大不相同
        AbstractCar audiModelA = director.getAudiModelB();

        AbstractCar bmwModelB = director.getBMWModelA();
        audiModelA.run();
        bmwModelB.run();

    }
}
