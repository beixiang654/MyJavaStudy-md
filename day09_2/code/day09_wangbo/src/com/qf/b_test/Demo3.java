package com.qf.b_test;

class Cat {
	private String name;
	private int age;
	private char sex;
	private double weight;
	
	
	
	public Cat() {
		
	}
	public Cat(String name, int age, char sex, double weight) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
public class Demo3 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setSex('公');
		System.out.println(cat.getSex());
		
		System.out.println("============");
		//有参构造方法也是对属性赋值的
		//set方法也是赋值
		Cat cat1 = new Cat("大狗子", 3, '母', 45.6);
		cat1.setName("小小狗");
		cat1.setSex('公');
		System.out.println(cat1.getName() + ":" + cat1.getSex()+ ":" + cat1.getAge());
		//总结:  有参构造方法 和set方法都是可以对属性赋值的
	
	}
}
