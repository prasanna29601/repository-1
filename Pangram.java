package Strings;
import java.util.*;
public class Pangram {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter string");
		String arr = sc.nextLine();
		int flag = 1;
		int n = 26;
		if(arr.length() < n)
		{
			 System.out.println("Not Pangram");
		     flag = 0;
		}
			 else
			for(char c = 'A'; c <= 'Z'; c++)
			{
				if( (arr.indexOf(c)<0) && (arr.indexOf((char)(c+32)))<0)
				{
				System.out.println("Not Pangram");	
				flag = 0;
				}
			}
		if(flag == 1)
		System.out.println("Pangram");
	}

}