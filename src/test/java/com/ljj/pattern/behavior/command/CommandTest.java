/**
 * 文件名称:          		CommandTest.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.command;

import org.junit.Test;

import com.ljj.pattern.BaseCase;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-10-11 11:04
 * 
 */
public class CommandTest extends BaseCase {

    @ Test
    public void test() {
        CommandInvoker invoker = new CommandInvoker();
        invoker.invoker();
    }

}
