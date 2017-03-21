package com.example.example8.custom_event_publisher;

import org.springframework.context.ApplicationEvent;

/**
 * Created by levont on 21/03/2017.
 */
public class CustomEvent extends ApplicationEvent {

    public CustomEvent(Object source) {
        super(source);
    }

    public String toString() {
        return "My custom event";
    }
}
