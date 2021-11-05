package com.linecompare.javaprograms;

import java.util.Scanner;

public class Linecomparison {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Line Comparison Computation Program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x-cordinate for point(x1, y1) ");
		int x1 = sc.nextInt();
		System.out.println("Enter y-cordinate for point(x1, y1) ");
		int y1 = sc.nextInt();
		System.out.println("Enter x-cordinate for point(x2, y2) ");
		int x2 = sc.nextInt();
		System.out.println("Enter y-cordinate for point(x2, y2) ");
		int y2 = sc.nextInt();
		
		double length = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		System.out.println("Length of Line : " + length);
		sc.close();
	}

}
