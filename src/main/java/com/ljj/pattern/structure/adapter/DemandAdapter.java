/**
 * 文件名称:          		BaseMethod.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.adapter;

/**
 * 需要适配的类
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-24 11:43
 * 
 */
public class DemandAdapter {
    public boolean method() {
        System.out.println("DemandAdapter method");
        return true;
    }
}
