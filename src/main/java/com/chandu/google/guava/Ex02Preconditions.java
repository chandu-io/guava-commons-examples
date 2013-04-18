package com.chandu.google.guava;

import static com.google.common.base.Preconditions.*;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jaigurusairam
 * http://docs.guava-libraries.googlecode.com/git-history/release/javadoc/com/google/common/base/Preconditions.html
 * 
 */
public enum Ex02Preconditions {
    
    ONE;
    
    public static void main(final String[] args) {
        try {
            ONE.ex01(0, Arrays.asList(0, 1, 2, 3, 4, 5, 6));
        } catch (Exception e) {
            log("Sorry {0} occured.\n{1}", e.getClass().getSimpleName(), e.getMessage());
        }
    }
    
    private void ex01(final int count, final List<Integer> list) {
        checkArgument(count >= 0, "count should be at least [%s]", 0);
        final List<Integer> myList = checkNotNull(list, "list is empty!");
        log("my list = {0}", myList);
    }

    // setup the class
    private static final Logger LOGGER = Logger.getLogger(Ex02Preconditions.class.getName());
    
    private static void log(final String message, final Object... objects) {
        LOGGER.log(Level.INFO, message, objects);
    }

    private Ex02Preconditions() {}
    // setup the class
}
