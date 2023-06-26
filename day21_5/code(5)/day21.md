```
回顾昨天
1.枚举
	特别是枚举类中的构造方法的使用
	枚举类对象会作为普通类的属性   性别
2.八大基本数据类型的包装类
int---》Integer  面试题
	Integer i1 = 127;
	Integer i2 = 127;
	Integer i3 = new Integer(127);
	

```



### 今天的内容

> 1.进程
>
> 2.线程【重点】
>
> 今天学习的目标要入门线程，知道线程是干嘛的！！！

### 1.进程

> 是独立的应用程序
>
> ​		比如咱们电脑的上面  idea   	qq     等这些软件就是一个进程。
>
> ​		windows系统会给进程分配电脑中的资源。分享当前的CPU， 内存， 网卡。等资源
>
> ​		进程特性:
>
> ​			1.独立性
>
> ​						各种之间相互独立
>
> ​			2.互斥性
>
> ​					

### 2.线程

> 进程是可以运行的应用程序，在运行的时候，线程是进程中最小的运行单位。每一个进程至少有一个线程
>
> 如果一个进程没有线程，那么这个进程就没有生命力。
>
> 进程包含了线程，线程是组成进程的最小的基本单位
>
> ​	线程特性：
>
> ​			1.抢占式运行【很重要今天能理解线程】
>
> ​			一个进程在执行的时候，靠获取cpu时间片来执行的。单位时间片是抢占式执行的。
>
> ​			比如一个进程里面有三个线程在执行，同时执行 的？不是三个线程先抢占，假如线程1
>
> ​			先抢到之后，线程1先执行4ms，然后释放资源。三个线程再抢  线程2再执行。执行4ms
>
> ​			如此往复。抢占间隔的时间是比较短的！！所以你感觉这个应用程序一直在执行的！！！
>
> ​			2.资源共享型
>
> ​			线程之间可以共享网卡和cpu的
>

### 3.并行和并发

> 并行:  正真意义上的同时执行。我一边做饭一边看电视
>
> 并发:  同时发生轮流交替执行。我看一会儿电视做一会儿饭

### 4.创建线程的两种方式【重点】

Java程序   Demo1就是一个进程！！！  main方法 是主线程。

问大家一个问题?  一个Demo1写的main方法，有两个 一个主线程,一个是垃圾回收线程

一个线程干一个活。比如 咱们可以让一个线程去打印99乘法表，让另外一个线程打印等腰直角三角形！！！

> 创建线程的第一种方式：
>
>  一个是将一个类声明为`Thread`的子类。 这个子类应该重写`run`类的方法`Thread` 。 然后可以分配并启动子类的实例。

```Java
package com.qf.a_thread;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
//1.将一个类声明为Thread的子类
class MyThread1 extends Thread {
    //2.这个子类应该重写run

    @Override
    public void run() {
        //这个run方法中是做的事情 也叫功能
        for (int i = 0; i < 1000; i++) {
            System.out.println("MyThread1这个线程:" + i);
        }
    }
}
class MyThread2 extends Thread {
    @Override
    public void run() {
        //这个run方法中是做的事情 也叫功能
        for (int i = 0; i < 1000; i++) {
            System.out.println("MyThread2这个线程:" + i);
        }
    }
}
public class Demo1 {
    public static void main(String[] args) {
        //然后可以分配并启动子类的实例。
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();//开启线程start()
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();

    }
}

```

练习：新建两个线程一个线程打印九九乘法表另外一个线程打印直角三角形 

```Java
package com.qf.b_thread;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
//在MyThread1   干打印99乘法表
class MyThread1 extends Thread  {
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }
    }
}
class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class Demo1 {
    public static void main(String[] args) {
        new MyThread1().start();
        new MyThread2().start();
    }
}

```

> 创建线程的第二种方式
>
> 另一种方法来创建一个线程是声明一个类 去实现`Runnable`接口。那个类然后实现了`run`方法。 然后可以分配类的实例，在创建`Thread`时作为参数传递，并启动。 

```Java
package com.qf.c_runnable;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class MyThread1  implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("MyThread1:：中午吃大盘鸡炒饼:" + i);
        }
    }
}
class MyThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("MyThread2:下午吃麻辣小龙鸭:" + i);
        }
    }
}
public class Demo1 {
    public static void main(String[] args) {
        //然后可以分配类的实例
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        //在创建Thread时作为参数传递，并启动
        Thread thread = new Thread(myThread1);
        thread.start();//导致此线程开始执行; Java虚拟机调用此线程的run方法
        Thread thread1 = new Thread(myThread2);
        thread1.start();

    }
}

```

> 练习：新建两个线程第一个线程打印等腰三角形一个线程打印5*5的*  使用第二种方式来写！！！

```Java
package com.qf.c_runnable;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class Mythread3 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class Mythread4 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class Demo2 {
    public static void main(String[] args) {
        new Thread(new Mythread3()).start();
        new Thread(new Mythread4()).start();
    }
}

```

开发中使用第二种方式，实现多个接口。并且还可以继承！！！

```Java
package com.qf.c_runnable;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo3 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("嘻嘻:" + i);
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("哈哈:" + i);
                }
            }
        }).start();
    }
}

```

扩展:第三种创建方式

- 1. 创建 Callable 接口的实现类，并实现 call() 方法，该 call() 方法将作为线程执行体，并且有返回值。

- 2. 创建 Callable 实现类的实例，使用 FutureTask 类来包装 Callable 对象，该 FutureTask 对象封装了该 Callable 对象的 call() 方法的返回值。

- 3. 使用 FutureTask 对象作为 Thread 对象的 target 创建并启动新线程。

- 4. 调用 FutureTask 对象的 get() 方法来获得子线程执行结束后的返回值。

     ```Java
     package com.qf.d_callable;
     
     import java.util.concurrent.Callable;
     import java.util.concurrent.ExecutionException;
     import java.util.concurrent.FutureTask;
     
     /**
      * description:
      * 公司:千锋教育
      * author:博哥
      * 公众号:Java架构栈
      */
     //1.创建 Callable 接口的实现类，并实现 call() 方法，该 call() 方法将作为线程执行体，并且有返回值。
     class CallableThreadTest implements Callable<Integer> {
     
         @Override
         public Integer call() throws Exception {
             int i = 0;
             for (; i < 1000; i++) {
                 System.out.println("当前线程:" + i);
             }
             return i;
         }
     }
     public class Demo1 {
         public static void main(String[] args) throws ExecutionException, InterruptedException {
             //2.创建 Callable 实现类的实例，使用 FutureTask 类来包装 Callable 对象，
             // 该 FutureTask 对象封装了该 Callable 对象的 call() 方法的返回值。
             CallableThreadTest ctt = new CallableThreadTest();
             FutureTask<Integer> ift = new FutureTask<Integer>(ctt);
             //3.使用 FutureTask 对象作为 Thread 对象的 target 创建并启动新线程。
             new Thread(ift).start();
             //4.调用 FutureTask 对象的 get() 方法来获得子线程执行结束后的返回值。
             Integer integer = ift.get();
             System.out.println(integer);
         }
     }
     
     ```

     ## 创建线程的三种方式的对比

     - 1. 采用实现 Runnable、Callable 接口的方式创建多线程时，线程类只是实现了 Runnable 接口或 Callable 接口，还可以继承其他类。
     - 2. Runnable中的线程的方法体run没有返回值。Callable线程需要执行的方法体是返回值。

```
回顾：
	三种创建线程的方式
	1.继承Thread类
	2.实现Runnable接口
	3.实现Callable接口
```



### 5.线程下面几个基础方法

> 构造方法
>
> | `Thread()`分配一个新的 `Thread`对象。                        |
> | ------------------------------------------------------------ |
> | `Thread(Runnable target)`分配一个新的 `Thread`对象。         |
> | `Thread(Runnable target, String name)`分配一个新的 `Thread`对象。给线程起一个名字 |

> 线程下面的方法
>
> | `static Thread` | `currentThread()`返回对当前正在执行的线程对象的引用。        |
> | --------------- | ------------------------------------------------------------ |
> | `String`        | `getName()`返回此线程的名称。线程默认起名字                  |
> | `void`          | `setName(String name)`将此线程的名称更改为等于参数 `name` 。 |

```Java
package com.qf.e_fun;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class MyThread1 implements Runnable {
    @Override
    public void run() {
        //Thread.currentThread()  当前线程对象
        System.out.println("Line 12:" + Thread.currentThread());
        System.out.println("Line 13:" + Thread.currentThread().getName());//Thread-0
    }
}
class MyThread2 implements Runnable {
    @Override
    public void run() {
        //Thread.currentThread()  当前线程对象
        System.out.println("Line 20:" + Thread.currentThread());
    }
}
public class Demo1 {
    public static void main(String[] args) {
        //通过构造方法对线程起名字
        Thread thread = new Thread(new MyThread1(), "狗蛋");
        thread.setName("嘻嘻");
        System.out.println("line19:" + thread);//
        System.out.println("line28:" + thread.getName());//
        thread.start();
        Thread thread1 = new Thread(new MyThread2());
        System.out.println("Line31:"+thread1.getName());
        thread1.start();//Thread-1
    }
}

```

> 线程下面的方法:
>
> | `int`  | `getPriority()`返回此线程的优先级。                |
> | ------ | -------------------------------------------------- |
> | `void` | `setPriority(int newPriority)`更改此线程的优先级。 |

```java 
package com.qf.e_fun;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class MyThread5 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
class MyThread6 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
public class Demo3 {
    public static void main(String[] args) {
        int priority = Thread.currentThread().getPriority();
        System.out.println(priority);//main主线程的默认的优先级的值
        Thread thread = new Thread(new MyThread5(), "线程5");
        thread.setPriority(4);
        thread.start();
        Thread thread1 = new Thread(new MyThread6(), "线程6");
        thread1.setPriority(6);
        thread1.start();

    }
}

```

> | `static void` | `sleep(long millis, int nanos)`导致正在执行的线程以指定的毫秒数加上指定的纳秒数来暂停（临时停止执行），这取决于系统定时器和调度器的精度和准确性。 |
> | ------------- | ------------------------------------------------------------ |
> |               |                                                              |

```java 
package com.qf.e_fun;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
class MyThread8 implements Runnable {
    @Override
    public void run() {
        //这个地方不能throws  只能try-catch 因为方法是重写的。父类没有抛出。所以子类绝对不能抛
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
class MyThread9 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
public class Demo4 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread8(), "线程8");
        thread.start();
        Thread thread1 = new Thread(new MyThread9(), "线程9");
        thread1.start();

    }
}

```



### 6.线程的同步和锁

> 当使用多个线程来访问同一个数据时，将会导致数据不准确，相互之间产生冲突，非常容易出现线程安全问题，比如多个线程都在操作同一数据，都打算修改商品库存，这样就会导致数据不一致的问题。
>
> 线程同步的真实意思，其实是“排队”：几个线程之间要排队，一个一个对共享资源进行操作，而不是同时进行操作。
>
> 所以我们用同步机制来解决这些问题，加入同步锁以避免在该线程没有完成操作之前，被其他线程的调用，从而保证了该变量的唯一性和准确性。
>
> 三个人（三个线程）同时对共享资源（一个坑位）进行操作（抢占）。导致数据不安全的效果。咋解决？
>
> 同步机制，加锁。一个人上厕所，锁住，其他的两个人在外面等待。等待你解决完以后释放掉这个锁以后。其他的线程再进来抢占这个资源。

```Java
package com.qf.d_thread;

//卖票   有两个线程卖票 火车票  总共192张票
//一个线程 第192张票   另外一个线程第191张票
class SaleTicket implements Runnable {

    //tiket  共享资源  线程会操作这个共享资源
    private static int tiket= 192;
    @Override
    public void run() {
        while (true) {
            if (tiket > 0) {
                System.out.println(Thread.currentThread().getName()+ "卖出了第" + tiket + "票");
                tiket--;
            } else {
                System.out.println("买完了");
                break;
            }
        }
    }
}
public class Demo1 {
    public static void main(String[] args) {
        SaleTicket saleTicket = new SaleTicket();
        new Thread(saleTicket, "线程1").start();
        new Thread(saleTicket, "线程2").start();

    }
}

```

```
线程1卖出了第128票
线程2卖出了第200票   出问题了。
线程1卖出了第127票
线程1卖出了第125票
线程1卖出了第124票
```

发现数据安全不安全？不安全的！！！要加锁！！！

> 解决方案：同步方法
>
> 使用关键子 synchronized 修饰一个方法，因为Java对象都会有一个内置的锁对象，使用这个关键字的时候
>
> 修饰方法的时候，这个方法就会被锁保护起来，无论如何执行只保证一个线程在执行这个方法
>
> 语法格式:
>
> ```Java
> public synchronized  void  方法名字 () {
> 
> }
> ```
>
> 

```java 
package com.qf.d_thread;

//卖票   有两个线程卖票 火车票  总共192张票
//一个线程 第192张票   另外一个线程第191张票
class SaleTicket implements Runnable {

    //tiket  共享资源  线程会操作这个共享资源
    private static int tiket= 192;
    //
    @Override
    public synchronized void run() {
        while (true) {
            if (tiket > 0) {
               // tiket=185
                //线程1和线程2同时进入到了if语句了这个代码 有没有这种可能？
                //结果线程1打印了一下  卖出了第185张票
                //线程1 的tiket--还没有自身减1 ，然后线程2把线程1执行权抢了过去
                //此时线程2tiket=185  打印了一下  卖出了第185张票

                System.out.println(Thread.currentThread().getName()+ "卖出了第" + tiket + "票");

                tiket--;
            } else {
                System.out.println("买完了");
                break;
            }
        }
    }
}
public class Demo1 {
    public static void main(String[] args) {
        SaleTicket saleTicket1 = new SaleTicket();//你有一个ticket变量
        //SaleTicket saleTicket2 = new SaleTicket();//也有一个tiket变量
        //就不是一个共享的资源了！！！
        new Thread(saleTicket1, "线程1").start();
        new Thread(saleTicket1, "线程2").start();

    }
}

```

把锁加在了run方法上面不太合适，出现了一家独大情况的！！那咋办？

咱们有些同学说将if语句单独封装一个方法，将if语句加锁

```java 
package com.qf.d_thread;

//卖票   有两个线程卖票 火车票  总共192张票
//一个线程 第192张票   另外一个线程第191张票
class SaleTicket implements Runnable {

    //tiket  共享资源  线程会操作这个共享资源
    private static int tiket= 192;
    //
    @Override
    public  void run() {
        //在这个地方加锁可以不？把while循环加锁可以不？不可以 为啥？
        //
        while (true) {
            test();
            if (tiket <= 0) {
                break;
            }

        }

    }
    public synchronized void test () {
        if (SaleTicket.tiket > 0) {
            System.out.println(Thread.currentThread().getName()+ "卖出了第" + tiket + "票");

            SaleTicket.tiket--;
        } else {
            System.out.println("票已经卖完...");
        }
    }
}
public class Demo1 {
    public static void main(String[] args) {
        SaleTicket saleTicket1 = new SaleTicket();//你有一个ticket变量
        //SaleTicket saleTicket2 = new SaleTicket();//也有一个tiket变量
        //就不是一个共享的资源了！！！
        new Thread(saleTicket1, "线程1").start();
        new Thread(saleTicket1, "线程2").start();

    }
}

```



> 解决方案2：
>
> 换一种解决方案：
>
> ​		同步代码块:  可以将一段代码放到synchronized  括起来的地方，就会对这段代码加上锁
>
> ```Java
> synchronized(this) {
> 	
> }
> ```
>
> 

```java 
package com.qf.d_thread;

//卖票   有两个线程卖票 火车票  总共192张票
//一个线程 第192张票   另外一个线程第191张票
class SaleTicket implements Runnable {

    //tiket  共享资源  线程会操作这个共享资源
    private static int tiket= 192;
    //
    @Override
    public  void run() {
        //在这个地方加锁可以不？把while循环加锁可以不？不可以 为啥？
        //
        while (true) {
            synchronized (this) {
                if (tiket > 0) {
                    // tiket=185
                    //线程1和线程2同时进入到了if语句了这个代码 有没有这种可能？
                    //结果线程1打印了一下  卖出了第185张票
                    //线程1 的tiket--还没有自身减1 ，然后线程2把线程1执行权抢了过去
                    //此时线程2tiket=185  打印了一下  卖出了第185张票

                    System.out.println(Thread.currentThread().getName()+ "卖出了第" + tiket + "票");

                    tiket--;
                } else {
                    System.out.println("买完了");
                    break;
                }
            }

        }
    }
}
public class Demo1 {
    public static void main(String[] args) {
        SaleTicket saleTicket1 = new SaleTicket();//你有一个ticket变量
        //SaleTicket saleTicket2 = new SaleTicket();//也有一个tiket变量
        //就不是一个共享的资源了！！！
        new Thread(saleTicket1, "线程1").start();
        new Thread(saleTicket1, "线程2").start();

    }
}

```

思路： 先讲的线程同步，多个线程共享一个资源，结果发现有问题！！！共享数据出现混乱

想办法解决，加同步锁，先讲了一个同步方法，发现一个线程进来以后，while循环是一个线程执行的

不行，不能出现一家独大的情况！！！咱们同学想到了一种解决方案？把if语句封装成以一个方法

然后对这个方法加同步方法的操作，也是可以的！！！再换一种方法，使用同步代码块的解决方法

需要磨合的

#### 6.1Java中Lock锁【非重点】

> synchronized 在Java中被成为隐式锁，会自动释放锁，是非公平锁。Lock锁被称为显示锁，需要显示的获取和释放。可以设置公平锁
>
> Lock和synchronized 一样的都可以实现线程的同步。但是synchronized 更加强大，更加粒度化，更加灵活。所以一般开发使用synchronized 或者以后会讲线程池。一般开发都用线程池。
>
> Lock是一个接口，实现类是ReenttrantLock
>
> 有两个方法：
>
> ​	lock（）；加锁方法
>
> ​	unlock()；解锁方法

```Java
package com.qf.d_thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SaleTicket1 implements Runnable {
    private static int tiket = 192;
    //换lock一种的写法Lock是一个接口，
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try{
                //上锁
                lock.lock();
                if (tiket > 0) {
                    System.out.println(Thread.currentThread().getName()+ "卖出了第" + tiket + "票");

                    tiket--;
                } else {
                    System.out.println("买完了");
                    break;
                }
            }catch (Exception e) {
                e.printStackTrace();
            }finally {
                //无乱上面有没有异常  我都要释放掉锁的！！！
                lock.unlock();
            }
        }
    }
}
public class Demo2 {
    public static void main(String[] args) {
        SaleTicket1 saleTicket1 = new SaleTicket1();
        new Thread(saleTicket1, "线程1").start();
        new Thread(saleTicket1, "线程2").start();
    }
}

```

### 7.守护线程【非重点】

> 守护线程是用来守护非守护线程的
>
>  每个线程可能也可能不会被标记为守护程序。
>
> 非守护线程一旦结束，守护线程就会挂掉。
>
> 守护线程依附于非守护线程。如果非守护线程消亡。那么守护没有执行完也要挂掉！！！
>
> 帝王制度。皇帝（非守护线程）死了，妻子（守护线程）要陪葬

```Java
package com.qf.e_thread;

class MyThread1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.err.println("守护线程:" + i);
        }
    }
}
class MyThread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("非守护线程:" + i);
        }
    }
}
public class Demo1 {
    public static void main(String[] args) {
        /*public final void setDaemon(boolean on)
        将此线程标记为daemon线程或用户线程。 当运行的唯一线程都是守护进程线程时，Java虚拟机将退出。
        线程启动前必须调用此方法。

        参数
        on - 如果 true ，将此线程标记为守护线程*/
        //java 中默认的都是非守护线程
        Thread thread = new Thread(new MyThread1());
        //MyThread1就变成守护线程了
        thread.setDaemon(true);
        thread.start();
        Thread thread1 = new Thread(new MyThread2());
        thread1.start();
    }
}

```

所有的守护线程都会等待着非守护线程结束。有的时候会发现打印的东西，非守护线程结束，守护线程还在执行

为啥啊？  因为还有内部还有一个垃圾回收线程，在执行是一个非守护线程

### 8.线程的生命周期

> 1.线程的创建，开启线程
>
> 2.可运行状态   线程再等待，线程在抢占
>
> 3.运行状态     线程等待 线程抢占 线程执行
>
> 4.阻塞状态    sleep  ，  加锁  
>
> 5.消亡状态  线程死亡

### 9.死锁

> 开发中禁止使用死锁
>
> 面试会问：
>
> ​	应用场景：并发场景，多线程。线程之间互不相让。
>
> 线程加锁的目的就是为了安全。但是物极必反。
>
> 死锁是一种状态，当两个线程互相持有对方的资源的时候，却又主动释放对方的资源。会导致死锁。代码不会正常的执行。这两个线程就会僵持住。哪个线程都不能往下执行。
>
> 线程1  有锁1   线程1想要使用锁2
>
> 线程 2   有锁2   线程2想要使用锁1
>
> 开锁公司需要身份证。开锁公司给你说: 先出示身份证再开锁   你说:  先开锁，因为身份证在屋里面  所以僵持不下



```Java
package com.qf.a_threa;

class DeadLock implements Runnable {
    private boolean flag;//标记的属性
    private Object obj1;//对象1
    private Object obj2;//对象2
    //有参构造方法

    public DeadLock(boolean flag, Object obj1, Object obj2) {
        this.flag = flag;
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        if (flag) {//如果flag = true ,让线程1执行if语句里面的代码
           synchronized (obj1) {//线程1里面锁的是obj1这个资源
               System.out.println(Thread.currentThread().getName()+ "拿到了锁1对象");
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               //想去使用obj2这个对象
               System.out.println("等待锁2的释放...");
               //出问题了
               //obj1这个资源没有被释放
               //线程1： 我得先用你的obj2资源我才能释放啊
               synchronized (obj2) {//要用obj2这个资源
                   System.out.println(Thread.currentThread().getName() + "->拿到了锁2");

               }
           }
           //synchronizedd大括号里面的代码执行完以后，锁会自动释放掉，代码不会出问题
        }
        if (!flag) {//如果flag = false， 让线程2执行if语句里面的代码
            synchronized (obj2) {//obj2已经加了锁，资源
                System.out.println(Thread.currentThread().getName()+ "拿到了锁2对象");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("等待锁1的释放...");
                //出问题了   obj2资源没有释放
                //线程2说：哥们（线程1）你把obj1资源让我用一下呗
                synchronized (obj1) {//去使用obj1资源
                    System.out.println(Thread.currentThread().getName() + "->拿到了锁1");

                }
            }
        }
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        //第一个线程
        DeadLock deadLock = new DeadLock(true, obj1, obj2);
        new Thread(deadLock, "线程1").start();
        //第二个线程
        DeadLock deadLock1 = new DeadLock(false, obj1, obj2);
        new Thread(deadLock1, "线程2").start();
    }
}

```



```Java
public class SynchronizedThread {
 
    class Bank {
 
        private int account = 200;
 
        public int getAccount() {
            return account;
        }
 
        /**
         * 用同步方法实现
         *
         * @param money
         */
        public synchronized void save(int money) {
            account += money;
        }
 
        /**
         * 用同步代码块实现
         *
         * @param money
         */
        public void save1(int money) {
            synchronized (this) {
                account += money;
            }
        }
    }
 
    class NewThread implements Runnable {
        private Bank bank;
 
        public NewThread(Bank bank) {
            this.bank = bank;
        }
 
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                // bank.save1(10);
                bank.save(10);
                System.out.println(i + "账户余额为：" + bank.getAccount());
            }
        }
 
    }
 
    /**
     * 建立线程，调用内部类
     */
    public void useThread() {
        Bank bank = new Bank();
        NewThread new_thread = new NewThread(bank);
        System.out.println("线程1");
        Thread thread1 = new Thread(new_thread);
        thread1.start();
        System.out.println("线程2");
        Thread thread2 = new Thread(new_thread);
        thread2.start();
    }
 
    public static void main(String[] args) {
        SynchronizedThread st = new SynchronizedThread();
        st.useThread();
    }
 
}
```

