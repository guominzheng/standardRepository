package com.yls.standard.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  时间工具类
 *
 */
public class DataUtil {

    public  final static SimpleDateFormat YYYYMMDD = new SimpleDateFormat("yyyyMMdd");

    public  final static SimpleDateFormat STANDARD_YYYYMMDD = new SimpleDateFormat("yyyy-MM-dd");


    public static  String dateFormatString(String format,Date date){
        return new SimpleDateFormat(format).format(date);
    }

    public static  Date stringFormatDate(String format,String date) throws ParseException {
        return new SimpleDateFormat(format).parse(date);
    }


}
