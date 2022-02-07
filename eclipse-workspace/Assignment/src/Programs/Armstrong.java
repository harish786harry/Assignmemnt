package Programs;
import java.util.Scanner;
public class Armstrong
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter a nummber");
		int n=ip.nextInt();
		int temp,original=n,Armstrong=0;
		while(n>0)
		{
		   temp=n%10;
		   temp=temp*temp*temp;
		   Armstrong=Armstrong+temp;
		   n=n/10;
		}
		if(Armstrong==original)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");
	}

}
