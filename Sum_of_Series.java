
//Question 12
import java.util.Scanner;

public class Sum_of_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a  number to print the series");
		int last_num = sc.nextInt();
		int add = 0;
		for (int i = 1; i <= last_num; i++) {
			add += i;

		}
		System.out.println(add);
	}

}
