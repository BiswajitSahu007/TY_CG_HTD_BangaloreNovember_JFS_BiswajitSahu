package com.cpg.queue.ArrayDeque;

public class Student implements Comparable<Student> {
	int age;
	String name;
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public int compareTo(Student o) {
		return 1;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
	
}
