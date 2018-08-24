/**
 * 文件名称:          		BuilderTest.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.create.builder;

import org.junit.Test;

import com.ljj.pattern.BaseCase;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-23 18:35
 * 
 */
public class BuilderTest extends BaseCase {

    @ Test
    public void test() {
        User user = User.Builder.builder.age(39).name("梁金晶").sex(1).builder();
        System.out.println(user);
    }

}
