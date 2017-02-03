import java.util.Scanner;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Input Data--->");
		int a[] = getdata();
		System.out.println("The Unsorted Data is:");
		putdata(a);
		System.out.println();
		System.out.println("The Sorted Array after Insertion Sort is:");
		int isort[] = insort(a);
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

	public static int[] insort(int arr[]) {
		int temp = 0;
		int counter = 1;
		while (counter <= arr.length - 1){
			for (int l = counter; (l > 0) && (arr[l - 1] > arr[l]); l--) {

				temp = arr[l - 1];
				arr[l - 1] = arr[l];
				arr[l] = temp;

			}
			counter += 1;
		}
		return (arr);
	}
}