package Lamdas;

import java.time.LocalDate;

public class Person {
    String name;
    LocalDate birthday;  //format of
    Sex gender;
    String emailAddress;
    ArrayList<Person> peopleList = new ArrayList<>();


    public enum Sex {
        MALE, FEMALE
    }



    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }


    public Person create (String name, LocalDate birthday, Sex gender, String emailAddress){
        Person createdPerson = new Person(name, birthday, gender, emailAddress);
        peopleList.add(createdPerson);
        return createdPerson;
    }

    public ArrayList<Person> getPeopleList () {
        return peopleList;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    public Integer getAge() {
        return Period.between(birthday, LocalDate.now()).getYears();
    }


    public void printPerson() {
        System.out.println(String.format("Person Object{ Name: %s, Birthday: %s, Gender: %s, EmailAddress: %s}\n", name, birthday, gender, emailAddress));
    }

    public static void printPersons(
            List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }


    public int getAge(LocalDate birthday) {
        LocalDate today = LocalDate.now();
        Integer p = Period.between(birthday, today).getYears();
        // OR
        return p;
    }

}
