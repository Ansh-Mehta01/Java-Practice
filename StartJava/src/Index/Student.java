package Index;

import first.Constructor;

public class Student {
	public Student() {
		this(1,2,3);
		System.out.println("Default Constructor");
	}  
	public Student(int a) {
		this(1,2);
		System.out.println("One Constructor");
	}
	public Student(int a , int b) {
		this();
		System.out.println("Two Constructor");
	}
	public Student(int a, int b , int c) {
		System.out.println("three Constructor");
	}
	public static void main(String[] args) {
		Student cd= new Student(3,4);
	}}
