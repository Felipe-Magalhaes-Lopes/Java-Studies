package com.java_studies.p43;

public class Main {

	public static void main(String[] args) {

		Student student = new Student();

		double[] grades = { 10, 9, 9.7, 10 };
		student.setNotas(grades);
		student.setCourses("Computer Science");

		System.out.println(student.toString());

	}
}
