/**
 * 文件名称:          		BaseCase.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
 * 
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-08-24 16:20
 * 
 */
@ FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BaseCase {

    @ Before
    public void setUp() throws Exception {
        System.out.println("-------------------------------------------------------------");
    }

    @ After
    public void tearDown() throws Exception {
        System.out.println();
    }
}
