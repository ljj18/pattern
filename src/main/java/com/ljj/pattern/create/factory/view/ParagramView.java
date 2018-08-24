/**
 * 文件名称:          		PageView.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.create.factory.view;

/**
 * 段落视图
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-23 16:47
 * 
 */
public class ParagramView extends AbstractView {

    @ Override
    public int getType() {
        return IView.COLUMN_VIEW;
    }

    @ Override
    public void doLayout() {
        setX(10);
        setY(10);
        setWidth(300);
        setHeight(300);
        System.out.println("布局 段落 视图：" + toString());
    }

}
