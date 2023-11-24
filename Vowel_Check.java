//Question 7
import java.util.Scanner;

public class Vowel_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any lowercase alphabate");
		char ch = sc.next().charAt(0);
		if (ch=='a'|| ch=='e' || ch=='u'|| ch=='i'||ch=='o') {
			System.out.println("its a vowel");
		} else {
			System.out.println("its not a vowel");
		}
	}

}
