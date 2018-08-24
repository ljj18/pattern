/**
 * 文件名称:          		FactoryMethodTest.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.create.factory;

import org.junit.Test;

import com.ljj.pattern.BaseCase;
import com.ljj.pattern.create.factory.view.IView;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-23 17:11
 * 
 */
public class FactoryMethodTest extends BaseCase {

    /**
     * 工厂方法
     */
    @ Test
    public void testFactoryMethod() {
        ViewFactory vf = new ViewFactory();
        vf.create(IView.ROOT_VIEW).doLayout();
        vf.create(IView.PAGE_VIEW).doLayout();
        vf.create(IView.COLUMN_VIEW).doLayout();
        vf.create(IView.PARA_VIEW).doLayout();
        vf.create(IView.LINE_VIEW).doLayout();
        vf.create(IView.LEAF_VIEW).doLayout();
    }
    
    /**
     * 静态工厂
     */
    @ Test
    public void testStaticFactoryMethod() {
        ViewFactory.createView(IView.ROOT_VIEW).doLayout();
        ViewFactory.createView(IView.PAGE_VIEW).doLayout();
    }
    
    /**
     * 抽像工厂
     */
    @ Test
    public void testAbstractFactoryMethod() {
        IFactory factory = new PageFactory();
        factory.create().doLayout();
    }

}
