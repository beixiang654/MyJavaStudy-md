package com.qf.a_test;

class Person {
	String name;//��������
	int age;//���� ����
	
	//�޲ι��췽��
	public Person () {
		
	}
	//�вι��췽��
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	//����
	public void work () {
		System.out.println("�˻��ž�Ҫ����������");
	}
	
	
}
//����
public class Demo1 {
	public static void main(String[] args) {
		//ͨ�� �ഴ������ �ɹٷ����� ʵ��������
		Person person = new Person();//�޲ι��췽������
		person.name = "����";
		person.age = 20;
		person.work();
		
		
		System.out.println(person.name +":" + person.age);
		Person person1 = new Person("����", 78);//�вι��췽�������Ķ���
		System.out.println(person1.name +":" + person1.age);
		
		
		
	}
}
