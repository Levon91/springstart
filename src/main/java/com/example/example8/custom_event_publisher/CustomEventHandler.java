package com.example.example8.custom_event_publisher;

import org.springframework.context.ApplicationListener;

/**
 * Created by levont on 21/03/2017.
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        System.out.println(customEvent.toString());
    }
}
