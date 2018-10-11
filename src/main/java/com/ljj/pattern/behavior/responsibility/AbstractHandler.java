/**
 * 文件名称:          		AbstractHandler.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.responsibility;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-10-11 09:52
 * 
 */
public abstract class AbstractHandler {

    private IHandler handler;

    /**
     * @return Returns the handler.
     */
    public IHandler getHandler() {
        return handler;
    }

    /**
     * @param handler The handler to set.
     */
    public void setHandler(IHandler handler) {
        this.handler = handler;
    }

}
