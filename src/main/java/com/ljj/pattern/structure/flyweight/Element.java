/**
 * 文件名称:          		View.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.flyweight;

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
public class Element {
    /**
     * 视图名称
     */
    private String name;
    /**
     * 父视图
     */
    private Element parent;
    /**
     * 子视图
     */
    private List<Element> children ;
    
    /**
     * 
     */
    private boolean free;
    
    /**
     * 
     * @param name
     */
    public Element(String name) {
        this.name = name;
        children = new ArrayList<Element>();
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
    public Element getParent() {
        return parent;
    }

    /**
     * 
     * @param v
     */
    public void setParent(Element v) {
        this.parent = v;
    }
    
    /**
     * 
     * @param v
     */
    public void add(Element v) {
        if (v != null) {
            children.add(v);
            v.setParent(this);
        }
    }

    public boolean remove(Element v) {
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
        return "Element [name=" + name  + ", children=" + children + "]";
    }

    
}
