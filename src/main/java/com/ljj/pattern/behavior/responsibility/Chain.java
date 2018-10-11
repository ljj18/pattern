/**
 * 文件名称:          		Chain.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.responsibility;

/**
 * 责任链模式，有多个对象，每个对象持有对下一个对象的引用，这样就会形成一条链，请求在这条链上传递，直到某一对象决定处理该请求
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-10-11 09:59
 * 
 */
public class Chain {
    
    public void operator() {
        HandlerImpl h1 = new HandlerImpl("h1");
        HandlerImpl h2 = new HandlerImpl("h2");
        HandlerImpl h3 = new HandlerImpl("h3");
        h1.setHandler(h2);
        h2.setHandler(h3);
        h1.operator();
    }
}
