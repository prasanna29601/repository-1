package Hackerrank_prgs;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class End_of_file {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int i=1;
	        while(sc.hasNext())
	        {
	            String s = sc.nextLine();
	            System.out.println(i + " "+s);
	            i = i+1;
	        }   
	}

}
