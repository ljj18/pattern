/**
 * 文件名称:          		ViewFactory.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.flyweight;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-24 17:13
 * 
 */
public class ConnectionFactory {
    
    /**
     * 
     * @param name
     * @return
     */
    public Connection create(String username, String password, String url) {
        return new Connection(username, password, url);   
    }
    
}
