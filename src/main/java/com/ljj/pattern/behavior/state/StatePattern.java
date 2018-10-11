/**
 * 文件名称:          		StatePattern.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.state;

/**
 * 当对象的状态改变时，同时改变其行为，状态模式就两点：1、可以通过改变状态来获得不同的行为。2、你的好友能同时看到你的变化
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-10-11 14:31
 * 
 */
public class StatePattern {

    public void state() {
        State state = new State();
        Context context = new Context(state);

        // 设置第一种状态
        state.setValue("state1");
        context.method();

        // 设置第二种状态
        state.setValue("state2");
        context.method();
    }
}
