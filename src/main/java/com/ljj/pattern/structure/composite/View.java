/**
 * 文件名称:          		View.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-24 16:46
 * 
 */
public class View {
    /**
     * 视图名称
     */
    private String name;
    /**
     * 父视图
     */
    private View parent;
    /**
     * 子视图
     */
    private List<View> children ;
    
    /**
     * 
     */
    private boolean free;
    
    /**
     * 
     * @param name
     */
    public View(String name) {
        this.name = name;
        children = new ArrayList<View>();
    }
    
    /**
     * @return Returns the name.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * @return Returns the parent.
     */
    public View getParent() {
        return parent;
    }

    /**
     * 
     * @param v
     */
    public void setParent(View v) {
        this.parent = v;
    }
    
    /**
     * 
     * @param v
     */
    public void add(View v) {
        if (v != null) {
            children.add(v);
            v.setParent(this);
        }
    }

    public boolean remove(View v) {
        if (children.remove(v)) {
            v.setParent(null);
            v.setFree(true);
            return true;
        }
        return false;
    }
    
    /**
     * @return Returns the free.
     */
    public boolean isFree() {
        return free;
    }

    /**
     * @param free The free to set.
     */
    public void setFree(boolean free) {
        this.free = free;
    }
    
    /** 
     *(non-Javadoc)
     * @see java.lang.Object#toString()
     * 
     */
    @ Override
    public String toString() {
        return "View [name=" + name  + ", children=" + children + "]";
    }

    
}
