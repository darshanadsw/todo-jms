package com.myapp.todojms.repositories;

import com.myapp.todojms.domain.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo,String> {
}
