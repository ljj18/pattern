/**
 * 文件名称:          		JDKProxy.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK代理
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-24 15:01
 * 
 */
public class JDKProxy implements InvocationHandler {
    
    private IProxy target;
    /**
     * 
     */
    public void proxyMethod() {
        target = new Source();
        IProxy proxyTarget = (IProxy)JDKProxyFactory.getJDKProxyInstance(target, this);
        proxyTarget.method();
    }
    
    @ Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // TODO Auto-generated method stub
        beforeMethod();
        Object returnValue = method.invoke(target, args);
        afterMethod();
        return returnValue;
    }
    
    private void beforeMethod() {
        System.out.println("before the call proxy method");
    }
        
    private void afterMethod() {
        System.out.println("after the call proxy method");
    }


}
