package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.example.bean.UserConfig;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml") // Load XML Beans
public class App {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);
        UserConfig userConfig = context.getBean(UserConfig.class);

        System.out.println("Bean Loaded: " + userConfig.getName()+" "+ userConfig.getClassName());
    }
}
