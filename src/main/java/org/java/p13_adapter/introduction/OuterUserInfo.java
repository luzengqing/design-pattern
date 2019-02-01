package org.java.p13_adapter.introduction;

/**
 * Created by lzq on 2018/4/2.
 * 中转角色
 * 实现了IUserInfo接口，还继承了OuterUser
 * 把OuterUser伪装成我们系统中一个IUserInfo对象，这
 样，我们的系统基本不用修改，所有的人员查询、调用跟本地一样。
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {

    @Override
    public String getUserName() {
        String userName = this.getUserBaseInfo().get("userName");
        System.out.println(userName);
        return userName;
    }

    @Override
    public String getHomeAddress() {
        String homeAddress = this.getUserHomeInfo().get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber = this.getUserBaseInfo().get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    @Override
    public String getOfficeTelNumber() {
        String officeTelNumber = this.getUserOfficeInfo().get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }

    @Override
    public String getJobPosition() {
        String jobPosition = this.getUserOfficeInfo().get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    @Override
    public String getHomeTelNumber() {
        String homeTelNumbner = this.getUserHomeInfo().get("homeTelNumbner");
        System.out.println(homeTelNumbner);
        return homeTelNumbner;
    }
}
