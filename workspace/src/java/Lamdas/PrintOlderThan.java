package Lamdas;

public class PrintOlderThan {
    public Boolean test(Person person) {
        if (person.getAge() >= 18) {
            person.printPerson();
            return true;
        }
        return false;
    }
}
