package com.yash.string;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String :");
		String str = sc.next();
		String temp="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
		
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				continue;
			}
			temp=temp+ch;
		}
		System.out.println(temp);
	}

}
