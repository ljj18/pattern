/**
 * 文件名称:          		WrapperAdapter.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.adapter;

/**
 * 对象适配器：与类适配器不同在于，类适配是继承，对象适配是封装
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-24 12:02
 * 
 */
public class WrapperAdapter implements IAdapter {

    /**
     * 
     */
    private DemandAdapter demandMethod;
    
    public WrapperAdapter(DemandAdapter sm) {
        this.demandMethod = sm;
    }
    
    @ Override
    public boolean method() {
        return demandMethod.method();
    }

    @ Override
    public void newMethod() {
        System.out.println("new method");
    }

}
