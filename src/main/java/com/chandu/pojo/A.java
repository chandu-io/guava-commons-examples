/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chandu.pojo;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 * @author jaigurusairam
 */
public class A implements Comparable<A>, Cloneable {
    private String value;
    private B objB;
    private C objC;

    public A() {
        log("Creating object A...");
        value = "Hello";
        objB = new B();
        objC = new C();
    }
    
    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }
    
    public B getObjB() {
        return objB;
    }

    public void setObjB(final B objB) {
        this.objB = objB;
    }

    public C getObjC() {
        return objC;
    }

    public void setObjC(final C objC) {
        this.objC = objC;
    }
    
    public A copy() {
        log("Copying object A...");
        A other = null;
        try {
            other = (A) clone();
        } catch (CloneNotSupportedException ex) {
            LOGGER.log(Level.SEVERE, "Unable to clone object A!", ex);
        }
        return other;
    }
    
    // setup the class
    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("value", value)
                .toString();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(value)
                .toHashCode();
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final A other = (A) obj;
        return new EqualsBuilder()
                //use this only if your extended class has equals()
                //.appendSuper(super.equals(obj))
                .append(value, other.value)
                .isEquals();
    }
    
    public int compareTo(final A other) {
        return new CompareToBuilder()
                //use this only if your extended class has compareTo()
                //.appendSuper(super.compareTo())
                .append(value, other.value)
                .toComparison();
    }
    
    /**
     * http://howtodoinjava.com/2012/11/08/a-guide-to-object-cloning-in-java/
     * @return
     * @throws CloneNotSupportedException 
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        final A cloned = (A) super.clone();
        if (!(objB instanceof Cloneable)) {
            final B otherB = new B();
            otherB.setValue(objB.getValue());
            cloned.objB = otherB;
        }
        if (objC instanceof Cloneable) {
            final C otherC = (C) objC.clone();
            cloned.objC = otherC;
        }
        return cloned;
    }

    private static final Logger LOGGER = Logger.getLogger(A.class.getName());
    
    private static void log(final String message, final Object... objects) {
        LOGGER.log(Level.INFO, message, objects);
    }
    // setup the class
}
