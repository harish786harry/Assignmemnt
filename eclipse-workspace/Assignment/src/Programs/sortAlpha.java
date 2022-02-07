package Programs;
import java.util.Scanner;
public class sortAlpha 
{
	public static void main(String[] args) 
	{
		java.util.Scanner ip=new Scanner(System.in);
		System.out.println("Enter a String");
		String mystr=ip.nextLine();
		char temp;
		String str=mystr.toLowerCase();
		char[] charstr=str.toCharArray();
		int len=charstr.length;
		for(int i=1;i<len;i++)
		{
			for(int j=0;j<len-i;j++)
			{
				if(charstr[j]>charstr[j+1])
				{
					temp=charstr[j];
					charstr[j]=charstr[j+1];
					charstr[j+1]=temp;
				}
			}
		}
		System.out.println(charstr);
		
		
	}

}
