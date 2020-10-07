package Patterns;
public class Pattern23 {
	public static void main(String[] args) {
		for(int i='A'; i <= 'E';i++) 
		{
			for(int j= 'E'; j >= i; j--)
			{
				System.out.print((char)j+" "); 
			}
			System.out.println(); 
		}
	}

}
