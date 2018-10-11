/**
 * 文件名称:          		Chain.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.responsibility;

import org.junit.Test;

import com.ljj.pattern.BaseCase;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-10-11 10:30
 * 
 */
public class ChainTest extends BaseCase {

    @ Test
    public void test() {
        Chain c = new Chain();
        c.operator();
    }

}
