/**
 * 文件名称:          		User.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.pattern.create.builder;

/**
 * 建造者模式
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-23 18:15
 * 
 */
public class User {
    

    /**
     * 
     */
    private String name;
    /**
     * 
     */
    private int sex;
    /**
     * 
     */
    private int age;
    
    
    private User(String name, int sex, int age) {
        this.name = name;
        this.sex= sex;
        this.age = age;
    }


    /**
     * @return Returns the name.
     */
    public String getName() {
        return name;
    }


    /**
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * @return Returns the sex.
     */
    public int getSex() {
        return sex;
    }


    /**
     * @param sex The sex to set.
     */
    public void setSex(int sex) {
        this.sex = sex;
    }


    /**
     * @return Returns the age.
     */
    public int getAge() {
        return age;
    }


    /**
     * @param age The age to set.
     */
    public void setAge(int age) {
        this.age = age;
    }


    /** 
     *(non-Javadoc)
     * @see java.lang.Object#toString()
     * 
     */
    @ Override
    public String toString() {
        return "User [name=" + name + ", sex=" + sex + ", age=" + age + "]";
    }
    
    public static class Builder {
        public static final Builder builder = new Builder();
        
        /**
         * 
         */
        private String name;
        /**
         * 
         */
        private int sex;
        /**
         * 
         */
        private int age;
        
        private Builder() {
        }
        
        /**
         * 
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        
        /**
         * 
         * @param sex
         * @return
         */
        public Builder sex(int sex) {
            this.sex = sex;
            return this;
        }
        
        /**
         * 
         * @param age
         * @return
         */
        public Builder age(int age) {
            this.age = age;
            return this;
        }
        
        public User builder() {
            return new User(name, sex, age);
        }
    }
}
