public class Std extends Person2{
    
    //attributes
    private String Major;
    private int YearinSchool;

    //Mutators (setters) and Accessors (getters)
    public String getMajor(){
        return Major;
    }

    public void setMajor(String major){
        this.Major = major;
    }

    public int getYearinSchool(){
        return YearinSchool;
    }

    public void setYearinSchool(int yearInSchool){
        //YearinSchool cannot be less than 1
        if (yearInSchool < 1){
            throw new IllegalArgumentException("Year in School must be bigger than 0");
        } else {
            this.YearinSchool  = yearInSchool;
        }
    }

    //method to printInfo
    public void printInfo(Person name, Person email, Std major, Std yearInSchool){
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Major: " + major);
        System.out.println("Year in School " + yearInSchool);
    }

    //Constructors
    public Std(){
        super();
        this.Major = "nah";
        this.YearinSchool = 0;
    }

    public Std(String name, String email, String major, int yearInSchool){
        super(name, email);
        this.Major = major;
        this.YearinSchool = yearInSchool;
    }

}
