package com.example.example8.custom_event_publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Created by levont on 21/03/2017.
 */
public class CustomEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    public void publish() {
        CustomEvent customEvent = new CustomEvent(this);
        publisher.publishEvent(customEvent);
    }

    public void publish2() {
        CustomEvent2 customEvent2 = new CustomEvent2(this);
        publisher.publishEvent(customEvent2);
    }
}
