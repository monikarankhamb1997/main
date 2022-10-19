package com.yash.string;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Finalizedemo.main() starts");
		String s = new String("monika");

		s = null;
		System.gc();
		System.out.println("Finalizedemo.main() ends");

	}

	public void finalize() {
		System.out.println("Finalizedemo.finalize() called");
	}

}
