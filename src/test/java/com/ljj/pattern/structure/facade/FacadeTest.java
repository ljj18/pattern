/**
 * 文件名称:          		FacadeTest.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.facade;

import org.junit.Test;

import com.ljj.pattern.BaseCase;

/**
 * TODO: 文件注释
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-08-24 16:19
 * 
 */
public class FacadeTest extends BaseCase {

    @ Test
    public void testFacade() {
        Facade facade = new Facade();
        facade.facade();
    }

}
