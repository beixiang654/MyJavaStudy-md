package com.qf.b_filereader;

import java.io.*;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        // 从磁盘上面某一个1.txt文件，读取数据到内存  (使用的字符输入流)
        File file = new File("c:/aaa/1.txt");
        FileReader fr = new FileReader(file);
        //本身是不具备缓冲效果的。可以使用BufferedReader
        BufferedReader br = new BufferedReader(fr);
        //int i = br.read();//返回值是一个字符的ascii码的值
        //声明了一个字符的缓冲数组
       char[] cbuf = new char[3];//缓冲数组是空的
//        int read = br.read(cbuf);
//        System.out.println(read);//读到数组中的值
//        System.out.println(cbuf);
//        System.out.println("=======");
//        int read1 = br.read(cbuf);
//        System.out.println(read1);//读到数组中的值
//        System.out.println(cbuf);
//        System.out.println("=======");
//        int read2 = br.read(cbuf);
//        System.out.println(read2);//读到数组中的值
//        System.out.println(cbuf);
//        System.out.println("=======");
//        int read3 = br.read(cbuf);
//        System.out.println(read3);//读到数组中的值
//        System.out.println(cbuf);
//        System.out.println("=======");
//        int read4 = br.read(cbuf);
//        System.out.println(read4);//读到数组中的值
//        System.out.println(cbuf);
        //针对于想法循环
        int length;
        while ((length = br.read(cbuf)) != -1) {
            System.out.println(new String(cbuf, 0, length));
        }
        br.close();
        fr.close();
    }
}
