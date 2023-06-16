package com.qf.a_fileoutputstream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo2 {
    public static void main(String[] args) throws Exception{
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("c:/aaa/3.txt"));
        byte[] bytes = "我欲乘风归去".getBytes();
        bos.write(bytes);
        bos.close();

    }
}
