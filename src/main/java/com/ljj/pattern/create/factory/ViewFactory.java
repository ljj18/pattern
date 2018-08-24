/**
 * 文件名称:          		ViewFactory.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.create.factory;

import com.ljj.pattern.create.factory.view.ColumnView;
import com.ljj.pattern.create.factory.view.IView;
import com.ljj.pattern.create.factory.view.LeafView;
import com.ljj.pattern.create.factory.view.LineView;
import com.ljj.pattern.create.factory.view.PageView;
import com.ljj.pattern.create.factory.view.ParagramView;
import com.ljj.pattern.create.factory.view.RootView;

/**
 * 工厂方法模式、静态工厂方法模式
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-23 16:59
 * 
 */
public class ViewFactory {

    /**
     * 视图工厂方法
     * @param viewType
     * @return
     */
    public IView create(int viewType) {
        switch (viewType) {
            case IView.ROOT_VIEW:
                return new RootView();
            case IView.PAGE_VIEW:
                return new PageView();
            case IView.COLUMN_VIEW:
                return new ColumnView();
            case IView.PARA_VIEW:
                return new ParagramView();
            case IView.LINE_VIEW:
                return new LineView();
            case IView.LEAF_VIEW:
                return new LeafView();
            default:
                break;
        }
        return null;
    }
    
    /**
     * 静态视图工厂方法(建议实际项目不要用静态工厂方法)
     * @param viewType
     * @return
     */
    public static IView createView(int viewType) {
        switch (viewType) {
            case IView.ROOT_VIEW:
                return new RootView();
            case IView.PAGE_VIEW:
                return new PageView();
            case IView.COLUMN_VIEW:
                return new ColumnView();
            case IView.PARA_VIEW:
                return new ParagramView();
            case IView.LINE_VIEW:
                return new LineView();
            case IView.LEAF_VIEW:
                return new LeafView();
            default:
                break;
        }
        return null;
    }
}
