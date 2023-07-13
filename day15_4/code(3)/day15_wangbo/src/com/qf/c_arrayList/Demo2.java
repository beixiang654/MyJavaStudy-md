package com.qf.c_arrayList;

import java.util.Arrays;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr1 = Arrays.copyOf(arr, 6);
        System.out.println(Arrays.toString(arr1));
    }
}
