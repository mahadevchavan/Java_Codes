//5th Question
import java.util.Scanner;

public class Divide_5and_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to check divisibility");
		int num1 = sc.nextInt();
		if ((num1 %  5==0) && (num1 % 7 ==0)) 
		{
			System.out.println(num1+" is divisible by 5 & 7");
		}
		else 
		{
			System.out.println(num1+" is not divisible by either 5 or 7");
		}
	}

}
