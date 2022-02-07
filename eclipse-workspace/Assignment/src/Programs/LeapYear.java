package Programs;
import java.util.Scanner;
public class LeapYear 
{
	public static void main() 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter a year");
		int y=ip.nextInt();
		if(y%4==0 && (y%100!=0 || y%400==0))
		{
				System.out.println(y+" is a Leap Year");
		}
		else
			System.out.println(y+" is Not a leap year");

		   
		
	}

}
