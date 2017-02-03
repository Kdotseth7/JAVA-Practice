import java.util.Scanner;

public class Reverse_of_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Input Data-->");
		int a[] = takeInput();

		System.out.println("Displaying Data-->");
		output(a);

		int[] rev = reverse(a);
		System.out.println();
		System.out.println("Reverse of array is:");
		for (int i = 0; i < rev.length; i++) {
			System.out.print(rev[i] + " ");

		}
	}

	public static int[] takeInput() {
		int retval[] = null;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no. of elements:");
		int n = scn.nextInt();
		retval = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the " + (i + 1) + "th element:");
			retval[i] = scn.nextInt();
		}
		return retval;
	}

	public static void output(int[] arr) {
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}

	public static int[] reverse(int arr[]) {
		int temp = 0;
		int l = arr.length - 1;
		for (int k = 0; k < (arr.length) / 2; k++, l--) {
			temp = arr[k];
			arr[k] = arr[l];
			arr[l] = temp;

		}
		return arr;
	}
}