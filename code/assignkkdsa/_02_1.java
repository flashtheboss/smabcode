import java.util.Scanner;
class one02
{
	public static void main(String[]args)
	{
		Scanner key=new Scanner(System.in);
		System.out.println("Enter a number to check whether it is even or odd");
		long n=key.nextLong();
		if (n%2==0)
		{ 
			System.out.println("Number en:terd is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
	}
}
