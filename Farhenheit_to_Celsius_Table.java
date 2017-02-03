import java.util.Scanner;

public class Farhenheit_to_Celsius_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter min temp:");
		int min = scn.nextInt();
		System.out.println("Enter max temp:");
		int max = scn.nextInt();
		System.out.println("Enter Jump temp value:");
		int jump = scn.nextInt();
		while (min <= max) {
			double c = 5 * (min - 32) / 9;
			System.out.println(min + "\t" + c);
			min = min + jump;

		}
	}
}
