package operators;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;  int b=20;  int temp=0;
		System.out.println("a:"+a+"   b:"+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("a:"+a+"   b:"+b);
		
		int x=99;  int y=88; 
		System.out.println("x:"+x+"   y:"+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x:"+x+"   y:"+y);

	}

}
