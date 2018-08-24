/**
 * 文件名称:          		UserDao.java
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
 * Date			2018-08-24 17:49
 * 
 */
public class Statement {

	/**
	 * 
	 */
	private Connection conn;
	/**
	 * 
	 */
	private String sql;
	
	/**
	 * 
	 * @param conn
	 * @param sql
	 */
	public Statement(Connection conn, String sql) {
		this.conn = conn;
		this.sql = sql;
	}
	
    public void execStatement(){
        System.out.println("保存用户: " + conn.hashCode() + ",SQL: " + sql);
    }

}
