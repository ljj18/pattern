/**
 * 文件名称:          		Flyweight.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.flyweight;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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

    /**
     * 
     */
    private ConnectionPool pool;
    
    /**
     * 
     */
    private ExecutorService executor;
    
    /**
     * 
     */
    public Flyweight() {
         pool = new ConnectionPool(3);
         executor = Executors.newFixedThreadPool(5);
    }
    
    /**
     * 
     */
    public void flyweight() {
        
        executor.execute(() -> {
        	Connection conn = getConnection();
        	Statement stat = new Statement(conn, "select id, name from user");
        	stat.execStatement();
            free(conn);
        });
        executor.execute(() -> {
        	Connection conn = getConnection();
        	Statement stat = new Statement(conn, "select id, name from user");
        	stat.execStatement();
            free(conn);
        });
        executor.execute(() -> {
        	Connection conn = getConnection();
        	Statement stat = new Statement(conn, "select id, name from user");
        	stat.execStatement();
            free(conn);
        });
        executor.execute(() -> {
        	Connection conn = getConnection();
        	Statement stat = new Statement(conn, "select id, name from user");
        	stat.execStatement();
            free(conn);
        });
        executor.execute(() -> {
        	Connection conn = getConnection();
        	Statement stat = new Statement(conn, "select id, name from user");
        	stat.execStatement();
            free(conn);
        });
    }
    
    private Connection getConnection() {
        return pool.get();
    }
    
    private void free(Connection conn) {
        pool.free(conn);
    }

}
