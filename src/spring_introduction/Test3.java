package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        //without DI spring
        /*
        Pet pet = new Dog();
        Person person = new Person(pet);
        person.callYourPet();
         */

        //DI spring
        /*
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = context.getBean("myPet", Pet.class);
        context.close();

        Person person = new Person(pet);
        person.callYourPet();
         */

        //DI spring width constructor, setters, strings
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("myPerson", Person.class);
        context.close();

        person.callYourPet();
        System.out.println("Name: " + person.getSurname());
        System.out.println("Age: " + person.getAge());
    }
}
