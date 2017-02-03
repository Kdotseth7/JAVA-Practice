import java.util.Scanner;

public class Decimal_to_Octal_and_vice_versa {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("What do you want to do?");
		System.out.println("1.Octal to Decimal");
		System.out.println("2.Decimal to Octal");
		int ch = scn.nextInt();
		if (ch == 1) {
			System.out.println("Enter the Octal No:");
			int octal = scn.nextInt();
			int dec = o2d(octal);
			System.out.println("Decimal:" + dec);

		} else if (ch == 2) {
			System.out.println("Enter the Decimal No.:");
			int decimal = scn.nextInt();
			int oct = d2o(decimal);
			System.out.println("Octal:" + oct);
		}

	}

	public static int o2d(int oct) {
		int dec = 0;
		int multi = 1;
		while (oct != 0) {
			int rem = oct % 10;
			dec = dec + multi * rem;
			multi *= 8;
			oct /= 10;

		}
		return (dec);
	}

	public static int d2o(int dec) {
		Scanner scn = new Scanner(System.in);
		int oct = 0;
		int multi = 1;
		while (dec != 0) {
			int rem = dec % 8;
			oct = oct + multi * rem;
			multi *= 10;
			dec /= 8;
		}
		return (oct);
	}
}