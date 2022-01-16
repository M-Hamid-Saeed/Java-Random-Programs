import java.util.Scanner;
public class OddEven
{
	public static void main(String[] args)
	{
		Scanner obj= new Scanner(System.in);
		System.out.println("Please Enter a Number -->");
		int num=obj.nextInt();
	if(Even(num))
		{
			System.out.println("Number is Even");
		}
	else
		{
			System.out.println("Number is odd");
		}	
	}	
public static boolean Even(int number)
	{
		if(number%2==0)
		{
			return true;	
		}
		else 
		{
			return false;
		}
	}
}

