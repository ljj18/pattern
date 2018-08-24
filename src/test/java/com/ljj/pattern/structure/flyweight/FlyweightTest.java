/**
 * 文件名称:          		FlyweightTest.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.flyweight;

import org.junit.After;
import org.junit.Test;

import com.ljj.pattern.BaseCase;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-24 17:39
 * 
 */
public class FlyweightTest extends BaseCase {

    @ After
    public void tearDown() throws Exception {
    	Thread.sleep(500);
        System.out.println();
    }
    @Test
    public void testFlyweight() {
        Flyweight flyweight = new Flyweight();
        flyweight.flyweight();
    }
}
