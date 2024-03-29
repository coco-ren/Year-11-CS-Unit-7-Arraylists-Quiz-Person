public class Person {

    private String firstName;
    private String lastName;
    private int age;

//constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

//getters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

//setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

//toString
    public String toString() {
        return "First Name = " + firstName + ", " + "Last Name = " + lastName + ", " + "Age = " + age + ".";
    }
}

