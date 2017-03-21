package com.example.example7.event_listening;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * Created by levont on 21/03/2017.
 */
public class CtxtStopEventListener implements ApplicationListener<ContextStoppedEvent> {
    @Override
    public void onApplicationEvent(ContextStoppedEvent contextStoppedEvent) {
        ApplicationContext applicationContext = contextStoppedEvent.getApplicationContext();
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
        helloWorld.setMessage("Good by world");
        System.err.println(".........Context stopped.........");
    }
}
