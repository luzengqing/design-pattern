package org.java.p06_proxy.extend02_compulsive_proxy;

/**
 * Created by lzq on 2018/3/23.
 * 游戏玩家抽象接口
 */
public interface IGamePlayer {

    /**
     * 游戏登录
     * @param username
     * @param password
     */
    void login(String username, String password);

    /**
     * 打怪
     */
    void kill();

    /**
     * 升级
     */
    void levelUpdate();

    /**
     * 获取玩家自己的代理对象
     * @return 代理
     */
    IGamePlayer getProxy();
}
