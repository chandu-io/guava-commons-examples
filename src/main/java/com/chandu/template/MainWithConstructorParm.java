package com.chandu.template;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chandrasekhar Thotakura
 */
public enum MainWithConstructorParm {
    
    ONE(System.currentTimeMillis());
    
    private long timestamp;
    
    private void demo01() {
        log("{0}", timestamp);
        log(Level.WARNING, "{0} <<>> {1}", System.nanoTime(), timestamp);
    }

    public static void main(final String[] tcs) {
        ONE.demo01();
        log("{0} == {1}", ONE.name(), ONE.toString());
    }

    // setup the class
    private static final Logger LOGGER = Logger.getLogger(MainWithConstructorParm.class.getName());
    
    private static void log(final String message, final Object... objects) {
        LOGGER.log(Level.INFO, message, objects);
    }

    private static void log(final Level level, final String message, final Object... objects) {
        LOGGER.log(level, message, objects);
    }

    private MainWithConstructorParm(final long timestamp) {
        this.timestamp = timestamp;
    }
    // setup the class
}
