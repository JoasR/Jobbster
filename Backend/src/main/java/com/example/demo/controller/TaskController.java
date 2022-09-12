package com.example.demo.controller;

import com.example.demo.entity.DTO.TaskDTO;
import com.example.demo.services.TaskService;
import com.example.demo.services.TaskServiceImpl;
import com.example.demo.entity.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/task")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping
    public List<TaskDTO> getTasks(){
        List<Task> allTasks = taskService.getAllTasks();
        List<TaskDTO> allTasksDTO = new ArrayList<>();
        for (Task task : allTasks){
            TaskDTO taskDTO = new TaskDTO(task);
            allTasksDTO.add(taskDTO);
        }
        return allTasksDTO;
    }
}
