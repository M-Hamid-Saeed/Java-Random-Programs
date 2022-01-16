/*
**********Task Description*********

   Program to take input 2 numbers and show sum of the numbers.
   Input:
        Data:
            two integers
        Instruction:
            Take two integers as input and take sum.
   processing:
        num1+num2
   Output:
        Sum
*/

/*
********Author Details********
Author name:     Muhammad Hamid Saeed
Reg. NO.:        FA20-BCS-052
Program Name:    AddNum.java
License:         Public Domain
*/

/*
*********System Settings*********
Operating System:  Windows 10 Version 1909
Compiler:          Notepad++
Start Date:        03/10/2021
End Date :         03/10/2021
*/

//****** Purpose is to take inpur from user using Scanner and then take sum of these numbers***********
// importig package for Scanner Class
import java.util.Scanner;
// Driver Class AddNUm
public class AddNum{

   //main function
    public static void main (String[] args){
        //Printing message
        System.out.println("*****WELCOME*****");
        // Creating Object of Scanner Class and Passing Arguments to take inpur from User.
        Scanner obj= new Scanner(System.in);
        //Printing Message
        System.out.println("Enter Num 1: ");
        // Taking int input from user using the object created for Scanner
        int num1= obj.nextInt();
        //Prinitng Message
        System.out.println("Enter Num 2: ");
        //Taking 2nd Int as input
        int num2= obj.nextInt();
        //Processing the num1 and num2
        int ans=num1+num2;
        //Againg crearing a new object of Scanner class to avoid blank inpur
        Scanner myobj=new Scanner(System.in);
        System.out.println("Your Name: ");
        //Taking String as input
        String name= myobj.nextLine();
        //Displaying Output
        System.out.printf("%s!! Answer is %d",name,ans);

    }
    



}