import java.util.Scanner;

public class Sum_of_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input Data:");
		int[] a = input();
		System.out.println("Displaying Data:");
		output(a);
		int sum1 = sumoa(a);
		System.out.println();
		System.out.println("Sum of Array is:" + sum1);

	}

	public static int[] input() {
		Scanner scn = new Scanner(System.in);

		int[] retval = null;
		System.out.println("Enter the number of elements:");
		int n = scn.nextInt();
		retval = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the "+(i+1)+"th element:");
			retval[i] = scn.nextInt();

		}
		return retval;

	}

	public static void output(int arr[]) {
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}

	}

	public static int sumoa(int arr[]) {
		int sum = 0;
		for (int k = 0; k < arr.length; k++) {
			sum = sum + arr[k];
		}
		return sum;

	}
}