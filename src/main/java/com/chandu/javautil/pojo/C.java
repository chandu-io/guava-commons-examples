/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chandu.javautil.pojo;

/**
 *
 * @author jaigurusairam
 */
public class C implements Cloneable {
    
    private String value;
    
    public C() {
        value = "Howdy";
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
