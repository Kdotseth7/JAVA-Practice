import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Fibonaaci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);

System.out.println("Enter the value of n");
int n=scn.nextInt();
int i=1,fn=1,sn=0,tn=0;
System.out.println("0");
while(i<=n)
{tn=fn+sn;
	System.out.println(tn);
	fn=sn;
	sn=tn;
	i++;
	
	
}

	}

}
