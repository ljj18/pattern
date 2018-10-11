/**
 * 文件名称:          		ICollection.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.iterator;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-10-10 10:36
 * 
 */
public interface ICollection<T> {

    /**
     * 
     * @return
     */
    public IIterator<T> iterator();  
    
    /**
     * 取得集合元素
     */  
    public T get(int i);  
      
    /**
     * 集合大小
     */  
    public int size();  
}
