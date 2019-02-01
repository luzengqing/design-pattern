package org.java.p06_proxy.extend03_jdk_dynamic_proxy;

/**
 * Created by louis on 2018/3/24.
 * 真实角色（被代理对象）
 */
public class GamePlayer implements IGamePlayer  {

    private String name;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String username, String password) {
        System.out.println(this.name+"登录了游戏, 用户名："+username+"密码: "+password);
    }

    @Override
    public void kill() {
        System.out.println(this.name+"在狂杀怪。。。");
    }

    @Override
    public void update() {

        System.out.println(this.name+"又升一级了！");
    }
}
