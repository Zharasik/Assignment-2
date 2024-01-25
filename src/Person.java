public class Person implements Payable, Comparable<Person> {
    private static int id = 1;

    private String name;

    private int int_id;
    private String surname;

    // Default constructor
    public Person() {
        this.int_id = id++;
    }

    // Parameterized constructor
    public Person(String name, String surname) {
        this();
        setName(name);
        setSurname(surname);
    }

    // Setter and getter methods for name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Setter and getter methods for surname
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    // Getter method for identification number
    public int getId() {
        return int_id;
    }

    // toString method for creating a string representation of the object
    @Override
    public String toString() {
        return int_id + " " + name + " " + surname;
    }

    // getPosition method returning a fixed position "Student"
    public String getPosition() {
        return "Student";
    }

    // compareTo method for comparing Person objects based on payment amounts
    public int compareTo(Person otherPerson) {
        return Double.compare(this.getPaymentAmount(), otherPerson.getPaymentAmount());
    }

    // Default implementation of getPaymentAmount returning 0
    @Override
    public double getPaymentAmount() {
        return 0;
    }
}