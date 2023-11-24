//Question 7 
import java.util.Scanner;

public class Salaray_tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the basic salary");
		int sal = sc.nextInt();
		if (sal < 50000) {
			System.out.println("no tax");
		} else if (sal >= 50000 && sal < 300000) {
			int tax = sal / 100 * 20;
			System.out.println("tax is: " + tax);
		} else if (sal >= 300000) {
			int tax = sal / 100 * 30;
			System.out.println("tax is: " + tax);
		}

	}

}
