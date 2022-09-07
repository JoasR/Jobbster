package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class TaskConfiguration {
    @Bean
    CommandLineRunner commandLineRunner(TaskRepository taskRepository){
        return args -> {
            Task task1 = new Task(
                    "TaskName1",
                    "TaskTitle1",
                    "TaskDescription1"
            );

            Task task2 = new Task(
                            "TaskName2",
                            "TaskTitle2",
                            "TaskDescription2"
                    );
            taskRepository.saveAll(List.of(task1, task2));
        };
    }
}
