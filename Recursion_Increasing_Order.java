
public class Recursion_Increasing_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		recincdec(0);
	}

	public static void recincdec(int value) {
		if (value == 10) {

			return;
		}
		System.out.print(value + " ");
		recincdec(value + 1);
		System.out.print(value + " ");
	}
}