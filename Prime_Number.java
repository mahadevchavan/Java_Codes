
//Question 11
import java.util.Scanner;
import java.lang.Math;
//import java.lang.Math;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num1 = sc.nextInt();
		boolean flag = true;

		for (int i = 2; i <= Math.round(Math.sqrt(num1)); i++) {
			if (num1 % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true)
			System.out.println("prime number");
		else
			System.out.println("not a prime number");

	}

}
