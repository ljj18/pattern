/**
 * 文件名称:          		IAuth.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.strategy;

/**
 * 鉴权接口
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-09-07 14:04
 * 
 */
public interface IAuth {

    /**
     * 根据请求数据，确
     * @param authRequest
     * @return
     */
    boolean canProcess(AuthRequest authRequest);
    
    /**
     * 
     * @param authRequest
     * @return
     */
    AuthResult auth(AuthRequest authRequest);
    
}
