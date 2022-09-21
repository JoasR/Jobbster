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
            Task task3 = new Task(
                    "Task 3 Title",
                    "Task 3 Description",
                    Category.ANIMALS,
                    "ThisIsAnImageUrl3",
                    LocalDateTime.now()
            );
            Task task4 = new Task(
                    "Task 4 Title",
                    "Task 4 Description",
                    Category.GARDENING,
                    "ThisIsAnImageUrl4",
                    LocalDateTime.now()
            );
            Task task5 = new Task(
                    "Task 5 Title",
                    "Task 5 Description",
                    Category.ANIMALS,
                    "ThisIsAnImageUrl5",
                    LocalDateTime.now()
            );
            Task task6 = new Task(
                    "Task 6 Title",
                    "Task 6 Description",
                    Category.GARDENING,
                    "ThisIsAnImageUrl6",
                    LocalDateTime.now()
            );
            Task task7 = new Task(
                    "Task 7 Title",
                    "Task 7 Description",
                    Category.ANIMALS,
                    "ThisIsAnImageUrl7",
                    LocalDateTime.now()
            );
            Task task8 = new Task(
                    "Task 8 Title",
                    "Task 8 Description",
                    Category.GARDENING,
                    "ThisIsAnImageUrl8",
                    LocalDateTime.now()
            );
            Task task9 = new Task(
                    "Task 9 Title",
                    "Task 9 Description",
                    Category.ANIMALS,
                    "ThisIsAnImageUrl9",
                    LocalDateTime.now()
            );
            Task task10 = new Task(
                    "Task 10 Title",
                    "Task 10 Description",
                    Category.GARDENING,
                    "ThisIsAnImageUrl10",
                    LocalDateTime.now()
            );
            taskDAO.saveAll(List.of(task1, task2, task3, task4, task5, task6, task7, task8, task9, task10));
        };
    }
}
