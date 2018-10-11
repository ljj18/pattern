/**
 * 文件名称:          		IIterator.java
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
 * Date			2018-10-10 10:34
 * 
 */
public interface IIterator<T> {

    /**
     * 上一个
     * @return
     */
    public T previous();  
      
    /**
     * 下一个
     * @return
     */
    public T next();  
    
    /**
     * 是否有下一个
     * @return
     */
    public boolean hasNext();  
      
    /**
     * 
     * @return
     */
    public T first();
}
