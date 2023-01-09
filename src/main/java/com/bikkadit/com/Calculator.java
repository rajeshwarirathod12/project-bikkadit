package com.bikkadit.com;

public class Calculator {

	public int sum(int a, int b) {

		int c = a + b;
		System.out.println("Addition of a and b" + c);
		return c;

	}

	public int sub(int a, int b) {

		int c = a - b;
		System.out.println("Substraction of a and b" + c);
		return c;

	}

	public int mult(int a, int b) {

		int c = a * b;
		System.out.println("Multiplication of a and b" + c);
		return c;

	}

	public int div(int a, int b) {

		int c = a / b;
		System.out.println("Division of a and b" + c);
		return c;

	}

}
