/**
 * 文件名称:          		ISubject.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.visitor;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-10-11 14:48
 * 
 */
public interface ISubject {

    /**
     * 
     * @param visitor
     */
    public void accept(IVisitor visitor);  
    /**
     * 
     * @return
     */
    public String getSubject();
}
