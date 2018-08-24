/**
 * 文件名称:          		JDKProxy.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * JDK代理，生成代理对像工厂方法
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-08-24 14:52
 * 
 */
public class JDKProxyFactory {
    /**
     * 
     * @param target
     * @return
     */
    public static Object getJDKProxyInstance(Object target, InvocationHandler h) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), h);
    }
}
