package com.chandu.template;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chandrasekhar Thotakura
 */
public enum BasicFileIO {
    
    ONE;
    
    private void demo01() throws FileNotFoundException, IOException {
        String inputFileName = "somefile.in";
        String outputFileName = "otherfile.out";
        
        // character stream
        Reader reader = new BufferedReader(new FileReader(inputFileName));
        Writer writer = new BufferedWriter(new FileWriter(outputFileName));
        // do something
        writer.close();
        reader.close();
        
        // byte stream
        InputStream in = new BufferedInputStream(new FileInputStream(inputFileName));
        OutputStream out = new BufferedOutputStream(new FileOutputStream(outputFileName));
        // do something
        out.close();
        in.close();
        
        // scanner and formatter
        Scanner scanner = new Scanner(new BufferedReader(new FileReader(inputFileName)));
        PrintWriter printer = new PrintWriter(new BufferedWriter(new FileWriter(outputFileName)));
        // do something
        printer.close();
        scanner.close();

        // special case --> custom encoding
        Reader reader1 = new BufferedReader(new InputStreamReader(new FileInputStream(inputFileName), "UTF-8"));
        Writer writer1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFileName), "UTF-8"));
        // do something
        writer1.close();
        reader1.close();
        
        // NOTE: Always try to use "Buffered streams"
    }

    public static void main(final String[] tcs) throws FileNotFoundException, IOException {
        ONE.demo01();
    }

    // setup the class
    private static final Logger LOGGER = Logger.getLogger(BasicFileIO.class.getName());
    
    private static void log(final String message, final Object... objects) {
        LOGGER.log(Level.INFO, message, objects);
    }

    private static void log(final Level level, final String message, final Object... objects) {
        LOGGER.log(level, message, objects);
    }

    private BasicFileIO() {}
    // setup the class
}
