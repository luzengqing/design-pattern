package org.java.p13_adapter.definition;

/**
 * Created by lzq on 2018/4/3.
 * 目标角色
 * 该角色定义把其他类转换为何种接口，也就是我们的期望接口
 * 目标角色是一个已经在正式运行的角色，你不可能去修改角色中的方法，你能做的就是
 如何去实现接口中的方法，而且通常情况下，目标角色是一个接口或者是抽象类，一般不会
 是实现类
 */
public interface Target {

    //目标角色有自己的方法
    void request();
}
