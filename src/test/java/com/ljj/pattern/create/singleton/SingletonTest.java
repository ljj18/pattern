/**
 * 文件名称:          		SingletonTest.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.create.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.After;
import org.junit.Test;

import com.ljj.pattern.BaseCase;

/**
 * 单列模式
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-08-23 18:01
 * 
 */
public class SingletonTest extends BaseCase {

    @ After
    public void tearDown() throws Exception {
        Thread.sleep(200);
        super.tearDown();
    }

    @ Test
    public void test() {
        ExecutorService es = Executors.newFixedThreadPool(5);
        es.execute(
            () -> System.out.println(Thread.currentThread().getName() + ": " + Singleton.getInstance().hashCode()));
        es.execute(
            () -> System.out.println(Thread.currentThread().getName() + ": " + Singleton.getInstance().hashCode()));
        es.execute(
            () -> System.out.println(Thread.currentThread().getName() + ": " + Singleton.getInstance().hashCode()));
        es.execute(
            () -> System.out.println(Thread.currentThread().getName() + ": " + Singleton.getInstance().hashCode()));
        es.execute(
            () -> System.out.println(Thread.currentThread().getName() + ": " + Singleton.getInstance().hashCode()));
    }

}
