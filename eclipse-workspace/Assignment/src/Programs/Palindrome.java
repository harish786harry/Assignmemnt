package Programs;
import java.util.Scanner;
public class Palindrome 
{
	public static void main(String[] args)
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter a number to check palindrome or not");
		int n=ip.nextInt();
		int r,sum=0,temp;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
		}
		if(temp==sum)
			System.out.println("Palindrome");
		else
			System.out.println("It is not a Palindrome");
	}

}
