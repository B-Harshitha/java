package num;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter a year");
		Scanner ip=new Scanner(System.in);
		int year=ip.nextInt();
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					System.out.println("Leap Year");
				}
				else {
					System.out.println("Not a leap year");
				}
			}
			else {
				System.out.println("Leap year");
			}
		}
		else {
			System.out.println("Not a leap year");
		}
		// TODO Auto-generated method stub

	}

}
