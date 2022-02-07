package Programs;
import java.util.Scanner;
public class MultiTable 
{
	public static void main(String[] args)
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the number for Multiplication Table");
		int n=ip.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}
		
				
		
	}

}
