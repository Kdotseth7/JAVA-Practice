import java.util.Scanner;

public class Binary_Search_in_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Take Input--->");
		int a[] = takeInput();
		System.out.println("Enter no. to be searched:");
		int num = scn.nextInt();
		System.out.println("Sorted Array:");
		output(a);
		System.out.println();

		int ans = bsearch(a, num);
		if (ans > 0) {
			System.out.println("Found at:" + (ans + 1));
		} else {
			System.out.println("Not Found");
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

	public static int bsearch(int arr[], int x) {
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (x == arr[mid]) {
				return (mid);
			} else if (x > arr[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return (-1);

	}
}
