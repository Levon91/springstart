package com.example.example7.event_listening;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * Created by levont on 21/03/2017.
 */
public class CtxtStartEventListener implements ApplicationListener<ContextStartedEvent> {
    @Override
    public void onApplicationEvent(ContextStartedEvent contextStartedEvent) {
        ApplicationContext applicationContext = contextStartedEvent.getApplicationContext();
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
        helloWorld.setMessage("Hello world");
        System.err.println(".........Context started.........");
    }
}
