/**
 * 文件名称:          		TerminalTokenAuth.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.strategy;

/**
 * 有终端Token鉴权
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-09-07 14:45
 * 
 */
public class TerminalTokenAuth extends AbstractAuth {

    @ Override
    public boolean canProcess(AuthRequest authRequest) {
        return isExistClientId(authRequest) &&  
            isExistTerminalToken(authRequest) && 
            !isExistUserToken(authRequest);
    }

    @ Override
    public AuthResult auth(AuthRequest authRequest) {
        System.out.println("执行终端Token权限：" +  authRequest);
        return AuthResult.OK;
    }
    

    

}
