/**
 * 文件名称:          		IView.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.create.factory.view;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-23 16:25
 * 
 */
public interface IView {

    /**
     * 根据视图
     */
    public static final int ROOT_VIEW = 1;
    /**
     * 页面视图
     */
    public static final int PAGE_VIEW = ROOT_VIEW + 1;
    /**
     * 栏视图
     */
    public static final int COLUMN_VIEW = PAGE_VIEW + 1;
    /**
     * 段落视图
     */
    public static final int PARA_VIEW = COLUMN_VIEW + 1;
    /**
     * 行视图
     */
    public static final int LINE_VIEW = PARA_VIEW + 1;
    /**
     * leaf视图
     */
    public static final int LEAF_VIEW = LINE_VIEW + 1;
        
    /**
     * 
     * @return
     */
    float getX();
    /**
     * 
     * @param x
     */
    void setX(float x);
    /**
     * 
     * @return
     */
    float getY();
    /**
     * 
     * @param x
     */
    void setY(float x);
    /**
     * 
     * @return
     */
    float getWidth();
    /**
     * 
     * @param width
     */
    void setWidth(float width);
    /**
     * 
     * @return
     */
    float getHeight();
    /**
     * 
     * @param height
     */
    void setHeight(float height);
    
    /**
     * 
     * @return
     */
    int getType();
    
    /**
     * 
     */
    void doLayout();
}
