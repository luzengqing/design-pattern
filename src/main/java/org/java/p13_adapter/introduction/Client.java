package org.java.p13_adapter.introduction;

import org.junit.Test;

/**
 * Created by lzq on 2018/4/2.
 */
public class Client {


    @Test
    public void t1() {
        //没有与外界系统关联
        IUserInfo userInfo = new UserInfo();
        String homeAddress = userInfo.getHomeAddress();
    }

    @Test
    public void t2() {
        //调用劳务公司的系统数据
        IUserInfo userInfo = new OuterUserInfo();
        userInfo.getHomeTelNumber();
    }
}
