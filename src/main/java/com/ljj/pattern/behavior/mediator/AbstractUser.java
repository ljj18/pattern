/**
 * 文件名称:          		AbstractUser.java
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
 * Date 2018-10-11 15:02
 * 
 */
public abstract class AbstractUser {

    private IMediator mediator;

    /**
     * 
     * @param mediator
     */
    public AbstractUser(IMediator mediator) {  
        this.mediator = mediator;  
    }
    
    /**
     * 
     * @return
     */
    public IMediator getMediator() {
        return mediator;
    }



    public abstract void work();
}
