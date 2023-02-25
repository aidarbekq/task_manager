package com.pr.task_manager.service;

import com.pr.task_manager.model.Task;
import com.pr.task_manager.repository.TaskRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> findAll() {
        List<Task> tasks = new ArrayList<>();
        for (Task task : taskRepository.findAll()) {
            tasks.add(task);
        }
        return tasks;
    }

    public Task findTask(int id) {
        return taskRepository.findOne(id);
    }
    public void save(Task task) {
        taskRepository.save(task);
    }

    public void delete(int id) {
        taskRepository.deleteById(id);
    }



}
