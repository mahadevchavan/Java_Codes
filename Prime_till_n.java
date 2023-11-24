
//Question 16
import java.util.Scanner;
import java.lang.Math;

//import java.lang.Math;
public class Prime_till_n {

	public static boolean prime(int num) {
		boolean flag = true;

		for (int i = 2; i <= Math.round(Math.sqrt(num)); i++) {

			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number till you want all prime numbers");
		int n_num = sc.nextInt();
		for (int i = 2; i <= n_num; i++) {
			if (prime(i))
				System.out.println(i);
		}
	}

}
