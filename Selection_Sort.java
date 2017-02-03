import java.util.Scanner;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input Data--->");
		int a[] = getdata();
		System.out.println("The Unsorted Data is:");
		putdata(a);
		System.out.println();
		System.out.println("The Sorted Array after Selection Sort is:");
		int ssort[] = selsort(a);
		for (int m = 0; m < a.length; m++) {
			System.out.print(a[m] + " ");
		}

	}

	public static int[] getdata() {
		Scanner scn = new Scanner(System.in);
		int retval[] = null;
		System.out.println("Enter the number of elements:");
		int n = scn.nextInt();
		retval = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter element no." + (i + 1) + ":");
			retval[i] = scn.nextInt();

		}
		return (retval);
	}

	public static void putdata(int arr[]) {
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}

	public static int[] selsort(int arr[]) {
		int temp = 0;
		for (int k = 0; k < arr.length; k++) {
			int min = arr[k];
			int pos = k;
			for (int l = k + 1; l < arr.length; l++) {
				if (min > arr[l]) {
					min = arr[l];
					pos = l;
				}
			}
			temp = arr[k];
			arr[k] = arr[pos];
			arr[pos] = temp;

		}

		return (arr);
	}
}