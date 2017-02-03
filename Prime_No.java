import java.util.Scanner;


public class Prime_No {

	public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
int i=2,flag=1;
System.out.println("Enter the no.");
int n=scn.nextInt();
while(n>i){
	if(n%i==0)
	{flag=0;
	}
	i=i+1;
}
if(flag==1)
{System.out.println("No is Prime");
}
else
{System.out.println("No is not Prime");
}
	}}

	
