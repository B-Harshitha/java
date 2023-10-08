package com;

public class ParticularChar {

	public static void main(String[] args) {
		String n="Harshitha Harshitha Harshitha";
		int count=0;
		for(int i=0;i<=n.length()-1;i++) {
			if(n.charAt(i)=='H'||n.charAt(i)=='h') {
				count++;
			}
		}
		// TODO Auto-generated method stub
		System.out.println(count);
	}

}
