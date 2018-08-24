/**
 * 文件名称:          		PageFactory.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.create.factory;

import com.ljj.pattern.create.factory.view.IView;
import com.ljj.pattern.create.factory.view.RootView;

/**
 * 抽像工作实现
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-08-23 17:36
 * 
 */
public class RootFactory implements IFactory {

    @ Override
    public IView create() {
        return new RootView();
    }
}
