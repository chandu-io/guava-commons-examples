package com.chandu.google.guava;

import com.google.common.base.Optional;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public enum Ex01Optional {

    ONE;
    
    public static void main(final String[] tcs) {
        ONE.example1();
    }

    private void example1() {
        final Optional<Integer> possible = Optional.of(5);
        if (possible.isPresent()) {
            log("Integer = {0}, {1}", possible.get(), "Chandu");
        }

        final Optional<Date> date = Optional.fromNullable(null);
        log("Date = {0}", date.or(new Date()));
    }

    // setup the class
    private static final Logger LOGGER = Logger.getLogger(Ex01Optional.class.getName());
    
    private static void log(final String message, final Object... objects) {
        LOGGER.log(Level.INFO, message, objects);
    }

    private Ex01Optional() {}
    // setup the class
}
