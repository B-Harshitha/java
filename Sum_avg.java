package num;

import java.util.Scanner;

public class Sum_avg {

	public static void main(String[] args) {
		Scanner ip =new Scanner(System.in);
		int sum=0,i;
		System.out.println("Enter 10 inputs");
		for(i=0;i<=10;i++) {
			int n=ip.nextInt();
			sum=sum+n;
		}
		System.out.println("Sum = "+sum);
		System.out.println("Avg = "+sum/10);

	}

}
