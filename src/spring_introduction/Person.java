package spring_introduction;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    /*@Autowired
    @Qualifier("cat")*/
    private Pet pet;
    @Value("${person.surname}")
    //@Value("Hohlov")
    private String surname;
    @Value("${person.age}")
    //@Value("76")
    private int age;

    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class person: set age");
        this.age = age;
    }

    /*@Autowired
    @Qualifier("dog")*/
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    /*
    @Autowired
    public void anyMethodName(Pet pet) {
        System.out.println("Class Person: anyMethod");
        this.pet = pet;
    }
     */

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
