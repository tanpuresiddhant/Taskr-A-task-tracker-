package com.Taskr.Taskrapi.repositories;

import com.Taskr.Taskrapi.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, String> {
}