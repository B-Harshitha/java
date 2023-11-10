package num;

import java.util.Scanner;

public class Prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=ip.nextInt();
		if(n==0||n==1) {
			System.out.println("not a prime number");
		}
		else if(n==2) {
			System.out.println("Prime Number");
		}
		else {
			int flag=0;
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.println("Prime Number");
				
			}else {
				System.out.println("Not a prime number");
			}

			
		}
		
	}

}
