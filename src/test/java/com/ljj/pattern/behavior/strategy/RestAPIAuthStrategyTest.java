/**
 * 文件名称:          		RestAPIAuthStrategyTest.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.strategy;

import org.junit.Test;

import com.ljj.pattern.BaseCase;
import com.ljj.pattern.behavior.strategy.AuthRequest;
import com.ljj.pattern.behavior.strategy.RestAPIAuthStrategy;

/**
 * TODO: 文件注释
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-09-07 16:25
 * 
 */
public class RestAPIAuthStrategyTest extends BaseCase {

    @Test
    public void testNewClientAuth() {
        System.out.println("新终端策略");
        RestAPIAuthStrategy strategy = new RestAPIAuthStrategy();
        AuthRequest authRequest = new AuthRequest();
        authRequest.setClientId("79NIGkise64u");
        strategy.auth(authRequest);
    }
    
    @Test
    public void testTerminalTokenAuth() {
        System.out.println("注册终端策略");
        RestAPIAuthStrategy strategy = new RestAPIAuthStrategy();
        AuthRequest authRequest = new AuthRequest();
        authRequest.setClientId("79NIGkise64u");
        authRequest.setTerminalToken("skiwnease");
        strategy.auth(authRequest);
    }
    
    @Test
    public void testUserTokenAuth() {
        System.out.println("登录终端策略");
        RestAPIAuthStrategy strategy = new RestAPIAuthStrategy();
        AuthRequest authRequest = new AuthRequest();
        authRequest.setClientId("79NIGkise64u");
        authRequest.setTerminalToken("skiwnease");
        authRequest.setUserToken("skiese");
        strategy.auth(authRequest);
    }
    
    @Test
    public void testNoTokenAuth() {
        RestAPIAuthStrategy strategy = new RestAPIAuthStrategy();
        AuthRequest authRequest = new AuthRequest();
        strategy.auth(authRequest);
    }
}
