package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext4.xml");

        Dog myDog = context.getBean("dog", Dog.class);
        Dog yourDog = context.getBean("dog", Dog.class);

        myDog.say();

        context.close();

        System.out.println("Переменные ссылаются на один и тот же объект ? " + (myDog == yourDog));
        System.out.println(myDog);
        System.out.println(yourDog);

    }
}
