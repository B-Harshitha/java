package com;

public class Sum {
	static int n=5;
	static int sum=0;
	static void add(int i) {
		if(i<=n) {
			sum=sum+i;
			add(i++);
		}
		System.out.println(sum);
}

	public static void main(String[] args) {
		add(1);
		
		
}
}
