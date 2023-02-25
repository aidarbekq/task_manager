package com.pr.task_manager.controller;


import com.pr.task_manager.model.Task;
import com.pr.task_manager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Date;

@RestController
public class TaskRestController {
    @Autowired
    TaskService taskService;

    @PostMapping(path = "/save-task", produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public String saveTask(@RequestBody Task task) {
        task.setDateCreated(new Date());
        taskService.save(task);
        return "{\"msg\":\"success\"}";
    }

    @DeleteMapping(path = "/delete-task/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String deleteTask(@PathVariable("id") int id) {
        taskService.delete(id);
        return"{\"msg\":\"success\"}";
    }

}
