package com.qf.g_date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        //Mon Jun 19 16:31:07 IRKT 2023
        //以上的时间进行格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(date);
        System.out.println(format);
        //Date是专门表示时间的
        //获取当前的年份
        System.out.println(date.getYear() + 1900);
        System.out.println(date.getMonth() + 1);
        //这个日是星期1
        //返回由此日期表示的星期几。 返回值（ 0 =星期日， 1 =星期一， 2 =星期二， 3 =星期三， 4 =星期四， 5 =星期五， 6 =星期六）
        // 表示包含或以此时间表示的时刻开始的星期几Date对象，如当地时区所解释。
        System.out.println(date.getDay());//1
        System.out.println(date.getDate());//19
    }
}
