package pack1;
import java.util.*;
public class Fib_or_Not {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter number");
		int n = sc.nextInt();  //5
		
		int a=0,b=1,c=0;
		
		while(c<n)   // 5<5
		{
			c=a+b;  // 5
			a=b;  // 3
			b=c;  // 5
		}
	     if (c==n)
	    	 System.out.println("Fibonacci Number");
	     else
	    	 System.out.println("Not Fibonacci Number");
		// TODO Auto-generated method stub

	}

}
