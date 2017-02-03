import java.util.Scanner;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input data--->");
		int a[] = getdata();
		System.out.println("The Unsorted Array is:");
		putdata(a);
		int bsort[] = bubblesort(a);
		System.out.println();
		System.out.println("The Sorted Array after Bubble Sort is:");
		for (int m = 0; m < a.length; m++) {
			System.out.print(bsort[m] + " ");

		}
	}

	public static int[] getdata() {
		Scanner scn = new Scanner(System.in);
		int retval[] = null;
		System.out.print("Enter the number of elements:");
		int n = scn.nextInt();
		retval = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter element no." + (i + 1) + ":");
			retval[i] = scn.nextInt();
		}
		return (retval);
	}

	public static void putdata(int arr[]) {
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}

	public static int[] bubblesort(int arr[]) {
		int temp = 0;
		for (int k = 0; k < arr.length - 1; k++) {
			for (int l = 0; l < (arr.length - k - 1); l++) {
				if (arr[l] > arr[l + 1]) {
					temp = arr[l];
					arr[l] = arr[l + 1];
					arr[l + 1] = temp;

				}
			}

		}
		return (arr);

	}
}