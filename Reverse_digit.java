package num;

import java.util.Scanner;

public class Reverse_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=0;
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=ip.nextInt();
		while(n!=0) {
			int rem=n%10;
			res=(res*10)+rem;
			n=n/10;
		}
		System.out.println("The reverse of the digit is: \n "+res);

	}

}
