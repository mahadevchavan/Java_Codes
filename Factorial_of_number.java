//Question 9
import java.util.Scanner;

public class Factorial_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number of which you want factorial");
		int fact = sc.nextInt();
		int fin_fact = 1;
		for (int i = 1; i <= fact; i++) {
			fin_fact = fin_fact * i;
		}
		System.out.println("factorial of number " + fact + " is " + fin_fact);

	}

}
