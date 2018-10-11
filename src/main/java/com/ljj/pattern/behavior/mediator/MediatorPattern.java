/**
 * 文件名称:          		MediatorPattern.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.mediator;

/**
 * 中介者模式也是用来降低类类之间的耦合
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-10-11 15:11
 * 
 */
public class MediatorPattern {

    public void mediator() {
        IMediator mediator = new MediatorImpl();  
        mediator.createMediator();  
        mediator.workAll();  
    }
}
