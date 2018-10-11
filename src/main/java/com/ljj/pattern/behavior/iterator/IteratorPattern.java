/**
 * 文件名称:          		IteratorPattern.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.iterator;

/**
 * 迭代器模式就是顺序访问聚集中的对象，一般来说，集合中非常常见，如果对集合类比较熟悉的话，理解本模式会十分轻松。
 * 这句话包含两层意思：一是需要遍历的对象，即聚集对象，二是迭代器对象，用于对聚集对象进行遍历访问
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-10-10 11:14
 * 
 */
public class IteratorPattern {

    public void iterator() {
        MyList<String> myList = new MyList<String>(8);
        myList.add("A");
        myList.add("B");
        myList.add("E");
        myList.add("G");
        myList.add("K");
        
        IIterator<String> it = myList.iterator();
        while(it.hasNext()){  
            System.out.println(it.next());  
        }  
    }
}
