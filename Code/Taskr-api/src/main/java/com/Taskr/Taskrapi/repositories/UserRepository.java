package com.Taskr.Taskrapi.repositories;

import com.Taskr.Taskrapi.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * This interface is used to create the user repository to store tasks.
 */
public interface UserRepository extends CrudRepository<User, String> {
}
