package com.chandu.template;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Chandrasekhar Thotakura
 */
public class GoogleCodeJamTemplate {
    
    // Declare variables here
    
    /**
     * This is the solution
     */
    public static void solve(Scanner in, PrintWriter out) {
        // TODO
    }
    
    // Declare other static methods here
    
    /*
     * Just change the fileName and run the program
     */
    public static void main(String[] tcs) {
        final String fileName = "A-small",
                inputExtension = ".in",
                outputExtension = ".out";
        
        Scanner scanner = null;
        PrintWriter printer = null;
        try {
            scanner = new Scanner(new BufferedReader(new FileReader(fileName + inputExtension)));
            printer = new PrintWriter(new BufferedWriter(new FileWriter(fileName + outputExtension)));
            
            solve(scanner, printer);
            
        } catch (FileNotFoundException ex) {
            System.err.println("[FileNotFoundException] >> " + ex.getMessage());
        } catch (IOException ex) {
            System.err.println("[IOException] >> " + ex.getMessage());
        } catch (Exception ex) {
            System.err.println("[Exception] >> " + ex.getMessage());
        } finally {
            if (printer != null) {
                printer.close();
            }
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
