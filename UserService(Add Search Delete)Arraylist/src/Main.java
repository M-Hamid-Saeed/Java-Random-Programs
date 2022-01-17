import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      UserService us= new UserService();
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Add User Details");
      System.out.println("Please Enter User Name");
      String name=sc.nextLine();

      System.out.println("Please Enter User City");
      String city=sc.nextLine();
      us.addUser(new User(name,city));

      System.out.println("Please Enter User name to Search in the record");
      String naam=sc.nextLine();
      us.searchUser(naam);

      System.out.println("Please Enter User name to remove in the record");
      us.removeUser(sc.nextLine());
    }
}