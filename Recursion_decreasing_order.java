
public class Recursion_decreasing_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recdec(10);
	}

	public static void recdec(int value) {
		if (value == 0) {
			System.out.println(value);
			return;
		}
		System.out.println(value);
		recdec(value - 1);
		
		
	}
}