/**
 * 文件名称:          		Composite.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.composite;

/**
 * 组合模式有时又叫部分-整体模式在处理类似树形结构的问题时比较方便
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-24 16:45
 * 
 */
public class Composite {

    /**
     * 
     */
    public void composite() {
        View root = new View("root");
        View page = new View("page");
        root.add(page);
        View columnA = new View("columnA");
        page.add(columnA);
        View columnB = new View("columnB");
        page.add(columnB);
        View para = new View("para");
        columnB.add(para);
        System.out.println(root);
    }
}
