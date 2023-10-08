package numbers;

public class OddEve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n=10;
//  if(n%2==0)
  if((n/2)*2==n)
//	  if((n>>1)<<2==n)
//	  if((n&1)==0)
  {
	  System.out.println("given number is even");
	}
  else {
	  System.out.println("given  number is odd");
  }
  System.out.println((n%2==0)? "Even number":"Odd number");
}
}