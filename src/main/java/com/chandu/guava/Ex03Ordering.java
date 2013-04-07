package com.chandu.guava;

import static com.google.common.base.Preconditions.*;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.time.DurationFormatUtils;

/**
 *
 * @author jaigurusairam
 * http://docs.guava-libraries.googlecode.com/git-history/release/javadoc/com/google/common/base/Preconditions.html
 * 
 */
public enum Ex03Ordering {
    
    ONE;
    
    public static void main(final String[] args) {
        ONE.ex01();
    }
    
    private void ex01() {
        
    }

    // setup the class
    private static final Logger LOGGER = Logger.getLogger(Ex03Ordering.class.getName());
    
    private static void log(final String message, final Object... objects) {
        LOGGER.log(Level.INFO, message, objects);
    }

    private Ex03Ordering() {}
    // setup the class
}
