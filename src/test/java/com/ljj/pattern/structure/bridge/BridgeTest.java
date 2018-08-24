/**
 * 文件名称:          		BridgeTest.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.bridge;

import org.junit.Test;

import com.ljj.pattern.BaseCase;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * s
 * @author		liangjinjing
 * 
 * Date			2018-08-24 16:40
 * 
 */
public class BridgeTest extends BaseCase{
    
    @Test
    public void testBridge() {
        Bridge bridge = new Bridge();
        bridge.bridge();
    }

}
