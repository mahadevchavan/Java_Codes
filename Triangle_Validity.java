//Question 8
import java.util.Scanner;

public class Triangle_Validity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first angle");
		float ang1 = sc.nextFloat();
		System.out.println("enter first angle");
		float ang2 = sc.nextFloat();
		System.out.println("enter first angle");
		float ang3 = sc.nextFloat();
//		System.out.println(ang1+ang2+ang3);
		if((ang1+ang2+ang3)==180) {
			System.out.println("its valid triangle");
		} else {
			System.out.println("its not valid triagle. enter correct angle values.");
		}
	}

}
