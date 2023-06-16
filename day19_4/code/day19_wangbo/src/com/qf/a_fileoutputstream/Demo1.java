package com.qf.a_fileoutputstream;

import java.io.*;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        //需求:   将Java中的一个字符串的数据  写入到c:/aaa/2.txt
        //1.指定写入的磁盘上面的文件
        File file = new File("c:/aaa/2.txt");
        //2.创建FileOutputstream   字节输出流
        FileOutputStream fos = new  FileOutputStream(file);
        //3.对字节输出流加一个缓冲效果
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        //4.准备一个字符串

        String str = "中国";//将这个字符串写入到磁盘上的2.txt
        //void	write(byte[] b, int off, int len)
        //从指定的字节数组写入 len个字节，从偏移 off开始到缓冲的输出流。
        //将字符串转为字节数组
        byte[] buf = str.getBytes();

        //bos.write(buf, 0, 2);
        bos.write(buf);

        //写完的时候一定要关流
        bos.close();
        fos.close();


    }
}
