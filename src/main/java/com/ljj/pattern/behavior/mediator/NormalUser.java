/**
 * 文件名称:          		NormalUser.java
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
 * Date			2018-10-11 15:11
 * 
 */
public class NormalUser extends AbstractUser {

    public NormalUser(IMediator mediator){  
        super(mediator);  
    }  
      
    @Override  
    public void work() {  
        System.out.println("NormalUser exec!");  
    }  
}
