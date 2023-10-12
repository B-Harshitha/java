package com;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {'a',20,'A','B',30};
int arr1[]=new int[arr.length];
int j=0;
for(int i=arr.length-1;i>=0;i--) {
	while(arr1[j]>='A'&&arr1[j]<='Z'||arr1[j]>='a'&&arr1[j]<='z') {
		j++;
		
	}
	if(arr[i]>='A'&&arr[i]<='Z'||arr[i]>='a'&&arr[i]<='z') {
		arr1[i]=arr[i];
		continue;
	}
	arr1[j]=arr[i];
	j++;

}
for(int i:arr1) {
	if(i>=65&&i<=90||i>=97&&i<=122) {
		
	System.out.println((char)i+" ");}
	else
		System.out.println(i+" ");
}
	}

}
