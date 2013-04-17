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
    
    private static Scanner in = null;
    private static PrintWriter out = null;
    
    private static final String fileName = "files/A-sample";
    private static final String inExt = ".in";
    private static final String outExt = ".out";
    
    private static final String caseNum = "Case #";
    private static final String colon = ": ";
    
    /*
     * This is the solution
     */
    private static void solve() {
        final int T = in.nextInt();
        for (int t = 0; t < T; t += 1) {
            // main logic here
            printResult(t, Integer.toString(t));
        }
    }
    
    /*
     * Print the test case result
     */
    private static void printResult(final int testCase, final String result) {
        out.println(caseNum + (testCase + 1) + colon + result);
    }
    
    /*
     * Just change the fileName and run the program
     */
    public static void main(final String[] tcs) {
        try {
            
            in = new Scanner(new BufferedReader(new FileReader(fileName + inExt)));
            out = new PrintWriter(new BufferedWriter(new FileWriter(fileName + outExt)));
            
            solve();
            
        } catch (FileNotFoundException ex) {
            System.err.println("[FileNotFoundException] >> " + ex.getMessage());
        } catch (IOException ex) {
            System.err.println("[IOException] >> " + ex.getMessage());
        } catch (Exception ex) {
            System.err.println("[Exception] >> " + ex.getMessage());
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
