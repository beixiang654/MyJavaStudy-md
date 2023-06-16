package com.qf.a_test;

class Person {
	String name;//名字属性
	int age;//年龄 属性
	
	//无参构造方法
	public Person () {
		
	}
	//有参构造方法
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	//方法
	public void work () {
		System.out.println("人活着就要工作！！！");
	}
	
	
}
//主类
public class Demo1 {
	public static void main(String[] args) {
		//通过 类创建对象 吧官方术语 实例化对象
		Person person = new Person();//无参构造方法创建
		person.name = "狗蛋";
		person.age = 20;
		person.work();
		
		
		System.out.println(person.name +":" + person.age);
		Person person1 = new Person("张三", 78);//有参构造方法创建的对象
		System.out.println(person1.name +":" + person1.age);
		
		
		
	}
}
