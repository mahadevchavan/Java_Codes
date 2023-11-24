//Question 17
import java.util.Scanner;

public class Armstrong_number {
	public static int count(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count += 1;
		}
		return count;
	}

	public static int armstrong(int num) {
		int c = count(num);
		int tot = 0;
		while (num > 0) {
			int temp = num % 10;
			tot = (int) (tot + Math.pow(temp, c));
			num = num / 10;
		}
		return tot;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num2 = sc.nextInt();
		if (armstrong(num2) == num2)
			System.out.println("armstrong number");
		else
			System.out.println("not an armstrong");
	}
}
