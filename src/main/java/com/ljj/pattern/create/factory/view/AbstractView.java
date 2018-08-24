/**
 * 文件名称:          		AbstractView.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.create.factory.view;

/**
 * TODO: 文件注释
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-08-23 16:32
 * 
 */
public abstract class AbstractView implements IView {

    
    
    /**
     * @return Returns the x.
     */
    public float getX() {
        return x;
    }
    /**
     * @param x The x to set.
     */
    public void setX(float x) {
        this.x = x;
    }
    /**
     * @return Returns the y.
     */
    public float getY() {
        return y;
    }
    /**
     * @param y The y to set.
     */
    public void setY(float y) {
        this.y = y;
    }
    /**
     * @return Returns the width.
     */
    public float getWidth() {
        return width;
    }
    /**
     * @param width The width to set.
     */
    public void setWidth(float width) {
        this.width = width;
    }
    /**
     * @return Returns the height.
     */
    public float getHeight() {
        return height;
    }
    /**
     * @param height The height to set.
     */
    public void setHeight(float height) {
        this.height = height;
    }
    
    /** 
     *(non-Javadoc)
     * @see java.lang.Object#toString()
     * 
     */
    @ Override
    public String toString() {
        return "AbstractView [type=" + getType() + ", x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
    }
    
    private float x; 
    private float y;
    private float width;
    private float height;
}
