/**
 * 文件名称:          		PageView.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.create.factory.view;

/**
 * 根视图
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-23 16:47
 * 
 */
public class RootView extends AbstractView {

    @ Override
    public int getType() {
        return IView.PAGE_VIEW;
    }

    @ Override
    public void doLayout() {
        setX(0);
        setY(0);
        setWidth(1280);
        setHeight(Integer.MAX_VALUE / 50);
        System.out.println("布局 根 视图：" + toString());
    }

}
