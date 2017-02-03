
public class Print_all_substrings_using_Recursion {

	public static void main(String[] args) {
		String str = "abc";
		PrintSSWAscii(str, " ");

	}

	public static void PrintSSWAscii(String str, String result) {
		if (str.length() == 0) {
			System.out.println(result);
			return;
		}
		PrintSSWAscii(str.substring(1), result + "");
		PrintSSWAscii(str.substring(1), result + str.charAt(0));
		PrintSSWAscii(str.substring(1), result + (int) str.charAt(0));
	}
}