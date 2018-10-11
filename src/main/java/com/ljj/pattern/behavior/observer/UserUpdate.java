/**
 * 文件名称:          		UserUpdate.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.observer;

import java.util.Vector;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-10-09 11:29
 * 
 */
public class UserUpdate {

    private Vector<IUpdate> observers = new Vector<IUpdate>();
    
    /**
     * 
     * @param observer
     */
    public void add(IUpdate observer) {
        observers.add(observer);
    }
    
    /**
     * 
     * @param observer
     */
    public void delete(IUpdate observer) {
        observers.remove(observer);
    }
    
    /**
     * 
     */
    public void notifyObservers() {
        observers.forEach(e -> e.update());
    }
}
