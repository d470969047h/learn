package com.daihui.widget.easyexcel.read;

/**
 * 基础数据类.这里的排序和excel里面的排序一致
 *
 * @author Jiaju Zhuang
 **/

import lombok.Data;

import java.util.Date;


@Data
public class DemoData {
    private String string;
    private Date date;
    private Double doubleData;
}
