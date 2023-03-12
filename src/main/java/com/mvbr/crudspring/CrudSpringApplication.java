package com.mvbr.crudspring;

import com.mvbr.crudspring.model.Course;
import com.mvbr.crudspring.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication {

    public static void main(String[] args) {

        SpringApplication.run(CrudSpringApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(CourseRepository courseRepository) {

        return args -> {

            courseRepository.deleteAll();

            Course c1 = new Course();
            c1.setName("Angular");
            c1.setCategory("front-end");

            Course c2 = new Course();
            c2.setName("React");
            c2.setCategory("front-end");

            Course c3 = new Course();
            c3.setName("Nest");
            c3.setCategory("back-end");

            Course c4 = new Course();
            c4.setName("Express");
            c4.setCategory("back-end");

            Course c5 = new Course();
            c5.setName("Vue");
            c5.setCategory("front-end");

            Course c6 = new Course();
            c6.setName("Spring Framework");
            c6.setCategory("back-end");

            Course c7 = new Course();
            c7.setName("Svelte");
            c7.setCategory("front-end");

            courseRepository.save(c1);
            courseRepository.save(c2);
            courseRepository.save(c3);
            courseRepository.save(c4);
            courseRepository.save(c5);
            courseRepository.save(c6);
            courseRepository.save(c7);

        };

    }

}



