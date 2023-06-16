package com.qf.b_test;

class Dog {
	private String kind;//品种
	private int age;//年龄
	
	//赋值
	public void setKind (String kind) {
		this.kind = kind;
	}
	//get方法获取值
	public String getKind () {
		return kind;
	}
	public void setAge (int age) {
		//封装的内部的细节
		if (age > 12 || age < 0) {
			this.age = 0;
		} else {
			this.age = age;//实际传的值
		}
		
	}
	public int getAge () {
		return age;
	}
}
public class Demo2 {
	public static void main(String[] args) {
		Dog dog = new Dog();
//		dog.kind = "哈斯其";
//		dog.age = 2;
		dog.setKind("哈士奇");//赋值
		System.out.println(dog.getKind());
		dog.setAge(3);
		System.out.println(dog.getAge());
		
		
		
	}
}
