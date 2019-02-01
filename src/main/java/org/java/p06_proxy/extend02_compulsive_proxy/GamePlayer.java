package org.java.p06_proxy.extend02_compulsive_proxy;



/**
 * Created by lzq on 2018/3/23.
 * 真实角色
 */
public class GamePlayer implements IGamePlayer {

    private String name;

    //指定自己的代理是谁，必须通过代理才能访问自己
    private IGamePlayer proxy;


    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String username, String password) {
        if (this.hasProxy()) {
            System.out.println(this.name+"登录了游戏，用户名："+username+",密码："+password);
        } else {
            System.out.println("目前无权限操作登录，请使用指定的代理访问");
        }

    }

    @Override
    public void kill() {
        if (this.hasProxy()) {
            System.out.println(this.name+"在狂杀怪。。。");
        } else {
            System.out.println("目前无权限操作杀怪，请使用指定的代理访问");
        }
    }

    @Override
    public void levelUpdate() {
        if (this.hasProxy()) {
            System.out.println(this.name+"在狂升级，一刀一级。。。");
        } else {
            System.out.println("目前无权限操作升级，请使用指定的代理访问");
        }

    }

    //找到自己的代理
    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamerPlayerProxy(this);
        return this.proxy;
    }

    //检验代理是否能访问
    private boolean hasProxy() {
        return this.proxy != null;
    }



}
