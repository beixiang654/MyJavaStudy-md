package com.qf.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo7 {
     public static void main(String[] args) {
          List<String> strings = new ArrayList<>();
          strings.add("老邢");
          strings.add("老邢xiao");
          strings.add("骚磊");
          strings.add("大骚磊");
          strings.add("xiao邢");
          strings.add("xiao老邢");
          strings.add("小骚磊");
          strings.stream().skip(9).limit(3).forEach(s-> System.out.println(s));
     }
}
