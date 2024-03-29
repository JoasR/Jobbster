package com.example.demo.services;

import com.example.demo.DAO.TaskDAO;
import com.example.demo.entity.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService{

    private final TaskDAO taskDAO;

    @Autowired
    public TaskServiceImpl(TaskDAO taskDAO) {
        this.taskDAO = taskDAO;
    }

    @Override
    public List<Task> getAllTasks() {
        return taskDAO.findAll();
    }
}
