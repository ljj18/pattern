/**
 * 文件名称:          		IService.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.facade;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-24 16:06
 * 
 */
public interface IService {

    /**
     * 启动
     * @return
     */
    boolean startUp();
    
    /**
     * 关闭
     * @return
     */
    boolean shutdown();
}
