/**
 * 文件名称:          		NewTerminalAuth.java
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
 * Date 2018-09-07 14:28
 * 
 */
public class NewTerminalAuth extends AbstractAuth {

    @ Override
    public boolean canProcess(AuthRequest authRequest) {
        return isExistClientId(authRequest) && !isExistTerminalToken(authRequest);
    }

    @ Override
    public AuthResult auth(AuthRequest authRequest) {
        System.out.println("执行新终端权限：" + authRequest);
        return AuthResult.OK;
    }


}
