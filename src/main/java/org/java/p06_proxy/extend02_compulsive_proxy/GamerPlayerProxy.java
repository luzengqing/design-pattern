package org.java.p06_proxy.extend02_compulsive_proxy;

/**
 * Created by lzq on 2018/3/23.
 */
public class GamerPlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer;

    //通过构造函数指定要代理的真实角色
    public GamerPlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    //代练登录
    @Override
    public void login(String username, String password) {
        this.gamePlayer.login(username, password);
    }

    //代练杀怪
    @Override
    public void kill() {
        this.gamePlayer.kill();
    }

    //代练升级
    @Override
    public void levelUpdate() {
        this.gamePlayer.levelUpdate();
    }

    @Override
    public IGamePlayer getProxy() {
        //代理角色的代理返回她本身
        return this;
    }
}
