/**
 * 文件名称:          		Observers.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.observer;

/**
 * 观察者模式很好理解，类似于邮件订阅和RSS订阅，当我们浏览一些博客或wiki时，经常会看到RSS图标，
 * 就这的意思是，当你订阅了该文章，如果后续有更新，会及时通知你。其实，简单来讲就一句话：当一个对象变化时，
 * 其它依赖该对象的对象都会收到通知，并且随着变化！对象之间是一种一对多的关系
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-10-09 11:37
 * 
 */
public class Observers {

    /**
     * 
     */
    public void observer() {
        UserUpdate userUpdate = new UserUpdate();
        userUpdate.add(new Account());
        userUpdate.add(new VIPPoint());
        userUpdate.notifyObservers();
    }
}
