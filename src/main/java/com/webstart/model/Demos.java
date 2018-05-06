/**
 * 
 */
package com.webstart.model;

import java.util.Scanner;

/**
 * @author jorge
 *
 */
public class Demos {

	private static Scanner scan;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte var = 1;
		short dale = 1;
		float flow = (float)1.1;
		char caracter = 'a';
		double letgo = 11.56;
		boolean flag = true;
		// Arithmetic Variables
		int x, y, answer;
		x = 20;
		y = 20;
		// + - * / %
		answer = x / y;
		scan = new Scanner(System.in);
		System.out.println("{0} Hi java again :)! " + var);
		System.out.println("This is a short! " + dale);
		System.out.println("This is a float! " + flow);
		System.out.println("This is a char! " + caracter);
		System.out.println("This is a double! " + letgo);
		System.out.println("This is a bool! " + flag);
		System.out.println("Enter some number: ");
		int user_input = scan.nextInt(); 
		System.out.println("The value is: " + user_input);
		System.out.println("The value of that is: " + x + y + answer);
	}
	
	public static void saySomething() {
		
	}

}
