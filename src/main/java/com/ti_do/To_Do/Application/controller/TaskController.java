package com.ti_do.To_Do.Application.controller;


import com.ti_do.To_Do.Application.model.Task;
import com.ti_do.To_Do.Application.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    private List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }


    @PostMapping
    public Task createTask(Task task){
        return taskService.createTask(task);
    }

    public Task updateTask(@PathVariable Long id,@RequestBody Task task){
        return taskService.updateTask(id, task);
    }

    @DeleteMapping
    public void deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
    }
}
