package com.qf.b_enum;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
enum ProductEnum {
    //利用有参构造方法对枚举属性进行赋值
    UP(0, "在架"), DOWN(1, "下架");

    private Integer code;
    private String message;
    //可以提供一个有参构造方法
    ProductEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
public class Demo5 {
    public static void main(String[] args) {
        System.out.println(ProductEnum.UP.getCode());
        System.out.println(ProductEnum.UP.getMessage());
        System.out.println(ProductEnum.DOWN.getCode());
        System.out.println(ProductEnum.DOWN.getMessage());
    }
}
