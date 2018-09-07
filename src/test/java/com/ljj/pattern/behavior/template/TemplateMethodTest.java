/**
 * 文件名称:          		TemplateMethodTest.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.template;

import org.junit.Test;

import com.ljj.pattern.BaseCase;
import com.ljj.pattern.behavior.template.TemplateMethod;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-09-07 17:41
 * 
 */
public class TemplateMethodTest extends BaseCase {

    @Test
    public void testPlus() {
        System.out.println("加法");
        TemplateMethod tm  = new TemplateMethod();
        tm.plus();
    }
    
    @Test
    public void testMinus() {
        System.out.println("减法");
        TemplateMethod tm  = new TemplateMethod();
        tm.minus();
    }
    
    @Test
    public void testMultiply() {
        System.out.println("乘法");
        TemplateMethod tm  = new TemplateMethod();
        tm.multiply();
    }
}
