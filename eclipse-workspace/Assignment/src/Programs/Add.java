package Programs;
import java.util.Scanner;
class Add 
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the numbers to add");
		int a=ip.nextInt();
		int b=ip.nextInt();
		System.out.println("The sum of "+a+" and "+ b +" is "+(a+b));
	}
	

}
