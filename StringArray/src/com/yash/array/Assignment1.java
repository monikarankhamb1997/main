package com.yash.array;

import java.util.Arrays;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 23, 21, 10, 29, 33 };
		int largest = arr[0];
		Arrays.sort(arr);
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = i + 1; j <= arr.length; j++) {
				if (arr[i] > largest) {
					largest = arr[i];
				}
			}
			System.out.print(largest+" ");
		}
		System.out.println();
		for(int k=0;k<=arr.length;k++)
		{
			if(k==3)
			{
				System.out.println("largest third number :"+arr[k]);
			}
		}

	}

}
