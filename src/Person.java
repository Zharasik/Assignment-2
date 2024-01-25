public class Person {
    private static int id = 1;

    private String name;
    private String surname;

    public Person() {
        this.id = id++;
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
        return id;
    }
     c
    public String toString() {
        return id +" "+name+" "+surname;

    }
}


