package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext4.xml");

        //Cat myCat = context.getBean("catBean", Cat.class);
        //default name bean
        Cat myCat = context.getBean("cat", Cat.class);
        myCat.say();

        context.close();
    }
}
