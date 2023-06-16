package com.qf.c_filewriter;

import java.awt.image.BufferedImage;
import java.io.*;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo4 {
    public static void main(String[] args) throws Exception {
        //test1();
        test2();
    }
    public static  void test1 () throws Exception{//字符流
        long start = System.currentTimeMillis();//给当前时间  毫秒
        BufferedReader br = new BufferedReader(new FileReader("c:/aaa/《雪中悍刀行》.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("c:/bbb/1.txt"));
        char[] cbuf = new char[1024];
        int length;
        while ((length = br.read(cbuf)) != -1) {
            bw.write(cbuf, 0, length);
        }
        bw.close();
        br.close();
        long end = System.currentTimeMillis();//给当前时间  毫秒
        System.out.println(end - start);//819 ms
    }
    public static  void test2 () throws Exception{//字节流
        long start = System.currentTimeMillis();//给当前时间  毫秒
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c:/aaa/10递归.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("c:/bbb/8.mp4"));
        byte[] buf = new byte[4 * 1024];
        int length;
        while ((length = bis.read(buf)) != -1) {
            bos.write(buf, 0, length);
        }
        bos.close();
        bis.close();
        long end = System.currentTimeMillis();//给当前时间  毫秒
        System.out.println(end - start);
    }
}
