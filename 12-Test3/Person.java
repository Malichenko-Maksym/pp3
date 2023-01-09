public class Person {
    private String name;
    private String surname;
    
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name.substring(0, 1).toUpperCase()+surname.substring(0, 1).toUpperCase();
    }
}
