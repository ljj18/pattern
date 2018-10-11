/**
 * 文件名称:          		StateTest.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.state;

import org.junit.Test;

import com.ljj.pattern.BaseCase;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-10-11 14:32
 * 
 */
public class StateTest extends BaseCase {

    @ Test
    public void test() {
        StatePattern state = new StatePattern();
        state.state();
    }

}
