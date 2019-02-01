package org.java.p06_proxy.extend01_common_proxy;


/**
 * Created by lzq on 2018/3/23.
 * 普通代理模式
 */
public class GamePlayerProxy implements IGamePlayer {

    //内部直接持有被代理者
    private IGamePlayer gamePlayer;

    private String name;

    //通过构造函数传递要对谁进行代练
    //调用者只知道代理存在就可以，不用知道代理了谁
    public GamePlayerProxy(String name) {
        this.gamePlayer = new GamePlayer(name);
    }

    //代练登录
    @Override
    public void login(String username, String password) {
        this.gamePlayer.login(username, password);
    }

    //代练打怪
    @Override
    public void kill() {
        this.gamePlayer.kill();
    }

    //代练升级
    @Override
    public void levelUpdate() {
        this.gamePlayer.levelUpdate();
    }


    public IGamePlayer getGamePlayer() {
        return gamePlayer;
    }

    public void setGamePlayer(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }
}
