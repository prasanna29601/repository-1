package Patterns3;
public class Pattern86 {
	public static void main(String[] args) {
		int n = 9;
		int x = n/2+1 ;  
		int p = 1; 
		for(int i=1; i<=n ; i++) 
		{
			for(int j=1; j <=n; j++) 
			{
				if(j == x || j == n-x+1 )  
				  System.out.print(p); 
				else
			     System.out.print(" ");
			}
			System.out.println();
			if(i<=n/2) 
			{
				p=p+1;   
				x = x-1;
			}
			else 
			{
				p=p-1; 
				x=x+1; 
			}
		}
	}
}
