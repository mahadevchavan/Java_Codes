//Question 14
import java.util.Scanner;

public class Sum_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num2 = sc.nextInt();
		int sum_even = 0;
		int sum_odd = 0;
		for (int i = 0; i <= num2; i++) {
			if (i % 2 == 0) {
				sum_even = sum_even + i;
			} else {
				sum_odd = sum_odd + i;
			}
		}
		System.out.println("sum of all even numbers till " + num2 + " is " + sum_even);
		System.out.println("sum of all odd numbers till " + num2 + " is " + sum_odd);
	}

}
