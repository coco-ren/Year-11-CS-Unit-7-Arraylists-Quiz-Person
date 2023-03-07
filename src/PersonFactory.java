import java.util.ArrayList;

public class PersonFactory {

    private ArrayList<Person> allPersons;

    public PersonFactory() {
        allPersons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        if (allPersons.size() == 0) {
            allPersons.add(0, person);
        } else {
            int pos = 0;
            for (int i = 0; i < allPersons.size(); i++) {
                Person onePerson = allPersons.get(i);
                if (person.getLastName().compareTo(onePerson.getLastName()) <= 0) {
                    pos = i;
                    break;
                }
            }
            allPersons.add(pos,person);
        }
    }

    public ArrayList<Person> under18() {
        ArrayList<Person> output = new ArrayList<>();
        for (Person person : allPersons) {
            if (person.getAge() < 18) {
                output.add(person);
            }
        }
        return output;
    }

    public boolean checkLastName(String lastName) {
        for (Person person : allPersons) {
            if (person.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }
}
