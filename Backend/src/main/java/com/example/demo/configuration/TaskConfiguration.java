package com.example.demo.configuration;

import com.example.demo.DAO.TaskDAO;
import com.example.demo.entity.model.Address;
import com.example.demo.entity.model.Category;
import com.example.demo.entity.model.Task;
import com.example.demo.entity.model.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Configuration
public class TaskConfiguration {
    Address address = new Address("City1", "Postcode1", "StreetAndHouseNumber1");
    User user = new User("FirstName1", "LastName1", "Email1", "ImageURL1", "PasswordHash1");

    @Bean
    CommandLineRunner commandLineRunner(TaskDAO taskDAO){
        return args -> {
            Task task1 = new Task(
                    "Task 1 Title",
                    "Task 1 Description",
                    Category.ANIMALS,
                    "ThisIsAnImageUrl",
                    LocalDateTime.now()
            );
            Task task2 = new Task(
                    "Task 2 Title",
                    "Task 2 Description",
                    Category.GARDENING,
                    "ThisIsAnImageUrl2",
                    LocalDateTime.now()
                    );
            taskDAO.saveAll(List.of(task1, task2));
        };
    }
}
