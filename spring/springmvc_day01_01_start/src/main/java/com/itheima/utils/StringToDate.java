package com.itheima.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate implements Converter<String, Date> {
    /**
     *
     * @param source 传入进来的字符串
     * @return
     */
    @Override
    public Date convert(String source) {
//        如果source==null
        if (source==null){
            throw new RuntimeException("请传入参数");
        }
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
//        把字符串转换为日期
        try {
           return df.parse(source);
        } catch (ParseException e) {
            throw new RuntimeException("数据类型转换出现错误");
        }

    }
}
