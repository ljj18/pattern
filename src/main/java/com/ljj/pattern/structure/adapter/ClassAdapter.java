/**
 * 文件名称:          		ClassAdapter.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.adapter;

/**
 * 适配器模式-类适配:
 * 有一个SourceMehtod类，拥有一个方法，待适配，目标接口时IAdapter，通过ClassAdapter类，将SourceMehtod的功能扩展到IAdapter里
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-08-24 11:33
 * 
 */
public class ClassAdapter extends DemandAdapter implements IAdapter {

    @ Override
    public void newMethod() {
        System.out.println("new method");
    }

}
