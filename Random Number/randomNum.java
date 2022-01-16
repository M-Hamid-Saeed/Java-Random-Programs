import java.util.Random;

public class randomNum{

     public static void main(String[] args) {
         Random r= new Random();
         int luckyNumber= r.nextInt();
         System.out.println(luckyNumber);   
    }
}