import java.util.Scanner;

public class Decimal_to_Binary_and_vice_versa {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("What do you want to do?");
		System.out.println("1.Binary to Decimal");
		System.out.println("2.Decimal to Binary");
		int ch = scn.nextInt();
		if (ch == 1) {
			System.out.println("Enter the Binary No:");
			int binary = scn.nextInt();
			int dec = b2d(binary);
			System.out.println("Decimal:" + dec);

		} else if (ch == 2) {
			System.out.println("Enter the Decimal No.:");
			int decimal = scn.nextInt();
			int bin = d2b(decimal);
			System.out.println("Binary:" + bin);
		}

	}

	public static int b2d(int bin) {
		int dec = 0;
		int multi = 1;
		while (bin != 0) {
			int rem = bin % 10;
			dec = dec + multi * rem;
			multi *= 2;
			bin /= 10;

		}
		return (dec);
	}

	public static int d2b(int dec) {
		Scanner scn = new Scanner(System.in);
		int bin = 0;
		int multi = 1;
		while (dec != 0) {
			int rem = dec % 2;
			bin = bin + multi * rem;
			multi *= 10;
			dec /= 2;
		}
		return (bin);
	}
}