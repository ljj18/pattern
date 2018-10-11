/**
 * 文件名称:          		IVisitor.java
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
public interface IVisitor {
    /**
     * 
     * @param sub
     */
    void visit(ISubject sub); 
}
