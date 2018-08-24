/**
 * 文件名称:          		UserService.java
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
 * Date			2018-08-24 16:09
 * 
 */
public class DiskService  implements IService {

    @ Override
    public boolean startUp() {
        System.out.println("Disk server startup");
        return true;
    }

    @ Override
    public boolean shutdown() {
        System.out.println("Disk server shutdow");
        return true;
    }

}
