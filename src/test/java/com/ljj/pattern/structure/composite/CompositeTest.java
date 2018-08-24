/**
 * 文件名称:          		CompositeTest.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.composite;

import org.junit.Test;

import com.ljj.pattern.BaseCase;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-24 17:03
 * 
 */
public class CompositeTest extends BaseCase {

    @Test
    public void testComposite() {
        Composite composite = new Composite();
        composite.composite();
    }
}
