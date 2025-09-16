public class Person2 {

//Attributes
   private String Name;
   private String Email;

//Mutators (setters) and Accessors (getters)
public String getName(){
    return Name;
}

public void setName(String name){
    this.Name = name;
}

public String getEmail(){
    return Email;
}

public void setEmail(String email){
    this.Email = email; 
}

//Method to printInfo
public void printInfo(Person name, Person email){
    System.out.println("Name: " + name);
    System.out.println("Email: " + email);
}

//Constructors
public Person2(){
    this.Name = "N/A";
    this.Email = "name@example.com";
}

public Person2(String name, String email){
    this.Name = name;
    this.Email = email;
}
}
