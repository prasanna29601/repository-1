package pack1;
import java.io.*;
public class Files1 {

	public static void main(String[] args) {
		int c = 0;
		File f = new File("E:\\");
// f var holds id of e:\\ drive
		String[] s = f.list();
// enhanced for loop
		for(String s1 : s)
		{
			System.out.println(s1);
			c++;
		}
		System.out.println(" total = "+c);
		// TODO Auto-generated method stub

	}

}
