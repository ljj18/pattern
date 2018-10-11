/**
 * 文件名称:          		Minus.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.interpreter;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-10-11 15:42
 * 
 */
public class Minus implements IExpression {

    @Override  
    public int interpret(Context context) {  
        return context.getNum1()-context.getNum2();  
    }  
}
