package Patterns2;
public class Pattern53 {
	public static void main(String[] args) {
		int n = 3;
		for(int i=n; i >= -n; i--) 
		{
			for(int j= n; j >= Math.abs(i); j--)
				System.out.print(j+" "); 
			System.out.println();					
		}
	}

}
