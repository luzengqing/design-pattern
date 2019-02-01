package org.java.p06_proxy;

/**
 * Created by lzq on 2018/3/23.
 * 业务实现类
 */
public class GamePlayer implements IGamePlayer {

    private String name;


    public GamePlayer() {
    }

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String username, String password) {
        System.out.println(this.name+"登录了游戏，用户名："+username+",密码："+password);

    }

    @Override
    public void kill() {
        System.out.println(this.name+"在狂打怪。。。");
    }

    @Override
    public void levelUpdate() {
        System.out.println(this.name+"在狂升级，一刀一级。。。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
