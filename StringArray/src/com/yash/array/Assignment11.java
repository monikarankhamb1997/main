package com.yash.array;

/*
 * WAP to remove the String which is not palindrome string from the array of
 * String.
 */
public class Assignment11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = { "aba", "pune", "caddac", "mumbai", "yash" };

		for (int i = 0; i < str.length; i++) {

			if (str[i].equalsIgnoreCase(isPalindrome(str[i]))) {

				System.out.print(str[i] + " ");

			}

		}
	}

	public static String isPalindrome(String reverse) {

		String temp = reverse;

		String rev = "";

		for (int i = temp.length() - 1; i >= 0; i--) {

			rev = rev + temp.charAt(i);

		}

		return rev;

	}

}
