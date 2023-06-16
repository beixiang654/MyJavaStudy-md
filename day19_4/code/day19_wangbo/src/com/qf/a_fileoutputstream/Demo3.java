package com.qf.a_fileoutputstream;

import java.io.*;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c:/aaa/22.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("c:/bbb/xixi.mp4"));
        byte[] buf = new byte[4 * 1024];
        int length;
        while ((length = bis.read(buf)) != -1) {
            bos.write(buf, 0, length);
        }
        bos.close();
        bis.close();
    }
}
