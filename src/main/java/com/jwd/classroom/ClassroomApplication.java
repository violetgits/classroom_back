package com.jwd.classroom;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jwd.classroom.mapper")
public class ClassroomApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClassroomApplication.class, args);
    }

}
