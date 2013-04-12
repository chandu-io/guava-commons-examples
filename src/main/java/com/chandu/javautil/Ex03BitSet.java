/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.chandu.javautil;

import java.util.BitSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jaigurusairam
 */
public enum Ex03BitSet {
    
    ONE;
    
    private void demo01() {
        final BitSet bitSet = new BitSet();
        log("{0}", bitSet.size());
        bitSet.set((int)(Math.random() * 64));
        bitSet.set((int)(Math.random() * 64));
        log("Cardinality = {0}", bitSet.cardinality());
        log("Next Set Bit = {0}", bitSet.nextSetBit(0));
    }

    public static void main(final String[] tcs) {
        ONE.demo01();
    }

    // setup the class
    private static final Logger LOGGER = Logger.getLogger(Ex03BitSet.class.getName());
    
    private static void log(final String message, final Object... objects) {
        LOGGER.log(Level.INFO, message, objects);
    }

    private Ex03BitSet() {}
    // setup the class
}
