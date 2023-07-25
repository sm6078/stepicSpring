package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test7 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        //Pet cat = context.getBean("catBean", Pet.class);
        //cat.say();

        Person person = context.getBean("personBean", Person.class);
        System.out.println("Surname:" + person.getSurname());
        System.out.println("Age:" + person.getAge());
        //person.callYourPet();

        context.close();
    }
}
