/**
 * 文件名称:          		InterpreterTest.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.interpreter;

import org.junit.Test;

import com.ljj.pattern.BaseCase;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-10-11 15:43
 * 
 */
public class InterpreterTest extends BaseCase {

    @ Test
    public void test() {
        InterpreterPattern ip = new InterpreterPattern();
        ip.interpreter();
    }

}
