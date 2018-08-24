/**
 * 文件名称:          		Singleton.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.create.singleton;

/**
 * 单例模式
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-23 17:53
 * 
 */
public class Singleton {

    /** 
     * 私有构造方法，防止被实例化 
     */  
    private Singleton() { 
    }
  
    /**
     * 内部类来维护单例 ，利用JVM的 class loader 机制在多线程情况下确保单列只实体化一次
     */  
    private static class SingletonFactory {  
        private static Singleton instance = new Singleton();  
    }  
  
    /** 
     * 获取实例 
     */  
    public static Singleton getInstance() {  
        return SingletonFactory.instance;  
    }  
  
    /**
     * 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 
     */
    public Object readResolve() {
        return getInstance();  
    }  
}
