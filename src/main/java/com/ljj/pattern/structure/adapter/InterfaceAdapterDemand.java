/**
 * 文件名称:          		InterfaceAdapter.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.adapter;

/**
 * 接口适配：
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-08-24 12:09
 * 
 */
public class InterfaceAdapterDemand extends AbstractIAdapter {

    /**
     * 
     */
    public boolean method() {
        System.out.println("InterfaceAdapterDemand method");
        return false;
    }
}
