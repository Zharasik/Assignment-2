public class Student extends Person {
    private Double gpa;

    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa) {

        super(name, surname);
        setGpa(gpa);
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public Double getGpa() {
        return gpa;
    }
    @Override
    public String toString() {
        return "Student:"+super.toString();
    }}