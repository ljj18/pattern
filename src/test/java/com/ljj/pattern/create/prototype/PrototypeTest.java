/**
 * 文件名称:          		PrototypeTest.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.create.prototype;

import java.awt.Rectangle;
import java.io.IOException;

import org.junit.Test;

import com.ljj.pattern.BaseCase;

/**
 * TODO: 文件注释
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-08-23 18:56
 * 
 */
public class PrototypeTest extends BaseCase {

    @ Test
    public void test() {
        try {
            Mail mail = new Mail("liangjinjing", "ljj18@sohu.com");
            Prototype prototype = new Prototype();
            prototype.setSum(2);
            prototype.setAverage(0.7F);
            prototype.setName("梁金晶");
            prototype.setRect(new Rectangle(10, 10, 100, 300));
            prototype.setMail(mail);
            // 浅复制,内部对像是引用
            Prototype clonePrototype = prototype.clone();
            clonePrototype.getMail().setName("owen");
            System.out.println("源对像： " + prototype);
            System.out.println("浅 clone：" + clonePrototype);
            System.out.println("》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》");
            // 深复制,内部对像是复制
            prototype.setMail(mail);
            prototype.getMail().setName("liangjinjing");
            Prototype deepClonePrototype = prototype.deepClone();
            deepClonePrototype.getMail().setName("梁金晶");
            System.out.println("源对像： " + prototype);
            System.out.println("深度 clone：" + deepClonePrototype);

        } catch (CloneNotSupportedException | ClassNotFoundException | IOException e) {
            //
            e.printStackTrace();
        }
    }

}
