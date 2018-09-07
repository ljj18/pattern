/**
 * 文件名称:          		AbstractCalculator.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.behavior.template;

/**
 * TODO: 文件注释
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-09-07 17:16
 * 
 */
public abstract class AbstractCalculator {

    /**
     * 
     * @param exp
     * @param opt
     * @return
     */
    public final int calculate(String exp, String opt) {
        int array[] = split(exp, opt);
        return calculate(array[0], array[1]);
    }

    /**
     * 
     * @param num1
     * @param num2
     * @return
     */
    abstract public int calculate(int num1, int num2);

    /**
     * 
     * @param exp
     * @param opt
     * @return
     */
    private int[] split(String exp, String opt) {
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}
