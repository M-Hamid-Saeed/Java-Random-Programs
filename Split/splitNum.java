import java.util.Scanner;

public class splitNum
{
	public static void main(String[] args)
	{  int reverse=0,splitting=0;
	   Scanner obj=new Scanner(System.in);
	   System.out.print("Enter a Number to split it-->");
	   int number=obj.nextInt();
	   //Reversing the number
	   //Loop till number is not 0
	   int count=0;

	   while(number!=0)
	   {
		   //Extracting last number by taking remainder
		int remainder=number%10;
		//Now if we simply put reverse = remainder then on the next iteration the new remainder will be stored
		// and previous remainder will be removed so we are multiplying the previous remainder by 10
		// and then adding it to new remainder
		//For example number = 1234 ...first remainder is 4 and it will store to reverse as firstly reverse is 0;
		//now on next iteratoin we want 43 which we will get only by 40+3 so ...reverse has 4 and by * 10 it is 40
		// and then adding the new remaidner 3 to it will make it 43 ...on the number will be 12 ..again remainder
		// is 2 and this time 43*10 +2 = 432....and so on...
		reverse=reverse*10+remainder;
		//to remove last digit
		number=number/10;
		

	   }
	   
	   while(reverse!=0)
	   {
		   // for splitting numbers we just have to get its remainder and print it 
		   // but as we know remiander will give us the last value so first we reverse the number in upper
		   // section and now we simply split it.
		splitting=reverse%10;
		 reverse=reverse/10 ; 
		 System.out.println(splitting); 
		 count++; 
	   }
	   System.out.println("Number of digits are ---> "+count);
       
    }
}
