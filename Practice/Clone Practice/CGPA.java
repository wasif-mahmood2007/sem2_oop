public class CGPA {
    double gpa;

    //Parameterized Constructor
    public CGPA(double g)
    {
        this.gpa=g;
    }

    //Setter and Getter
    public void setCGPA(double g)
    {
        this.gpa=g;
    }
    public double getCGPA()
    {
        return gpa;
    }

    //toString
    @Override
    public String toString()
    {
        return "CGPA: "+gpa+"";
    }
}
