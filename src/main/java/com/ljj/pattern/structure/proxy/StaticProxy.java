/**
 * 文件名称:          		StaticProxy.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.proxy;

/**
 * 静态代理模式
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-08-24 14:47
 * 
 */
public class StaticProxy implements IProxy {

    private Source source;
    /**
     * 
     * @param source
     */
    public StaticProxy(Source source){
        this.source = source;
    }
    
    @ Override
    public void method() {
        beforeMethod();
        source.method();
        afterMethod();
    }
    
    private void beforeMethod() {
        System.out.println("before the call proxy method");
    }
        
    private void afterMethod() {
        System.out.println("after the call proxy method");
    }

}
