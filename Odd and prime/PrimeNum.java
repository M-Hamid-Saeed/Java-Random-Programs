/*
**********Task Description*********

   Program to take +ve n from user and show first n prime numbers.
   Input:
        Data:
            one int
        Instruction:
            Take one number and print first n prime numbers
   processing:
        start loop from 2 and check that number is completely divide or not if yes then not prime
   Output:
        first n prime numbers
*/

/*
********Author Details********
Author name:     Muhammad Hamid Saeed
Reg. NO.:        FA20-BCS-052
Program Name:    PrimeNum.java
License:         Public Domain
*/

/*
*********System Settings*********
Operating System:  Windows 10 Version 1909
Compiler:          Notepad++
Start Date:        03/10/2021
End Date :         03/10/2021
*/

//****** Purpose is to take inpur from user using Scanner and then print the first n prime numbers***********
import java.util.Scanner;
public class PrimeNum{
	public static void main(String[] args){   
        //Starting value for prime numbers
        int primenum=2;
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
        //Here num is the number of prime numbers we wanna print...
        //so when num is 0 its means all n prime numbers are printed
		while(num>0)
		{//Here after each increment in primenum we are checking that if this number is prime or not by
            //passing it to our function...
			if(isPrime(primenum))
			{
                
				System.out.println(primenum);
                //after printing each primenum we are decrementing the num 
				num--;	
			}
            //Incrementing the primenum which was started from 2
		primenum++;		
			
		}
	}
public static boolean isPrime(int num)
	{ 
	int i;
    //Starting loop from 2 and end it less than the number bcz every number is devisible by 1 and itself..where 
    // num is the number which we want to check prime or not
        for (i=2;i<num;i++)
        //if the number is ever divisible from 2 to num-1 its means not prime number...so returning false///
            { if(num%i==0)
                return false;
            }
        //If the number equal to i, its means that the upper loop did condition complete its iteration and it does not 
        // return false.. which means number will only be equal to i when its fully checked that from 2 to n there is no 
        // number which can divide it..which means this number is prime..
        if(num==i){
            return true;
        }
    return false;
	}
}