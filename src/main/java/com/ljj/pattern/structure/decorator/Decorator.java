/**
 * 文件名称:          		Decorator.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.decorator;


/**
 * 装饰模式：装饰模式就是给一个对象增加一些新的功能，而且是动态的，要求装饰对象和被装饰对象实现同一个接口，装饰对象持有被装饰对象的实例
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-08-24 14:00
 * 
 */
public class Decorator implements IDecorator {

    private Source source;

    public Decorator(Source source) {
        this.source = source;
    }

    @ Override
    public void method() {
        System.out.println("before the call source method");
        source.method();
        System.out.println("after the call source method");
    }

}
