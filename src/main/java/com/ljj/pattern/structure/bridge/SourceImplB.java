/**
 * 文件名称:          		SourceImplA.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.bridge;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-24 16:33
 * 
 */
public class SourceImplB implements Source{

    @ Override
    public void method() {
        System.out.println("source implements B");
    }

}
