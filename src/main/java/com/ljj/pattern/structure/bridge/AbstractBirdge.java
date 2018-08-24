/**
 * 文件名称:          		AbstractBirdge.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.structure.bridge;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-24 16:34
 * 
 */
public abstract class AbstractBirdge {

    private Source source;

    /**
     * @return Returns the source.
     */
    public Source getSource() {
        return source;
    }

    /**
     * @param source The source to set.
     */
    public void setSource(Source source) {
        this.source = source;
    }
    
    public void method() {
        if (source != null) {
            source.method();
        }
    }
    
    
}
