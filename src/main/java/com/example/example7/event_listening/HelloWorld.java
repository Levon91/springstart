package com.example.example7.event_listening;

import org.springframework.beans.factory.annotation.Required;

/**
 * Created by levont on 21/03/2017.
 */
public class HelloWorld {
    private String message;

    public void getMessage() {
        System.err.println("Message: " + message);
    }

    @Required
    public void setMessage(String message) {
        this.message = message;
    }
}
