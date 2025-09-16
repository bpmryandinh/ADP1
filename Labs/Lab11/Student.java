public class Student extends Person {
    //Attributes
    private String Major;
    private int YearinSchool;

//Methods (get and set)
public String getMajor(){
    return getMajor();
}
public void setMajor(String major){
    this.Major = major;
}
public int getYearinSchool(){
    return getYearinSchool();
}
public void setYearinSchool(int yearInschool){
    if (yearInschool < 0) {
        throw new IllegalArgumentException("Year In School must be after 0.");
    } else {
        this.YearinSchool = yearInschool;
    }
}

//Method to printInfo() person + student info
private void printInfo(Person name, Person email, Student major, Student YearinSchool){
    System.out.println("Name: " + name);
    System.out.println("Email: " + email);
    System.out.println("Major: " + major);
    System.out.println("Year in School: " + YearinSchool);
}


//default
public Student(){
    super();
    this.Major = "Undecided";
    this.YearinSchool = 1;
}

//Constructors
public Student(String name, String email, String major, int yearInschool){
    super(name, email);
    this.Major = major;
    this.YearinSchool = yearInschool;
}

}
