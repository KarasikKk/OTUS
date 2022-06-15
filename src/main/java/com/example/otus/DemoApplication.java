package com.example.otus;

import com.example.otus.service.AppRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("/spring-context.xml");
        AppRunner appRunner = (AppRunner) applicationContext.getBean("appRunner");
        appRunner.run();
    }

}
