package Lamdas;

public class CheckForSelectiveService implements CheckPerson{
    public Boolean test(Person person) {
        return person.gender == Person.Sex.MALE &&
                person.getAge() >= 18 &&
                person.getAge() <= 25;
    }

}
