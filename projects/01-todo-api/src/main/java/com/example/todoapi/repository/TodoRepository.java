package com.example.todoapi.repository;

import com.example.todoapi.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository interface for Todo entity
 * This handles all database operations for todos
 */
@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
    
    // Find all completed todos
    List<Todo> findByCompleted(Boolean completed);
    
    // Find todos by title containing a keyword (case-insensitive)
    List<Todo> findByTitleContainingIgnoreCase(String keyword);
    
    // Find todos ordered by creation date (newest first)
    @Query("SELECT t FROM Todo t ORDER BY t.createdAt DESC")
    List<Todo> findAllOrderByCreatedAtDesc();
    
    // Count completed todos
    long countByCompleted(Boolean completed);
}