package com;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n="Harshitha Harshitha  Harshitha";
//		int count=0;
		String n1="";
		for(int i=0;i<=n.length()-1;i++) {
			int j=i+1;
			if(n.charAt(i)==' ' && n.charAt(j)==' ') {
				n1=n1+n.replace(' ', ' ');
			
			}
			else {
				n1=n1+n.charAt(i);
			}
			}
		
		System.out.println(n1);
		// TODO Auto-generated method stub
		

	}

}
