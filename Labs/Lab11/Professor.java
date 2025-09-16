public class Professor extends Person{
    //Attributes
    private String Degree;
    private String Uni;
    private int YearGrad;

    //methods
    public String getDegree(){
        return getDegree();
    }
    public void setDegree(String degree){
        this.Degree = degree;
    }
    public String getUni(){
        return getUni();
    }
    public void setUni(String uni){
        this.Uni = uni;
    }
    public int getYearGrad(){
        return getYearGrad();
    }
    public void setYearGrad(int yearGrad){
        if (yearGrad < 1900) {
            throw new IllegalArgumentException("Year Graduated must be after 1900.");
        } else {
            this.YearGrad = yearGrad;
        }
    }

    //method to printInfo() person + professor info
    private void printInfo(Person name, Person email, Professor Degree, Professor Uni, Professor YearGrad){
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Degree: " + Degree);
        System.out.println("University: " + Uni);
        System.out.println("Year Graduated: " + YearGrad);
    }

    //Default 
    public Professor(){
        super();
        this.Degree = "N/A";
        this.Uni = "N/A";
        this.YearGrad = 0;
    }

    //Custom Constructor
    public Professor(String name, String email, String degree, String uni, int yearGrad){
        super(name, email);
        this.Degree = degree; 
        this.Uni = uni;
        this.YearGrad = yearGrad;
    }
}
