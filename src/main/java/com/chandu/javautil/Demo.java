package com.chandu.javautil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

/**
 *
 * @author jaigurusairam
 */
public enum Demo {
    
    ONE;
    
    private void demo01() {
        final Date somday = new GregorianCalendar(1900, 0, 1).getTime();
        
        final Date otherday = new Date();
        otherday.setYear(1900);
        otherday.setMonth(0);
        otherday.setDate(1);
        
        final String fmtStr = "yyyy-MM-dd KK:mm:ss:SSS a";
        
        log("\nDate = {0}\nDate = {1}",
                DateFormatUtils.format(somday, fmtStr),
                DateFormatUtils.format(otherday, fmtStr));
    }

    private void demo02() {
        final String dateString = "1900-01-01 00:00:00:000 AM";
        final String fmtStr = "yyyy-MM-dd KK:mm:ss:SSS a";
        try {
            log("Date = {0}", DateUtils.parseDate(dateString, fmtStr));
        } catch (ParseException ex) {
            log(ex.getMessage());
        }
    }

    public static void main(final String[] tcs) {
        ONE.demo01();
        ONE.demo02();
    }

    // setup the class
    private static final Logger LOGGER = Logger.getLogger(Demo.class.getName());
    
    private static void log(final String message, final Object... objects) {
        LOGGER.log(Level.INFO, message, objects);
    }

    private Demo() {}
    // setup the class
}
