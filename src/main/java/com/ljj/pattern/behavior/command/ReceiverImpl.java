/**
 * 文件名称:          		ReceiverImpl.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.command;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-10-11 11:00
 * 
 */
public class ReceiverImpl implements IReceiver {

    @ Override
    public void action() {
        System.out.println("Reciver command....");
    }

    
}
