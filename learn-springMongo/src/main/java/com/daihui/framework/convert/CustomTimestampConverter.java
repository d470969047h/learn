package com.daihui.framework.convert;

import org.apache.log4j.Logger;
import org.springframework.core.convert.converter.Converter;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomTimestampConverter implements Converter<String, Timestamp> {
    private static final Logger logger = Logger.getLogger(CustomTimestampConverter.class);


    public Timestamp convert(String source) {
        if ((null == source) || (source.trim().length() == 0)) {
            return null;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date tmpDate = dateFormat.parse(source);
            return new Timestamp(tmpDate.getTime());
        } catch (ParseException e) {
            if (logger.isDebugEnabled()) {
                logger.error(e.getMessage(), e);
            }
            throw new IllegalArgumentException(source + "不是一个有效的日期值");
        }
    }
}
