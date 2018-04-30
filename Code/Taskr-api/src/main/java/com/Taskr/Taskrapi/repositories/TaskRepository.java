package com.Taskr.Taskrapi.repositories;

import com.Taskr.Taskrapi.model.Task;
import org.springframework.data.repository.CrudRepository;

/**
 * This interface is used to create the task repository to store tasks.
 */
public interface TaskRepository extends CrudRepository<Task, String> {
}