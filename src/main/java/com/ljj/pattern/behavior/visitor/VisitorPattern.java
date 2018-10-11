/**
 * 文件名称:          		VisitorPattern.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.visitor;

/**
 * 访问者模式就是一种分离对象数据结构与行为的方法，通过这种分离，可达到为一个被访问者动态添加新的操作而无需做其它的修改的效果
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-10-11 14:52
 * 
 */
public class VisitorPattern {

    public void visitor() {
        IVisitor visitor = new VisitorImpl();  
        ISubject sub = new SubjectImpl();  
        sub.accept(visitor); 
    }
}
