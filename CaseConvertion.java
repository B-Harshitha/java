package com;

public class CaseConvertion {

	public static void main(String[] args) {
		String s="hElLo";
		String s1="";
		for(int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)>='a'&& s.charAt(i)<='z') {
				s1=s1+(char)(s.charAt(i)-32);
			}
			else if(s.charAt(i)>='A'&& s.charAt(i)<='Z') {
				s1=s1+(char)(s.charAt(i)+32);
			}
			else {
				
					s1=s1+s.charAt(i);
				}
			}
				
		System.out.println(s1);
	}

}
