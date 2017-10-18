package com.daihui.framework.convert;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 自定义返回JSON 数据格中日期格式化处理
 */
public class CustomDateSerializer extends JsonSerializer<Date> {
    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");


    public void serialize(Date value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
        String formattedDate = SIMPLE_DATE_FORMAT.format(value);
        jgen.writeString(formattedDate);
    }

}
