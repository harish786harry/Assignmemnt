package Programs;
import java.util.Scanner;
public class Vowel 
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=ip.next().charAt(0);
		if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
		{
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'
					|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
				System.out.println(ch+" is a Vowel");
			else
				System.out.println(ch+" is a consonant");
		}
		else
			System.out.println(ch+" is not an Alphabet");
	}

}
