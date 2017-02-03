import java.util.Scanner;

public class Upper_Lower_Case_Detection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("Enter the character:");
char ch=scn.next().charAt(0);
if(ch>65 && ch<90)
{
System.out.println("Upper Case Character");
}
else if(ch>96 && ch<121)

{
	System.out.println("Lower Case Character");
}
else
{
	System.out.println("Invalid Character");
}
	}

}
