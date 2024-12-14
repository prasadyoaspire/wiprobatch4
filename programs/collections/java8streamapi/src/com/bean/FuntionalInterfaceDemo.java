package com.bean;

public class FuntionalInterfaceDemo {

	public static void main(String[] args) {
		
		//option 1
		MyInterface myInterface = new MyClass();
		
		myInterface.test(); //method calling
		
		//option 2 : using anonymous classes		
		MyInterface mi2 = new MyInterface() {
			@Override
			public void test() {
				System.out.println("test implementation inside anonymous class");				
			}			
		};
		
		mi2.test(); // method calling
		
		//option 3: using lambda expression
		MyInterface mi3 = () -> System.out.println("test implementation using lambda");
		
		mi3.test(); //method calling
		

	}

}
