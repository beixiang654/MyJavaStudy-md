package com.qf.c_filewriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo3 {
    public static void main(String[] args) throws Exception{
        //先读取图片，然后写入到另外一个文件夹下面
        //发现字符流无法处理 图片 音频 视频 等 只能使用字节流
        //但是文本文档可以处理的！！！
        BufferedReader br = new BufferedReader(new FileReader("c:/aaa/《雪中悍刀行》.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("c:/bbb/1.txt"));
        char[] cbuf = new char[1024];
        int length;
        while ((length = br.read(cbuf)) != -1) {
            bw.write(cbuf, 0, length);
        }
        bw.close();
        br.close();
    }
}
