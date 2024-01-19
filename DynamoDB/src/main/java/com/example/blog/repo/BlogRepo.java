package com.example.blog.repo;

import com.example.blog.model.Todo;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableScan
public interface BlogRepo extends CrudRepository<Todo, Integer> {
}
