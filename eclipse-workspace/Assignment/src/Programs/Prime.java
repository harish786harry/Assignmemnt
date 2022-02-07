package Programs;
import java.util.Scanner;
class Prime 
{
	public static void main(String[] args)
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter a number to check Prime or not");
		int n=ip.nextInt();	
		boolean prime=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				prime=false;
				break;
			} 
		}
		System.out.println(prime);
	}

}
