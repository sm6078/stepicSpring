package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext4.xml");

        Person person = context.getBean("personBean", Person.class);
        System.out.println("Surname: " + person.getSurname());
        System.out.println("Age: " + person.getAge());
        context.close();
    }
}
