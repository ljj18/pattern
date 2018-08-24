/**
 * 文件名称:          		AdapterTest.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.adapter;

import org.junit.Test;

import com.ljj.pattern.BaseCase;

/**
 * TODO: 文件注释
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-08-24 11:55
 * 
 */
public class AdapterTest extends BaseCase {

    @ Test
    public void testClassAdapter() {
        System.out.println("类适配器");
        IAdapter adapter = new ClassAdapter();
        adapter.method();
        adapter.newMethod();
    }

    @ Test
    public void testWrapperAdapter() {
        System.out.println("对象适配器");
        IAdapter adapter = new WrapperAdapter(new DemandAdapter());
        adapter.method();
        adapter.newMethod();
    }

    @ Test
    public void testInterfaceAdapter() {
        System.out.println("接口适配器 - new");
        IAdapter adapterNew = new InterfaceAdapterNew();
        adapterNew.method();
        adapterNew.newMethod();
        System.out.println("接口适配器 - source");
        IAdapter adapterSource = new InterfaceAdapterDemand();
        adapterSource.method();
        adapterSource.newMethod();
    }

}
