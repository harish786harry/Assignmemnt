package Programs;
import java.util.Scanner;
public class Calculator 
{
	public static void main(String[] args)
	{
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		char ch=ip.next().charAt(0);
		int b=ip.nextInt();
		switch(ch)
		{
		case '+':System.out.println(a+b);
		         break;
		case '-':System.out.println(a-b);
		         break;
		case '*':System.out.println(a*b);
		         break;
		case '/':if(b==0)
			       System.out.println("Not divided by zero");
		         else
		        	 System.out.println(a/b);
		         break;
		default:System.out.println("Invalid character");
		}
	}
	

}
