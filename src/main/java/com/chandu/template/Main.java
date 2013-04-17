package com.chandu.template;

import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chandrasekhar Thotakura
 */
public enum Main {
    
    ONE;
    
    private void demo01() {
        final UUID uuid = UUID.randomUUID();
        log("{0}", uuid);
        log(Level.WARNING, "{0}, {1}", uuid, System.currentTimeMillis());
    }

    public static void main(final String[] tcs) {
        ONE.demo01();
    }

    // setup the class
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    
    private static void log(final String message, final Object... objects) {
        LOGGER.log(Level.INFO, message, objects);
    }

    private static void log(final Level level, final String message, final Object... objects) {
        LOGGER.log(level, message, objects);
    }

    private Main() {}
    // setup the class
}