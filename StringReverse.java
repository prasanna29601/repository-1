package Hackerrank_prgs;
import java.io.*;
import java.util.*;
public class StringReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int i=0 , j = A.length()-1;
        while(A.charAt(i) == A.charAt(j) && i++ < j-- );
        System.out.println(i>j ? "Yes" : "No");
	}

}
