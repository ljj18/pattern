/**
 * 文件名称:          		Mail.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.create.prototype;

import java.io.Serializable;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-23 19:07
 * 
 */
public class Mail implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = 4130039763027761000L;
    /**
     * 
     */
    private String name;
    /**
     * 
     */
    private String address;
    
    /**
     * 
     * @param name
     * @param address
     */
    public Mail(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * @return Returns the name.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Returns the address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address The address to set.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /** 
     *(non-Javadoc)
     * @see java.lang.Object#toString()
     * 
     */
    @ Override
    public String toString() {
        return "Mail [name=" + name + ", address=" + address + "]";
    }

}
