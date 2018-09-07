/**
 * 文件名称:          		AbstractAuth.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.strategy;

/**
 * TODO: 文件注释
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-09-07 14:55
 * 
 */
public abstract class AbstractAuth implements IAuth {

    /**
     * 判断ClientId 是否存在
     * 
     * @param clientId
     * @return
     */
    public boolean isExistClientId(AuthRequest authRequest) {
        String clientId = authRequest.getClientId();
        return clientId != null && clientId.length() > 0;
    }

    /**
     * 判断 终端Token 是否存在
     * @param token
     * @return
     */
    public boolean isExistTerminalToken(AuthRequest authRequest) {
        String token = authRequest.getTerminalToken();
        return token != null && token.length() >= 0;
    }

    /**
     * 判断 用户Token 是否存在
     * @param authRequest
     * @return
     */
    public boolean isExistUserToken(AuthRequest authRequest) {
        String token = authRequest.getUserToken();
        return token != null && token.length() >= 0;
    }

}
