package org.java.p12_strategy.introduction;

/**
 * Created by lzq on 2018/3/29.
 * 妙计二： 吴国太开绿灯
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开绿灯,放行！");
    }
}
