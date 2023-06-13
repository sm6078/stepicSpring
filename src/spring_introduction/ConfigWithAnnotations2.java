package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations2 {
    public static void main(String[] args) {
        var context =
                new ClassPathXmlApplicationContext("applicationContext4.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();


        context.close();
    }
}
