/**
 * 文件名称:          		Account.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.observer;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-10-09 11:24
 * 
 */
public class Account implements IUpdate{

    @ Override
    public boolean update() {
        System.out.println("update account.............");
        return true;
    }

}
