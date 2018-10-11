/**
 * 文件名称:          		ObserversTest.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.observer;

import org.junit.Test;

import com.ljj.pattern.BaseCase;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-10-09 11:42
 * 
 */
public class ObserversTest extends BaseCase {

    @ Test
    public void test() {
        Observers observer = new Observers();
        observer.observer();
    }

}
