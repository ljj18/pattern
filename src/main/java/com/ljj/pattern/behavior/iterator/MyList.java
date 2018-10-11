/**
 * 文件名称:          		MyList.java
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
 * Date			2018-10-10 10:48
 * 
 */
@ SuppressWarnings("unchecked")
public class MyList<T> implements ICollection<T>{

    /**
     * 
     */
    private Object a[];
    /**
     * 
     */
    private int index = 0;
    
    public MyList(int size) {
        a = new Object[size];
    }
    
    public boolean add(T e) {
        if (index < a.length) {
            a[index++] = e;
            return true;
        }
        return false;
    }
    
    @ Override
    public IIterator<T> iterator() {
        return new MyIterator<>(this);
    }


    @ Override
    public T get(int i) {
        return (T)a[i];
    }

    @ Override
    public int size() {
        return a.length;
    }

}
