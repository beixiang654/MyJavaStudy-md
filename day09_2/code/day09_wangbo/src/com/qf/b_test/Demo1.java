package com.qf.b_test;

class Person {
	//加private之后，就变成私有的只能在当前类中，外部的类 不能直接访问
	//1.加private 修饰
   private String name;
   private int age;
   
   //set方法  一般  set+属性  属性首字母要大写  告知别人  对哪个属性在赋值！！！
   public void setName (String name) {
	   this.name = name;
   }
   //get方法 取值
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
		//field Person.name is not visible  不可视化
//		person.name = "狗蛋";
//		person.age = 23;
//		System.out.println(person.name + ":" + person.age);
		person.setName("狗蛋");//赋值
		System.out.println(person.getName());
		person.setAge(45);
		System.out.println(person.getAge());
		
		
	}
}
