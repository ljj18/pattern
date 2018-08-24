/**
 * 文件名称:          		Flyweight.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.flyweight;

/**
 * 享元模式的主要目的是实现对象的共享，即共享池，当系统中对象多的时候可以减少内存的开销，通常与工厂模式一起使用
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-08-24 17:28
 * 
 */
public class Flyweight {

    public void flyweight() {
        ElementPool pool = new ElementPool(10);
        Element root = pool.get("root");
        Element page = pool.get("page");
        root.add(page);
        Element columnA = pool.get("columnA");
        page.add(columnA);
        Element columnB = pool.get("columnB");
        page.add(columnB);
        Element para = pool.get("para");
        columnB.add(para);
        System.out.println(root);
        
        pool.free(root);
        pool.free(page);
        pool.free(columnA);
        pool.free(columnB);
        pool.free(para);
    }
}
