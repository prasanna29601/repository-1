package Strings;
import java.util.*;
public class word_ch_count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int word = 0;
		System.out.println("enter string:");
		String str = sc.nextLine();
		String s="";
		char[] ch = str.toCharArray();
		for(int i = 0; i<ch.length; i++) 
		{
			 s = "";
			while(i<ch.length && ch[i] != ' ') 
			{
				s = s+ch[i];
				i++; 
			}
			word = word+1; 
			if(s.length() > 0 )
				System.out.println(s + " = "+ s.length());			
		}
		System.out.println("no of words "+word);
	}

}
