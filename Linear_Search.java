import java.util.Scanner;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input Data--->");
		int[] a = input();
		System.out.println("Enter the number to be searched:");
		int x = scn.nextInt();
		int loc = lsearch(a, x);
		System.out.println("Output--->");
		if (loc > 0)

		{
			System.out.print("Found at " + loc + "th position");
		} else {
			System.out.print("Not Found");

		}
	}

	public static int[] input() {
		int retval[] = null;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n = scn.nextInt();
		retval = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the " + (i + 1) + "th element:");
			retval[i] = scn.nextInt();

		}
		return (retval);

	}

	public static int lsearch(int arr[], int x) {
		int l = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == x) {
				l = j + 1;
				break;

			}
			l = -1;

		}
		return l;
	}
}
