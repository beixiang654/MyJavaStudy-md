package com.qf.f_xiaofeizheshenchanzhe;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
//多个线程共享的资源的对象
class Goods {
    private String name;//商品的名字
    private double price;//商品的价格
    private boolean isProduct;//是否需要生产
    //true 要生产   false 不需要生产

    public Goods(String name, double price, boolean isProduct) {
        this.name = name;
        this.price = price;
        this.isProduct = isProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isProduct() {
        return isProduct;
    }

    public void setProduct(boolean product) {
        isProduct = product;
    }
}
//消费者线程
class Customer  implements Runnable{
    private Goods goods;

    public Customer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        //消费者开始消费。消费者一直消费，生产者一直生产
        while (true) {//死循环
            synchronized (goods) {
                // true 要生产   false 不需要生产
                if (!goods.isProduct()) {
                    //有商品 直接消费。
                    System.out.println("消费者购买了:" + goods.getName() + ",价格为:" + goods.getPrice());
                    goods.setProduct(true);//没有商品了，去唤醒生产者线程，让其生产。
                    goods.notify();
                } else {
                    //要生产，没有商品，消费者需要等待
                    try {
                        goods.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }

    }
}
//生产者线程
class Productor  implements Runnable{
    private Goods goods;

    public Productor(Goods goods) {
        this.goods = goods;
    }
    @Override
    public void run() {
        while (true) {//死循环
            synchronized (goods) {
                //true 要生产   false 不需要生产
                if (goods.isProduct()) {
                    //开始造车
                    goods.setName("奥迪A8");
                    goods.setPrice(2.78);
                    //生产者生产完以后，给他一个标记 代表有商品了
                    goods.setProduct(false);
                    System.out.println("生产者生产了:" + goods.getName() + ",价格为:" + goods.getPrice());
                    //已经有商品，唤醒消费者
                    goods.notify();
                } else {
                    //不需要生产   生产者需要等待
                    try {
                        goods.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Goods goods = new Goods("五菱宏光", 78, false);
        //两个线程共享的是一个资源
        Customer customer = new Customer(goods);
        Productor productor = new Productor(goods);
        new Thread(customer).start();
        new Thread(productor).start();

    }
}
