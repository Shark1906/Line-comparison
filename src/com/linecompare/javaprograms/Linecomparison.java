package com.linecompare.javaprograms;

import java.util.Scanner;

public class Linecomparison {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Line Comparison Computation Program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x-cordinate of Point1 of Line1(x1, y1)");
		int x1 = sc.nextInt();
		System.out.println("Enter y-cordinate of Point1 of Line1(x1, y1)");
		int y1 = sc.nextInt();
		System.out.println("Enter x-cordinate of Point2 of Line1(x2, y2)");
		int x2 = sc.nextInt();
		System.out.println("Enter y-cordinate of Point2 of Line1(x2, y2)");
		int y2 = sc.nextInt();
		System.out.println("Enter x-cordinate of Point1 of Line2(x3, y3)");
		int x3 = sc.nextInt();
		System.out.println("Enter y-cordinate of Point1 of Line2(x3, y3)");
		int y3 = sc.nextInt();
		System.out.println("Enter x-cordinate of Point2 of Line2(x4, y4)");
		int x4 = sc.nextInt();
		System.out.println("Enter y-cordinate of Point2 of Line2(x4, y4)");
		int y4 = sc.nextInt();
		
		double length1 = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		double length2 = Math.sqrt(Math.pow(x4-x3, 2) + Math.pow(y4-y3, 2));
		Double line1 = new Double(length1);
		Double line2 = new Double(length2);
		
		//using equals() method
		if(line1.equals(line2)) {
			System.out.println("Both Lines are Equal");
		}
		else {
			System.out.println("Both Lines are not Equal");
		}
		
		//using compareTo() method
		if(line1.compareTo(line2) == 0) {
			System.out.println("Both Lines are Equal");
		}
		else if(line1.compareTo(line2) == 1){
			System.out.println("Line1 is greater");
		}
		else if(line1.compareTo(line2) == -1) {
			System.out.println("Line2 is greater");
		}
		sc.close();
	}

}
