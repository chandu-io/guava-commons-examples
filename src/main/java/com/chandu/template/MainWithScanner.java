package com.chandu.template;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chandrasekhar Thotakura
 */
public enum MainWithScanner {
    
    ONE;
    
    private void demo01(Scanner in) {
        System.out.print("Your name please: ");
        final String name = in.next();
        log("Hi {0}", name);
    }

    public static void main(final String[] tcs) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            ONE.demo01(scanner);
        } catch (Exception ex) {
            log(Level.SEVERE, "[Exception] >> {1}", ex.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    // setup the class
    private static final Logger LOGGER = Logger.getLogger(MainWithScanner.class.getName());
    
    private static void log(final String message, final Object... objects) {
        LOGGER.log(Level.INFO, message, objects);
    }

    private static void log(final Level level, final String message, final Object... objects) {
        LOGGER.log(level, message, objects);
    }

    private MainWithScanner() {}
    // setup the class
}
