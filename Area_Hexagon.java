package Area;
import java.util.*;
public class Area_Hexagon {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the length of a side");
		double s=obj.nextDouble();
		double a=(3*Math.sqrt(3)*(s*s))/2;
		System.out.println("Area of Hexagon = "+a);
	}

}
