/**
 * 文件名称:          		TemplateMethod.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.template;

/**
 * 
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-09-07 17:21
 * 
 */
public class TemplateMethod {

    /**
     * 
     */
    public void plus() {
        AbstractCalculator plus =  new Plus();
        System.out.println("8 + 8 = " + plus.calculate("8+8", "\\+"));
    }
    
    /**
     * 
     */
    public void minus() {
        AbstractCalculator minus =  new Minus();
        System.out.println("8 - 8 = " + minus.calculate("8-8", "-"));
    }
    
    /**
     * 
     */
    public void multiply() {
        AbstractCalculator multiply =  new Multiply();
        System.out.println("8 * 8 = " + multiply.calculate("8*8", "\\*"));
    }
}
