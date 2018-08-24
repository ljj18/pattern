/**
 * 文件名称:          		Source.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.proxy;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-24 14:43
 * 
 */
public class Source implements IProxy {

    @ Override
    public void method() {
        System.out.println("To be Proxy method");
    }

    public String getName() {
        System.out.println("non interface method");
        return Source.class.getName();
    }
}
