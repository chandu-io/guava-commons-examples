package com.chandu.template;

import java.io.Console;

/**
 *
 * @author Chandrasekhar Thotakura
 */
public enum ConsoleMain {
    
    ONE;
    
    private void demo01() {
        lg("First Name: ");
        final String firstName = CONSOLE.readLine();
        final String lastName = CONSOLE.readLine("Last Name: ");
        log("Your full name is " + firstName + " " + lastName, "-------");
    }

    public static void main(final String[] tcs) {
        if (CONSOLE == null) {
            log("CONSOLE is null. Run this program from command line.");
            System.exit(1);
        }
        ONE.demo01();
    }

    // setup the class
    private static final Console CONSOLE = System.console();
    
    private static void lg(final Object object) {
        System.out.print(object);
    }

    private static void log(final Object... objects) {
        for (Object obj : objects) {
            System.out.println(obj);
        }
    }

    private static void err(final Object object) {
        System.err.println(object);
    }

    private ConsoleMain() {}
    // setup the class
}
