package common.util;

import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by trh on 2017/11/19.
 */
public class TimeUtil {


    private static ThreadLocal<SimpleDateFormat> dateFormatThreadLocal = new ThreadLocal<SimpleDateFormat>() {
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat();
        }
    };

    public static String format(Date date) {
        return dateFormatThreadLocal.get().format(date);
    }


    @Test
    public void testFormat() {
        System.out.println(format(new Date()));
    }
}

