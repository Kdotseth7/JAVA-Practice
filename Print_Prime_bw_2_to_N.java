import java.util.Scanner;

public class Print_Prime_bw_2toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int flag = 1;
		System.out.println("Enter the value of n:");
		int n = scn.nextInt();
		for (int i = 2; i < n; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = 0;
					break;
				} else {
					flag = 1;

				}
			}
			if (flag == 1) {
				System.out.println(i);
			}
		}
	}
}