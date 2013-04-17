package com.chandu.template;

import java.io.Console;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chandrasekhar Thotakura
 */
public enum ConsoleMain {
    
    ONE;
    
    private void demo01() {
        System.out.print("First Name: ");
        String firstName = CONSOLE.readLine();
        String lastName = CONSOLE.readLine("Last Name: ");
    }

    public static void main(final String[] tcs) {
        if (CONSOLE == null) {
            log(Level.SEVERE, "CONSOLE is null :(");
            System.exit(1);
        }
        ONE.demo01();
    }

    // setup the class
    private static final Console CONSOLE = System.console();
    private static final Logger LOGGER = Logger.getLogger(ConsoleMain.class.getName());
    
    private static void log(final String message, final Object... objects) {
        LOGGER.log(Level.INFO, message, objects);
    }

    private static void log(final Level level, final String message, final Object... objects) {
        LOGGER.log(level, message, objects);
    }

    private ConsoleMain() {}
    // setup the class
}
