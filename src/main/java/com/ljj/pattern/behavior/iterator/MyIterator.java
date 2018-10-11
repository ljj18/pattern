/**
 * 文件名称:          		MyIterator.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.iterator;

/**
 * TODO: 文件注释
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-10-10 10:54
 * 
 */
public class MyIterator<T> implements IIterator<T> {

    /**
     * 
     */
    private ICollection<T> collection;
    /**
     * 
     */
    private int pos = -1;

    /**
     * 
     * @param collection
     */
    public MyIterator(ICollection<T> collection) {
        this.collection = collection;
    }

    @ Override
    public T previous() {

        if (pos > 0) {
            pos--;
        }
        return collection.get(pos);
    }

    @ Override
    public T next() {
        if (pos < collection.size() - 1) {
            pos++;
        }
        return collection.get(pos);
    }

    @ Override
    public boolean hasNext() {
        return pos<collection.size() - 1;
    }

    @ Override
    public T first() {
        return collection.get(0);
    }

}
