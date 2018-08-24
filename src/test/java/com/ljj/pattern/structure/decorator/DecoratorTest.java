/**
 * 文件名称:          		DecoratorTest.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.decorator;

import org.junit.Test;

import com.ljj.pattern.BaseCase;

/**
 * 
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-08-24 14:10
 * 
 */
public class DecoratorTest extends BaseCase {

    @ Test
    public void test() {
        System.out.println("装饰模式");
        IDecorator decorator = new Decorator(new Source());
        decorator.method();
    }

}
