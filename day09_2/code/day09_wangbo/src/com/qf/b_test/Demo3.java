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
		cat.setSex('��');
		System.out.println(cat.getSex());
		
		System.out.println("============");
		//�вι��췽��Ҳ�Ƕ����Ը�ֵ��
		//set����Ҳ�Ǹ�ֵ
		Cat cat1 = new Cat("����", 3, 'ĸ', 45.6);
		cat1.setName("СС��");
		cat1.setSex('��');
		System.out.println(cat1.getName() + ":" + cat1.getSex()+ ":" + cat1.getAge());
		//�ܽ�:  �вι��췽�� ��set�������ǿ��Զ����Ը�ֵ��
	
	}
}
