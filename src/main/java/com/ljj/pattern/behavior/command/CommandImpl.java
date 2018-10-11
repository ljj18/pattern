/**
 * 文件名称:          		CommandImpl.java
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
 * Date			2018-10-11 10:57
 * 
 */
public class CommandImpl implements ICommand {
    
    private IReceiver receiver;
    /**
     * 
     * @param receiver
     */
    public CommandImpl(IReceiver receiver) {
        this.receiver = receiver;
    }
    
    @ Override
    public void exec() {
        receiver.action();
    }

}
