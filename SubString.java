package com;

public class SubString {

	public static void main(String[] args) {
		String s="Gggg";
		String t="ggg";
		int n=t.length();
		String w="";
		for(int i=0;i<s.length()-n;i++) {
			String s1="";
			for(int j=i;j<i+n;j++) {
				s1+=s.charAt(j);
			}
			if(s1.equals(t)) {
				w=s1;
			}
			}
		if(t.equals(w)) {
			System.out.println(t+" is a sub string of "+s);
		}
		else {
			System.out.println("not");
		}
		
	}

}
