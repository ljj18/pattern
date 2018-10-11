/**
 * 文件名称:          		VipUser.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.mediator;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-10-11 15:10
 * 
 */
public class VipUser extends AbstractUser {

    public VipUser(IMediator mediator){  
        super(mediator);  
    }  
      
    @Override  
    public void work() {  
        System.out.println("VipUser exec!");  
    }  
}
