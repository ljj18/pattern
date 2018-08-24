/**
 * 文件名称:          		FlyweightPool.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.flyweight;

import java.util.ArrayList;
import java.util.List;


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
public class ConnectionPool {

    List<Connection> pool = new ArrayList<Connection>(); 
    
    ConnectionFactory viewFactory = new ConnectionFactory();
    
    public ConnectionPool(int coreSize) {
        for (int i = 0; i < coreSize; i++) {
            pool.add(viewFactory.create("liangjinjing", "123456", "127.0.0.1"));
        }
    }
    
    /**
     * 
     * @param name
     * @return
     */
    public Connection get() {
        /*
         * 此处要做很多事情
         */
        Connection elem =  pool.remove(0);
        return elem;
    }
    
    /**
     * 
     * @param elem
     */
    public void free(Connection conn) {
        pool.add(conn);
    }
}
