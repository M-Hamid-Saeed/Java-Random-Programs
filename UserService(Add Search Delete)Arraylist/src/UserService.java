import java.util.ArrayList;

public class UserService {
   private ArrayList<User> users;


    /**Getter and Setters
     * @return ArrayList<User> return the users
     */
    public ArrayList<User> getUsers() {
        return users;
    }

    /**
     * @param users the users to set
     */
    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
    public void addUser(User user){
        users.add(user);
        System.out.println("Successfully added user");
    }
    public void removeUser(String name){
        for(User flag:users){
            if(flag.getName().equals(name)){
                users.remove(flag);
                System.out.println("Succeessfully Removed");
            }
            else
            System.out.println("Not found");
        }
    }
    public void searchUser(String name){
        for(User flag:users)
        {if(flag.getName().contains(name))
            System.out.println(flag.toString());
        else
        System.out.println("Not found");}
    }
    public UserService(){
        users=new ArrayList<User>();
    }
    public void display(){
        
        for(int i=0;i<users.size();i++)
           { if(users.isEmpty())
            System.out.println("No data found");
            else
                System.out.println(users.get(i).toString());}      
    }

}