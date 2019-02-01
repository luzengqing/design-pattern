package org.java.p06_proxy.extend04_cglib_dynamic_proxy;

/**
 * Created by louis on 2018/3/24.
 * 目标对象（被代理对象），不实现接口
 */
public class GamePlayer {


    private String name;


    public GamePlayer() {
    }

    public GamePlayer(String name) {
        this.name = name;
    }

    public void login(String username, String password) {
        System.out.println(this.name+"登录了游戏, 用户名："+username+"密码: "+password);
    }

    public void kill() {
        System.out.println(this.name+"在狂杀怪。。。");
    }

    public void update() {

        System.out.println(this.name+"又升一级了！");
    }


}
