/**
 * 文件名称:          		Soruce.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.decorator;

/**
 * 
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-24 14:05
 * 
 */
public class Source implements IDecorator {

    @ Override
    public void method() {
        System.out.println("Soruce, this to bo Decorator");
    }

}
