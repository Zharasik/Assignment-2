import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String[] args)
    {
        Employee emp1 = new Employee("Nur-Sultan", "Khaimuldin", "", 50000.00);
        Employee emp2 = new Employee("Fuse", "Tea", "", 2500000.00);
        Student stu1 = new Student("Halyk", "Bank", 2.4);
        Student stu2 = new Student("Zharas", "Satybaldy", 4.0);

        ArrayList<Person> people = new ArrayList<>();
        people.add(emp1);
        people.add(emp2);
        people.add(stu1);
        people.add(stu2);

        Collections.sort(people);

        printData(people);

    }
    public static void printData(Iterable<Person> people)
    {
        for (Person x : people)
        {
            System.out.println(x.toString() + " earns " + x.getPaymentAmount() + " tenge");
        }
    }
}