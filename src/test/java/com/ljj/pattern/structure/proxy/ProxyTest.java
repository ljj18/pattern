/**
 * 文件名称:          		ProxyTest.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.proxy;

import org.junit.Test;

import com.ljj.pattern.BaseCase;

/**
 * TODO: 文件注释
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-08-24 15:30
 * 
 */
public class ProxyTest extends BaseCase {
    
    @ Test
    public void testStaticProxy() {
        System.out.println("静态代理");
        StaticProxy proxy = new StaticProxy(new Source());
        proxy.method();
    }

    @ Test
    public void testJDKProxy() {
        System.out.println("JDK动态代理");
        JDKProxy proxy = new JDKProxy();
        proxy.proxyMethod();
    }

    @ Test
    public void testCglibProxy() {
        System.out.println("Cglib动态代理");
        CglibProxy proxy = new CglibProxy();
        proxy.proxyMethod();
    }

}
