package com.collection.examples.CollectionPrograms;

public class TestMainClass {
int a=0;
	{
	System.out.println("initialization block"+a);	
	}
	public static void main(String[] args) {
		System.out.println(args.length);
		staticMethod();
		
	}
	
	
	static {
		System.out.println("Static block3");
	}
	static {
		System.out.println("Static block");
	}
	static {
		System.out.println("static block2");
	}
	static void staticMethod() {
		System.out.println("in static method");
	}
	
}
