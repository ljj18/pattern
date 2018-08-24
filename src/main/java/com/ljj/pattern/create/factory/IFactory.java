/**
 * 文件名称:          		IFactory.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.create.factory;

import com.ljj.pattern.create.factory.view.IView;

/**
 * 抽像工厂方法模式
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-23 17:33
 * 
 */
public interface IFactory {
    IView create();
}
