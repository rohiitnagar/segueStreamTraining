package com.JavaPractice;

public class Child_1 extends Parent_Class{
	
	Child_1(){
		super();
		System.out.println("Default Constructor od Child 1");
	}
	
	Child_1(int i){
		this();
		System.out.println("Integer Constructoe od Child 1");
	}
	
	Child_1(String s){
		this(20);
		System.out.println("String Constructoer of Child 1");
		
	}
	public void test1() {
		this.test1(10);
		System.out.println("This is child 1 Method ");
	}
	
	public void test1(int i) {
		this.test1("Rohit");
		System.out.println("This is Overloaded INT METHOD");
	}
	
public void test1(String s) {
		super.test();
		System.out.println("This Overloaded Mrthod for String");
		}


	public static void main(String[] args) {
		Child_1 c1 = new Child_1("Rohit");
//		c1.test();
//		c1.test1();
//	    Child_2 c2 = new Child_2();
//	    c2.test();
//	    c2.test3();
		c1.test1();
		
	}
}
