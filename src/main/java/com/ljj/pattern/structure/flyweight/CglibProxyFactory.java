/**
 * 文件名称:          		CglibProxyFactory.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.flyweight;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * Cglib代理实例工厂方法
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-24 15:21
 * 
 */
public class CglibProxyFactory {

    /**
     * 
     * @param target
     * @param mi
     * @return
     */
    public static Object getCglibProxyInstance(Object target, MethodInterceptor mi) {
        //1.工具类
        Enhancer en = new Enhancer();
        //2.设置父类
        en.setSuperclass(target.getClass());
        //3.设置回调函数
        en.setCallback(mi);
        //4.创建子类(代理对象)
        return en.create();
    }
}
