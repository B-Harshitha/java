package com;

public class Array2 {

	public static void main(String[] args) {
		int arr[]= {'a',20,'A','B',30};
		int arr1[]=new int[arr.length];
		int j=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>='A'&&arr1[i]<='Z'||arr1[i]>='a'&&arr1[i]<='z') {
				arr[i]=arr[i];
				
				j++;
			}
		}
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print((arr[i]+" "));
		}
		

	}

}
