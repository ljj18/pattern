/**
 * 文件名称:          		RestAPIAuthStrategy.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 策略策略模式定义了一系列算法，并将每个算法封装起来，使他们可以相互替换，且算法的变化不会影响到使用算法的客户。
 * 需要设计一个接口，为一系列实现类提供统一的方法，多个实现类实现该接口，设计一个抽象类（可有可无，属于辅助类），提供辅助函数
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-09-07 15:49
 * 
 */
public class RestAPIAuthStrategy {

    private List<IAuth> auths = new ArrayList<IAuth>();

    /**
     * 
     */
    public RestAPIAuthStrategy() {
        auths.add(new NewTerminalAuth());
        auths.add(new TerminalTokenAuth());
        auths.add(new UserTokenAuth());
    }

    /**
     * 
     * @param authRequest
     */
    public void auth(AuthRequest authRequest) {
        AuthResult result = null;
        for (IAuth auth : auths) {
            if (auth.canProcess(authRequest)) {
                result = auth.auth(authRequest);
                break;
            }
        }
        if (result == null || result == AuthResult.DENIED) {
            System.out.println("你没有权限访问资源........");
        } else if (result == AuthResult.OK) {
            System.out.println("本次访问 鉴权通过，可访问资源........");
        }
    }
}
