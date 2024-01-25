import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Create instances of Employee and Student
        Employee emp1 = new Employee("Nur-Sultan", "Khaimuldin", "Teacher", 50000.00);
        Employee emp2 = new Employee("Fuse", "Tea", "Business", 2500000.00);
        Student stu1 = new Student("Halyk", "Bank", 2.4);
        Student stu2 = new Student("Zharas", "Satybaldy", 4.0);

        // Create an ArrayList to store Person objects
        ArrayList<Person> people = new ArrayList<>();
        people.add(emp1);
        people.add(emp2);
        people.add(stu1);
        people.add(stu2);

        // Sort the ArrayList based on the natural order defined in the compareTo method
        Collections.sort(people);

        // Print data for each person
        printData(people);
    }

    // Method to print data for an Iterable collection of Person objects
    public static void printData(Iterable<Person> people) {
        for (Person x : people) {
            System.out.println(x.toString() + " earns " + x.getPaymentAmount() + " tenge");
        }
    }
}
