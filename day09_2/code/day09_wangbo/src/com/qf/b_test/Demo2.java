package com.qf.b_test;

class Dog {
	private String kind;//Ʒ��
	private int age;//����
	
	//��ֵ
	public void setKind (String kind) {
		this.kind = kind;
	}
	//get������ȡֵ
	public String getKind () {
		return kind;
	}
	public void setAge (int age) {
		//��װ���ڲ���ϸ��
		if (age > 12 || age < 0) {
			this.age = 0;
		} else {
			this.age = age;//ʵ�ʴ���ֵ
		}
		
	}
	public int getAge () {
		return age;
	}
}
public class Demo2 {
	public static void main(String[] args) {
		Dog dog = new Dog();
//		dog.kind = "��˹��";
//		dog.age = 2;
		dog.setKind("��ʿ��");//��ֵ
		System.out.println(dog.getKind());
		dog.setAge(3);
		System.out.println(dog.getAge());
		
		
		
	}
}
