package num;

import java.util.Scanner;

public class Sum_of_natural {

	public static void main(String[] args) {
		int sum=0;
		Scanner ip=new Scanner (System.in);
		System.out.println("Enter the start range");
		int n=ip.nextInt();
		System.out.println("Enter the end range");
		int m=ip.nextInt();
		for(int i=n;i<=m;i++) {
			sum=sum+i;
		}
		System.out.println("The sum of numbers from "+n+" to "+ m+" is "+sum);

	}

}
