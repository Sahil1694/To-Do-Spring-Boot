package com.ti_do.To_Do.Application.repository;

import com.ti_do.To_Do.Application.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
