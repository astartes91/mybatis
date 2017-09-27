package org.bibliarij.assignment2gis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class Assignment2GisApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Assignment2GisApplication.class, args);
    }
}
