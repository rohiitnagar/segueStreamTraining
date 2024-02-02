package com.JavaPractice;

public class  Abstract_Impli extends Abstract_new implements Inter_Parent{
	public  void test()
	{
		System.out.println("this is abstract");
	}
	public void verify()
	{
		System.out.println("this is interface");
 
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Abstract_Impli ref=new Abstract_Impli();
		ref.test();
		ref.test1();
		ref.verify();
	}
 
}