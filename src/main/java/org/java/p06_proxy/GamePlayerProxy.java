package org.java.p06_proxy;

/**
 * Created by lzq on 2018/3/23.
 * 游戏代练者（代理）
 * 代理就像现实中的游戏代练，代理律师。他去帮被代理角色去完成相应的任务
 */
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer;

    //通过构造函数传递要对谁进行代练
    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
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
