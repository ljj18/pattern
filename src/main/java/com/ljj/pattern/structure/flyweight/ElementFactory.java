/**
 * 文件名称:          		ViewFactory.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.flyweight;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-24 17:13
 * 
 */
public class ElementFactory {
    
    /**
     * 
     * @param name
     * @return
     */
    public Element create(String name) {
        return new Element(name);   
    }
    
}
