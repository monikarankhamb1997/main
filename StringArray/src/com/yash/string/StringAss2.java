package com.yash.string;

import java.util.Arrays;
import java.util.Scanner;

public class StringAss2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String :");
		String str = sc.next();
		char ch[] = str.toCharArray();
		//Arrays.sort(ch);
		String str1 = "";
		char temp1, temp;
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;

				}

			}
		}
		System.out.println("asending order: " + new String(ch));
		char ch1[] = str.toCharArray();
		// Arrays.sort(ch1);
		for (int i = ch1.length - 1; i >= 0; i--) {
			for (int j = ch1.length - 1; j >= i; j--) {
				if (ch1[i] < ch1[j]) {
					temp1 = ch1[i];
					ch1[i] = ch1[j];
					ch1[j] = temp1;
				}
			}
		}
		System.out.println("desending order: " + new String(ch1));

	}

}
