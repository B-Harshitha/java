package num;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,power=1;
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the base value value");
		int n=ip.nextInt();
		System.out.println("Enter the exponential value");
		int m=ip.nextInt();
		for(i=1;i<=m;i++) {
			power=power*n;
		}
		System.out.println(n+"^"+m+" is "+power);

	}

}
