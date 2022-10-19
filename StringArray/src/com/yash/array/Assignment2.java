package com.yash.array;
/* WAP to find duplicate numbers and there counting from list of numbers*/
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 23, 11, 22, 28, 11, 10, 10,11, 20 };
		int count1 = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j] && j < i) {
					break;
				}

				if (arr[i] == arr[j]) {
					count++;
					count1++;
				}

			}

			if (count > 1) {
				System.out.println(arr[i] + " is repeating " + count + " times ");

			}

		}

	}
}
