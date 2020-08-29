package pack1;
import java.util.Scanner;
public class Simpleinterest {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter p,t,r values: ");
		int p=obj.nextInt();
		int t=obj.nextInt();
		int r=obj.nextInt();
		int si=p*t*r/100;
		System.out.println("Simple interest= "+si);
		// TODO Auto-generated method stub

	}

}
