package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.APRIL;
import static java.util.Calendar.JULY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner CommandLineRunner(StudentRepository repository){
 return  args ->
 {
     Student mariam=new Student(

             "mariam",
             "mariam@gmail.com",
             LocalDate.of(2000, APRIL,5)

     );

     Student alex =new Student(

             "alex",
             "alex@gmail.com",
             LocalDate.of(2003, JULY,2)

     );

     repository.saveAll(
             List.of(mariam,alex)
     );
 };
    }
}
