package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("singleton") //default
//@Scope("prototype")
public class Dog implements Pet {

    private String name;

    @PostConstruct
    public void init() {
        System.out.println("Class dog: init method");
    }

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class dog: destroy method");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}
