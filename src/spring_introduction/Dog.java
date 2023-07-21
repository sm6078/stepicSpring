package spring_introduction;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet {

    private String name;

    public void init() {
        System.out.println("Class dog: init method");
    }

    public Dog() {
        System.out.println("Dog bean is created");
    }

    public void destroy() {
        System.out.println("Class dog: destroy method");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}
