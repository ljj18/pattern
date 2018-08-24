/**
 * 文件名称:          		Prototype.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.create.prototype;

import java.awt.Rectangle;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 原型模式
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-08-23 18:46
 * 
 */
public class Prototype implements Cloneable, Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -7798452018339661750L;
    /**
     * 
     */
    private int sum;
    /**
     * 
     */
    private float average;
    /**
     * 
     */
    private Rectangle rect;
    /**
     * 
     */
    private String name ;
    
    /**
     * 
     */
    private Mail mail;
    
    /**
     * 
     * @return
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * @return Returns the sum.
     */
    public int getSum() {
        return sum;
    }

    /**
     * @param sum The sum to set.
     */
    public void setSum(int sum) {
        this.sum = sum;
    }

    /**
     * @return Returns the average.
     */
    public float getAverage() {
        return average;
    }

    /**
     * @param average The average to set.
     */
    public void setAverage(float average) {
        this.average = average;
    }

    /**
     * @return Returns the rect.
     */
    public Rectangle getRect() {
        return rect;
    }

    /**
     * @param rect The rect to set.
     */
    public void setRect(Rectangle rect) {
        this.rect = rect;
    }
    
    /**
     * @return Returns the mail.
     */
    public Mail getMail() {
        return mail;
    }

    /**
     * @param mail The mail to set.
     */
    public void setMail(Mail mail) {
        this.mail = mail;
    }  

    
    /**
     * 
     *(non-Javadoc)
     * @see java.lang.Object#clone()
     *
     */
    public Prototype clone() throws CloneNotSupportedException  {
        Prototype proto = (Prototype) super.clone();  
        return proto; 
    }

    /**
     * 深度Clone 
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Prototype deepClone() throws IOException, ClassNotFoundException {  
  
        /* 写入当前对象的二进制流 */  
        ByteArrayOutputStream bos = new ByteArrayOutputStream();  
        ObjectOutputStream oos = new ObjectOutputStream(bos);  
        oos.writeObject(this);  
        /* 读出二进制流产生的新对象 */  
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());  
        ObjectInputStream ois = new ObjectInputStream(bis);  
        return (Prototype)ois.readObject();  
    }

    /** 
     *(non-Javadoc)
     * @see java.lang.Object#toString()
     * 
     */
    @ Override
    public String toString() {
        return "Prototype [sum=" + sum + ", average=" + average + ", rect=" + rect + ", name=" + name + ", mail=" + mail
            + "]";
    }
    
}
