package Strings;
import java.util.*;
public class Swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 strings");
		String a = sc.next();
		String b = sc.next();
		System.out.println("Before Swapping a = "+a+" and b = "+b);
		a = a+b; 
		b = a.substring(0,a.length() - b.length());
		a = a.substring(b.length());
		System.out.println("After Swapping a= "+a+" and b= "+b);
	}

}
