package com.qf.c_filewriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        //将一个字符串古道西风瘦马 夕阳西下  写入到c:/aaa/4.txt
        File file = new File("c:/aaa/4.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        String str = "古道西风瘦马 夕阳西下";
        //void write(String str);
        //bw.write(str);
        //bw.write(97);这个方法是不用的额！！！！
        //void write(String str, int off, int len);
        //bw.write(str, 3, 2);
        //void write(char[] cbuf, int off, int len);
        //bw.write(str.toCharArray(), 0,  11);
        bw.write("狗蛋");
        bw.newLine();//换行的意思
        bw.write("嘻嘻");
        bw.newLine();
        bw.write("哈哈");
        bw.close();
        fw.close();



    }
}
