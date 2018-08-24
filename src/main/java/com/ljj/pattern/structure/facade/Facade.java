/**
 * 文件名称:          		Facade.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.facade;

/**
 * 外观模式：为了解决类与类之家的依赖关系的，像spring一样，可以将类和类之间的关系配置到配置文件中，而外观模式就是将他们的关系放在一个Facade类中，降低了类类之间的耦合度
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-08-24 16:16
 * 
 */
public class Facade {
    
    /**
     * 
     */
    public void facade() {
        Computer computer = new Computer();
        System.out.println("start computer");
        computer.startUp();
        System.out.println("shutdown computer");
        computer.shutdown();
    }
}
