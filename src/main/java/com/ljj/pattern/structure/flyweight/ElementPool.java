/**
 * 文件名称:          		FlyweightPool.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.flyweight;

import java.util.concurrent.ConcurrentSkipListSet;


/**
 * 
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-24 17:21
 * 
 */
public class ElementPool {

    ConcurrentSkipListSet<Element> pool = new ConcurrentSkipListSet<Element>(); 
    
    ElementFactory viewFactory = new ElementFactory();
    
    public ElementPool(int coreSize) {
        for (int i = 0; i < coreSize; i++) {
            pool.add(viewFactory.create(""));
        }
    }
    
    /**
     * 
     * @param name
     * @return
     */
    public Element get(String name) {
        Element elem =  pool.pollFirst();
        if (elem != null) {
            elem.setName(name);
            return elem;
        }
        return null;
    }
    
    /**
     * 
     * @param elem
     */
    public void free(Element elem) {
        elem.setFree(true);
        pool.add(elem);
    }
}
