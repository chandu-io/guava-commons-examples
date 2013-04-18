package com.chandu.java.util;

import com.chandu.pojo.A;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author jaigurusairam
 * http://docs.guava-libraries.googlecode.com/git-history/release/javadoc/com/google/common/base/Preconditions.html
 * 
 */
public enum Ex01ObjectMethods {
    
    ONE;
    
    public static void main(final String[] args) throws CloneNotSupportedException {
        ONE.ex01();
    }
    
    private void ex01() throws CloneNotSupportedException {
        final A a = new A();
        log(a.toString());
        final A a1 = new A();
        log(a1.toString());
        a1.setValue(a.getValue());
        log(StringUtils.join(a.equals(a1)));
        log(StringUtils.join(a.compareTo(a1)));
        
        a1.getObjB().setValue("aslkdjalksj");
        a1.getObjC().setValue("aslkdjalksj");
        final A a2 = a1.copy();
        a2.getObjB().setValue("asd");
        a2.getObjC().setValue("asd");
        log(StringUtils.join(new Object[] {a1.getObjB().getValue(), a2.getObjB().getValue()}, ", "));
        log(StringUtils.join(new Object[] {a1.getObjC().getValue(), a2.getObjC().getValue()}, ", "));
    }

    // setup the class
    private static final Logger LOGGER = Logger.getLogger(Ex01ObjectMethods.class.getName());
    
    private static void log(final String message, final Object... objects) {
        LOGGER.log(Level.INFO, message, objects);
    }

    private Ex01ObjectMethods() {}
    // setup the class
}
