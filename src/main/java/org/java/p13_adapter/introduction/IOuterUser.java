package org.java.p13_adapter.introduction;

import java.util.Map;

/**
 * Created by lzq on 2018/4/2.
 * 劳动服务公司的人员信息接口
 */
public interface IOuterUser {

    //基本信息，比如名称、性别、手机号码等
    Map<String, String> getUserBaseInfo();
    //工作区域信息
    Map<String, String> getUserOfficeInfo();
    //用户的家庭信息
    Map<String, String> getUserHomeInfo();
}
