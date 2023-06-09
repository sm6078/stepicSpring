package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    @Autowired
    private Pet pet;
    private String surname;
    private int age;

   /* public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }*/

     public Person() {
         System.out.println("Person bean is created");
     }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        System.out.println("Class person: set age");
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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
