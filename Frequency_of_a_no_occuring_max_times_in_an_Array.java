import java.util.Scanner;

public class Frequency_of_a_no_occuring_max_times_in_an_Array {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Input Data-->");
		int a[] = getdata();
		System.out.println("Elements in the array are:");
		putdata(a);
		int ans=maxfreq(a);
		
		System.out.println("The no. that occurs maximum times in the array is--");

	}

	public static int[] getdata() {
		Scanner scn = new Scanner(System.in);
		int retval[] = null;
		System.out.println("Enter the no. of elements");
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

public static  int maxfreq(int arr[])
{
	
}