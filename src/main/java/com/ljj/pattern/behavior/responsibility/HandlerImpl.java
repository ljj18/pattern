/**
 * 文件名称:          		HandlerImpl.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.responsibility;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-10-11 09:55
 * 
 */
public class HandlerImpl extends AbstractHandler implements IHandler {

    private String name;  
    
    /**
     * 
     * @param name
     */
    public HandlerImpl(String name) {  
        this.name = name;  
    }  
    
    /**
     *
     *
     */
    public void operator() {
        System.out.println(name);
        if (getHandler() != null) {
            getHandler().operator();
        }
        
    }

}
