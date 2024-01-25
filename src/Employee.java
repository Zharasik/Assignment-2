public class Employee extends Person {
    private String position;
    private double salary;

    // Default constructor
    public Employee() {
        super();
    }

    // Parameterized constructor
    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        setPosition(position);
        setSalary(salary);
    }

    // Override getPosition method to return the specific position of the employee
    @Override
    public String getPosition() {
        return position;
    }

    // Setter method for position
    public void setPosition(String position) {
        this.position = position;
    }

    // Getter method for salary
    public double getSalary() {
        return salary;
    }

    // Setter method for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Override toString method to provide a formatted string representation of the employee
    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }

    // Override getPaymentAmount method to return the salary of the employee
    @Override
    public double getPaymentAmount() {
        return salary;
    }
}
