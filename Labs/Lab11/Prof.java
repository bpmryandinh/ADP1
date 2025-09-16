public class Prof extends Person2 {
    
    //Attributes
    private String Degree;
    private String University;
    private int YearGraduated;

    //setter and getters
    public String getDegree(){
        return Degree;
    }

    public void setDegree(String degree){
        this.Degree = degree;
    }

    public String University(){
        return University;
    }

    public void University(String uni){
        this.University = uni;
    }

    public int YearGraduated(){
        return YearGraduated;
    }

    public void YearGraduated(int yearGrad){
        if (yearGrad < 1900){
            throw new IllegalArgumentException("Year in Graduated must be bigger than 1900");
        } else {
            this.YearGraduated = yearGrad;
        }
    }

    //method to printInfo
    public void printInfo(Person name, Person email, Prof degree, Prof uni, Prof yearGrad){
        System.out.println("Name: " + name);
        System.out.println("Email " + email);
        System.out.println("Degree: " + degree);
        System.out.println("University: " + uni);
        System.out.println("Year Graduated: " + yearGrad);
    }

    //constructors
    public Prof(){
        super();
        this.Degree = "failure";
        this.University = "never happened";
        this.YearGraduated = 0;
    }

    public Prof(String name, String email, String degree, String uni, int yearGrad){
        super(name, email);
        this.Degree = degree;
        this.University = uni;
        this.YearGraduated = yearGrad;
    }

}