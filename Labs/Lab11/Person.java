public class Person{
    //Attributes
    private String Name;
    private String Email;

    //Getter and setters
    public String getName(){
        return Name;
    }
    public void setName(String name){
        this.Name = name;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        this.Email = email;
    }

    //Method to printInfo() person
    static void printInfo(Person name, Person email){
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
    

    //default constuctor
    public Person (){
        this.Name = "First Last";
        this.Email = "firstlast@email.com";
    }

    //custom constructor
    public Person(String name, String email){
        this.Name = name; 
        this.Email = email;
    }
    
        
    }
