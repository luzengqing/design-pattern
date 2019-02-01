package org.java.p04_template_method;

import org.java.p05_builder.AbstractCar;
import org.java.p05_builder.AudiCar;
import org.java.p05_builder.BMWCar;
import org.junit.Test;

/**
 * Created by lzq on 2018/3/22.
 */
public class Client {


    @Test
    public void t1() {
        //创建两个汽车模型
        AbstractCar car1 = new BMWCar();
        AbstractCar car2 = new AudiCar();
        //执行模板方法
        car1.run();
        car2.run();

    }

    @Test
    public void t2() {
        Model h1 = new ModelH1();
        Model h2 = new ModelH2();

        h1.templateMethod();
        h2.templateMethod();
    }
}
