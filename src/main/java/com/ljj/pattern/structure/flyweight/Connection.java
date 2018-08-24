/**
 * 文件名称:          		View.java
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
 * Date			2018-08-24 16:46
 * 
 */
public class Connection {
    /**
     * 连接名称
     */
    private String username;
    /**
     * 
     */
    private String password;
    
    /**
     * 
     */
    private String url;
    
    /**
     * 
     * @param username
     * @param password
     * @param url
     */
    public Connection(String username, String password, String url) {
        this.username =  username;
        this.password = password;
        this.url = url;
    }

    /**
     * @return Returns the username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username The username to set.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return Returns the password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password The password to set.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return Returns the url.
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url The url to set.
     */
    public void setUrl(String url) {
        this.url = url;
    }

}
