package com.java.simplilearn;
import java.util.*;

public class ArithmaticCaculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a,b;
		double c,d;
		System.out.println("Please Enter the value of a and b : ");
		a = sc.nextLong();
		b = sc.nextLong();
		System.out.println("Please Enter the value of c and d : ");
		c = sc.nextDouble();
		d = sc.nextDouble();
		ArithmaticCaculator ac = new ArithmaticCaculator();
		ac.addition(a,b);
		ac.subtraction(a,b);
		ac.multiplication(a,b);
		ac.division(c,d);
	}
	
	private void addition(long num1, long num2) {
		long sum = num1 + num2;
		System.out.println("The sum of two numbers = "+sum);
	}
	
	private void subtraction(long num1, long num2) {
		long sub = num1 - num2;
		System.out.println("The subtraction of two numbers = "+sub);
	}
	
	private void multiplication(long num1, long num2) {
		long mul = num1 * num2;
		System.out.println("The multiplication of two numbers = "+mul);
	}
	
	private void division(double num1, double num2) {
		double div = num1/num2;
		System.out.println("The division of two numbers = "+div);
	}
}
