package com.pr.task_manager.repository;

import com.pr.task_manager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface TaskRepository extends CrudRepository<Task, Integer> {

    Task findOne(int id);
}
