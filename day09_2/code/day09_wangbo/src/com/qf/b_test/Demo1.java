package com.qf.b_test;

class Person {
	//��private֮�󣬾ͱ��˽�е�ֻ���ڵ�ǰ���У��ⲿ���� ����ֱ�ӷ���
	//1.��private ����
   private String name;
   private int age;
   
   //set����  һ��  set+����  ��������ĸҪ��д  ��֪����  ���ĸ������ڸ�ֵ������
   public void setName (String name) {
	   this.name = name;
   }
   //get���� ȡֵ
   public String getName () {
	   return name;
   }
   
   public void setAge (int age) {
	   this.age = age;
   }
   public int getAge () {
	   return age;
   }
}
public class Demo1 {
	public static void main(String[] args) {
		Person person = new Person();
		//field Person.name is not visible  �����ӻ�
//		person.name = "����";
//		person.age = 23;
//		System.out.println(person.name + ":" + person.age);
		person.setName("����");//��ֵ
		System.out.println(person.getName());
		person.setAge(45);
		System.out.println(person.getAge());
		
		
	}
}
