/**
 * 文件名称:          		PageView.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.create.factory.view;

/**
 * Leaf View
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-23 16:47
 * 
 */
public class LeafView extends AbstractView {

    @ Override
    public int getType() {
        return IView.COLUMN_VIEW;
    }

    @ Override
    public void doLayout() {
        setX(10);
        setY(10);
        setWidth(50);
        setHeight(100);
        System.out.println("布局 leaf 视图：" + toString());
    }

}
