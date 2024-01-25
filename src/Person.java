public class Person implements Payable, Comparable<Person> {
    private static int id = 1;

    private String name;

    private int int_id;
    private String surname;

    public Person() {
        this.int_id = id++;
    }

    public Person(String name, String surname) {
        this();
        setName(name);
        setSurname(surname);

    }

    public void setName(String name){
        this.name=name;}
    public String getName(){
        return name;
    }
    public void setSurname(String surname){
        this.surname=surname;}
    public String getSurname(){
        return surname;
    }
    public int getId(){
        return int_id;
    }
    @Override
    public String toString() {
        return int_id +" "+name+" "+surname;

    }

   public String  getPosition(){
        return "Student";
    }

    public int compareTo(Person otherPerson)
    {
        return Double.compare(this.getPaymentAmount(), otherPerson.getPaymentAmount());
    }
    @Override
    public double getPaymentAmount()
    {
        return 0;
    }

}


