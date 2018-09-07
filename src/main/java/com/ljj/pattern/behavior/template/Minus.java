/**
 * 文件名称:          		Minus.java
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
 * Date			2018-09-07 17:20
 * 
 */
public class Minus extends AbstractCalculator {

    @ Override
    public int calculate(int num1, int num2) {
        return num1 - num2;
    }

}
