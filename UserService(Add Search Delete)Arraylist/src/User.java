

public class User {

    private String name;
    private String city;
   // private static int id;
    //id = 0;
    
    //Constructor
    public User( String name,String city)
    {
        setCity(city);
        setName(name);
        //++id;
    }



    /**Getters and Setters methods
     * @return int return the id
     */
    // public int getId() {
    //     return id;


    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        
        this.name = name;
    }

    /**
     * @return String return the city
     */
    public String getCity() {
       
         return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    public String toString(){
        return String.format("%s    %s",getName(),getCity());
    }
}