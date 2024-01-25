public class Student extends Person {
    private Double gpa;
    private static final double stipend = 42000.00;

    // Default constructor
    public Student() {
        super();
    }

    // Parameterized constructor
    public Student(String name, String surname, double gpa) {
        super(name, surname);
        setGpa(gpa);
    }

    // Setter method for GPA
    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    // Getter method for GPA
    public Double getGpa() {
        return gpa;
    }

    // Override toString method to provide a formatted string representation of the student
    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    // Override getPaymentAmount method to return the stipend based on GPA
    @Override
    public double getPaymentAmount() {
        return (gpa > 2.67) ? stipend : 0;
    }
}