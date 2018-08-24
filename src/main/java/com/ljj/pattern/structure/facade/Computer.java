/**
 * 文件名称:          		Computer.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.facade;

/**
 * 
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-24 16:12
 * 
 */
public class Computer implements IService {

    /**
     * 
     */
    private IService cpu;
    /**
     * 
     */
    private IService disk;
    /**
     * 
     */
    private IService memory;
    
    public Computer() {
        cpu = new CPUService();
        disk = new DiskService();
        memory = new MemoryService();
    }
    
    
    @ Override
    public boolean startUp() {
        cpu.startUp();
        memory.startUp();
        disk.startUp();
        return true;
    }

    @ Override
    public boolean shutdown() {
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        return true;
    }

}
