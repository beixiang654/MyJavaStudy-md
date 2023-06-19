package com.qf.a_stringbuffer;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("a");
        System.out.println(sb);//start
        sb.append("le");
        System.out.println(sb);//startle
        sb.append("startlestartiuytreew");
        System.out.println(sb);


        sb.insert(1, "9");
        System.out.println(sb);//a9lestartlestartiuytreew
        //字符串反转
        System.out.println(sb.reverse());//weertyuitratseltratsel9a
        System.out.println(sb.delete(1, 3));
    }
}
