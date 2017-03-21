package com.example;

import com.example.example6.TextEditor4;
import com.example.example7.event_listening.HelloWorld;
import com.example.example8.custom_event_publisher.CustomEventPublisher;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring/beans.xml");

        /*example1*/
//        HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");

//        obj1.setMessage("Im object A");
//        obj1.getMessage1();
//        obj1.getMessage2();

//        HelloArmenia obj2 = (HelloArmenia) context.getBean("helloArmenia");
//        obj2.getMessage1();
//        obj2.getMessage2();
//        obj2.getMessage3();

//        HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");
//        obj2.getMessage();
//        context.registerShutdownHook();

        /*example2*/
//        TextEditor2 editor = (TextEditor2) context.getBean("textEditor");
//        editor.spellCheck();

        /*example3*/
//        User user = (User) context.getBean("user");
//        System.out.println("Name " + user.getName());
//        System.out.println("Age " + user.getAge());

        /*example4*/
//        TextEditor2 editor2 = (TextEditor2) context.getBean("textEditor2");
//        editor2.spellCheck();

        /*example5*/
//        TextEditor3 editor3 = (TextEditor3) context.getBean("textEditor3");
//        editor3.spellCheck();

        /*example6*/
//        TextEditor4 editor4 = (TextEditor4) context.getBean("textEditor4");
//        editor4.spellCheck();

        /*example7*/
//        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring/example7.xml");
//        context.start();
//
//        HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
//        obj1.getMessage();
//
//        context.stop();
//        obj1.getMessage();

        /*example8*/
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring/example8.xml");

        CustomEventPublisher customEventPublisher = (CustomEventPublisher) context.getBean("customEventPublisher");

        customEventPublisher.publish();
        customEventPublisher.publish2();
    }
}
