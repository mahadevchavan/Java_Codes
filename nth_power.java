import java.util.Scanner;

public class nth_power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number and its power");
		int num = sc.nextInt();
//		System.out.println("enter its power");
		int power = sc.nextInt();
		int n_pow = num;
		for (int i = 1; i <= power; i++) {
			n_pow = n_pow*n_pow;
		}
		System.out.println("power of number "+num+" is "+n_pow);
	}

}
