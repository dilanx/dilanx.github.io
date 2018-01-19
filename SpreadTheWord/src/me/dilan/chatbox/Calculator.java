package me.dilan.chatbox;

import java.util.Scanner;

public class Calculator {

	
	
	public Calculator() {
		System.out.println("Enter first number");
		Scanner s = new Scanner(System.in);
		double one = s.nextDouble();
		System.out.println("Enter second number");
		double two = s.nextDouble();
		
		System.out.println("+/-/*//");
		String o = s.next();
		
		double res = 0.0;
		
		if (o.equals("+")) res = one + two;
		if (o.equals("-")) res = one - two;
		if (o.equals("*")) res = one * two;
		if (o.equals("/")) res = one / two;

		
		System.out.println(res);
		s.close();
	}
	
	
	
	
	
	public static void main(String[] args) {
		new Calculator();
	}
	
	
}
