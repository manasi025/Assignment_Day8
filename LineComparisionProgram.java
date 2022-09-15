//Line Comparison Program 

package com.day8;

import java.util.Scanner;

public class LineComparisionProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Line Comparision Computation Program!");
		
		int x1, x2, y1, y2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for point x1 : ");
		x1 = sc.nextInt();
		System.out.println("Enter value for point y1 : ");
		y1 = sc.nextInt();
		System.out.println("Enter value for point x2 : ");
		x2 = sc.nextInt();
		System.out.println("Enter value for point y2 : ");
		y2 = sc.nextInt();
		
		length(x1, x2, y1, y2);
	}

	private static void length(int x1, int x2, int y1, int y2) {
		// TODO Auto-generated method stub
		
		double len, sqrt;
		len = ((x2 - x1)^2 - (y2 - y1)^2);
		sqrt = Math.sqrt(len);
		System.out.print("Length of Line is : " + sqrt);
	}

	

}
