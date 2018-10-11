/**
 * 文件名称:          		VisitorImpl.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.visitor;

/**
 * TODO: 文件注释
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-10-11 14:50
 * 
 */
public class VisitorImpl implements IVisitor {
    
    public void visit(ISubject sub) {
        System.out.println("visit the subject：" + sub.getSubject());
    }
}
