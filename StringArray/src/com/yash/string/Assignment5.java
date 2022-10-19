package com.yash.string;

public class Assignment5 {
	long t1,t2;
	public void StringBuilderDemo()
	{
		long startTime=System.currentTimeMillis();
		
		StringBuilder sb=new StringBuilder();
		for(long i=1;i<10000000;i++)
		{
			sb.append(i);
			sb.append(" ");
			sb.append(i);
			sb.append(" ");
			sb.append(i);
			sb.append(i);
			sb.append(" ");
			sb.append(" ");
			sb.append(i);
		}
		System.out.println("Time taken by StringBulider is :"+(t1=(System.currentTimeMillis())-startTime)+"ms");
	}
	public void StringBufferDemo()
	{
		long startTime=System.currentTimeMillis();
		StringBuffer sb=new StringBuffer();
		for(long i=1;i<10000000;i++)
		{
			sb.append(i);
			sb.append(" ");
			sb.append(i);
			sb.append(" ");
			sb.append(i);
			sb.append(i);
			sb.append(" ");
			sb.append(" ");
			sb.append(i);
		}
		System.out.println("Time taken by StringBuffer is :"+(t2=(System.currentTimeMillis())-startTime)+"ms");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment5 a=new Assignment5();
		a.StringBuilderDemo();
		a.StringBufferDemo();
		System.out.println("More Time required for string buffer: " + (a.t2 - a.t1));

	}

}
