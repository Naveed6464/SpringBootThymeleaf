package com.naveed.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 *
 * @author Naveedur Rahman
 * @email naveed6464@gmail.com
 * @version 1.0
 * @since Jan 9, 2020
 */
@SpringBootApplication(scanBasePackages = {"com.naveed.spring.demo.web.controller"})
@Import(WebConfig.class)
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
