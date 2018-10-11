/**
 * 文件名称:          		MediatorImpl.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.mediator;

/**
 * TODO: 文件注释
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-10-11 15:12
 * 
 */
public class MediatorImpl implements IMediator {

    private AbstractUser vipUser;
    private AbstractUser normalUser;

    public AbstractUser getVipUser() {
        return vipUser;
    }

    public AbstractUser getNormalUser() {
        return normalUser;
    }

    @ Override
    public void createMediator() {
        vipUser = new VipUser(this);
        normalUser = new NormalUser(this);
    }

    @ Override
    public void workAll() {
        normalUser.work();
        vipUser.work();
    }
}
