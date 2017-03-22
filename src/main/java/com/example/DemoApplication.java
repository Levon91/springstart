package com.example;

import com.example.example6.TextEditor4;
import com.example.example7.event_listening.HelloWorld;
import com.example.example8.custom_event_publisher.CustomEventPublisher;
import com.example.example9.jdbc.model.User;
import com.example.example9.jdbc.user.impl.UserDaoImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

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
//        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring/example8.xml");
//
//        CustomEventPublisher customEventPublisher = (CustomEventPublisher) context.getBean("customEventPublisher");
//
//        customEventPublisher.publish();
//        customEventPublisher.publish2();

        /*example9*/
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/beans.xml");
        UserDaoImpl userDao = (UserDaoImpl) context.getBean("userDao");

        List<User> userList = userDao.listUsers();
        if (userList.isEmpty()){

        }

        userDao.create("Gor", 24);
        userDao.create("Davit", 26);
        userDao.create("Levon", 25);
        userDao.create("Test", 30);

        User user /* = userDao.getUser(1)*/;
//        System.out.println(user.toString());

        List<User> users = userDao.listUsers();
        for (User user1 : users) {
            System.out.println(user1.toString());
        }

        userDao.update(1, "Gor", 25);

        user = userDao.getUser(1);

        System.out.println(user.toString());

        userDao.delete(4);

        users = userDao.listUsers();

        for (User user1 : users) {
            System.out.println(user1.toString());
        }


    }
}
