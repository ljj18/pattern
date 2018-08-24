/**
 * 文件名称:          		CglibProxy.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * Cglib 代理模式
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-24 15:12
 * 
 */
public class CglibProxy implements MethodInterceptor {

    private Source target;
    
    public void proxyMethod() {
        target = new Source();
        Source proxySource = (Source)CglibProxyFactory.getCglibProxyInstance(target, this);
        proxySource.method();
        System.out.println("Name: " + proxySource.getName());
    }
    
    @ Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        beforeMethod();
        Object returnObject = method.invoke(target, args);
        afterMethod();
        return returnObject;
    }

    
    
    private void beforeMethod() {
        System.out.println("before the call proxy method");
    }
        
    private void afterMethod() {
        System.out.println("after the call proxy method");
    }
}
