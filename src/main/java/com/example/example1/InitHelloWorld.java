package com.example.example1;

/**
 * Created by levont on 20/03/2017.
 */
public class InitHelloWorld /*implements BeanPostProcessor*/ {

    private HelloWorld helloWorld;

//    @Override
//    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        System.err.println("Before " + beanName + " bean initialization");
//        helloWorld = new HelloWorld();
//        helloWorld.setMessage1("Hello world from postProcessBeforeInitialization()");
//        bean = helloWorld;
//        return bean;
//    }
//
//    @Override
//    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        System.err.println("After " + beanName + " bean initialization");
//        return bean;
//    }

    public HelloWorld getHelloWorld() {
        return helloWorld;
    }

    public void setHelloWorld(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }
}
