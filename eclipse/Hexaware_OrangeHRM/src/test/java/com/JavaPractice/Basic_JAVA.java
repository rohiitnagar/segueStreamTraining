package com.JavaPractice;

public class Basic_JAVA{
	
	//Constructors
	// Default Constructor
	public Basic_JAVA() {
		System.out.println("This is defauklt Constructor");
	}
	
	//INT
	public Basic_JAVA(int i) {
			//Calling default constructor in INT --- Use of this()
			this();
			System.out.println("This is INT");
	}
	
	//String
	public Basic_JAVA(String s) {
			//Calling INT Constructor in String ---- Constructor OVerloading
			this(2);
		System.out.println("String Constructor");
	}
	
	//Test MEthod
	public static void test() {
		System.out.println("This is static method - Test ");
	}
	int a = 20;
	
	//MAIN 
	public static void main(String[] args) {
		Basic_JAVA.test();
		Basic_JAVA ref = new Basic_JAVA("Rohit");
		System.out.println(ref.a);
		
	}
	
}