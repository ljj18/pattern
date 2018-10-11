/**
 * 文件名称:          		MementoTest.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.memento;

import org.junit.Test;

import com.ljj.pattern.BaseCase;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-10-11 11:36
 * 
 */
public class MementoTest extends BaseCase {

    @ Test
    public void test() {
        MementoPattern mp = new MementoPattern();
        mp.memento();
    }

}
