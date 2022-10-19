package com.yash.collection1;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
	// WAP to sort Collection elements in ascending order.
	public static void main(String[] agrs) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("A");
		al.add("Y");
		al.add("K");

		Collections.sort(al);
		System.out.println(al);

	}
}
