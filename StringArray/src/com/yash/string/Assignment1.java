package com.yash.string;

import java.util.Scanner;

/*Create a program in which two string is input by the user and after that user will enter index in 
first string where we want to insert the second string and insert the second string at that index 
and create a new string*/

public class Assignment1 {

	static int index;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String :");
		String str1 = sc.next();
		System.out.println("Enter first String :");
		String str2 = sc.next();
		System.out.println(str1.concat(str2));
		System.out.println("Enter index of first where you want to add second String :");

		if (sc.hasNextInt()) {
			index = sc.nextInt();
			String s4 = str1.substring(0, index);
			String s5 = str2.substring(index, str1.length());
			System.out.println(s4 + " " + str2 + " " + s5 + " ");

		} else {
			System.out.println("You have enter wrong input refresh the page and try again");

		}

	}

}
