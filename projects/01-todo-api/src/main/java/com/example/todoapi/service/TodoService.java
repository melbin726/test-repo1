package com.example.todoapi.service;

import com.example.todoapi.model.Todo;
import com.example.todoapi.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class for Todo business logic
 * This layer contains the business rules and operations
 */
@Service
public class TodoService {
    
    @Autowired
    private TodoRepository todoRepository;
    
    // Get all todos
    public List<Todo> getAllTodos() {
        return todoRepository.findAllOrderByCreatedAtDesc();
    }
    
    // Get todo by id
    public Optional<Todo> getTodoById(Long id) {
        return todoRepository.findById(id);
    }
    
    // Create a new todo
    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }
    
    // Update an existing todo
    public Todo updateTodo(Long id, Todo todoDetails) {
        Todo todo = todoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Todo not found with id: " + id));
        
        todo.setTitle(todoDetails.getTitle());
        todo.setDescription(todoDetails.getDescription());
        todo.setCompleted(todoDetails.getCompleted());
        
        return todoRepository.save(todo);
    }
    
    // Mark todo as completed
    public Todo completeTodo(Long id) {
        Todo todo = todoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Todo not found with id: " + id));
        
        todo.setCompleted(true);
        return todoRepository.save(todo);
    }
    
    // Delete a todo
    public void deleteTodo(Long id) {
        if (!todoRepository.existsById(id)) {
            throw new RuntimeException("Todo not found with id: " + id);
        }
        todoRepository.deleteById(id);
    }
    
    // Get todos by completion status
    public List<Todo> getTodosByStatus(Boolean completed) {
        return todoRepository.findByCompleted(completed);
    }
    
    // Search todos by title
    public List<Todo> searchTodos(String keyword) {
        return todoRepository.findByTitleContainingIgnoreCase(keyword);
    }
    
    // Get todo statistics
    public TodoStats getStats() {
        long total = todoRepository.count();
        long completed = todoRepository.countByCompleted(true);
        long pending = total - completed;
        
        return new TodoStats(total, completed, pending);
    }
    
    // Inner class for statistics
    public static class TodoStats {
        private long total;
        private long completed;
        private long pending;
        
        public TodoStats(long total, long completed, long pending) {
            this.total = total;
            this.completed = completed;
            this.pending = pending;
        }
        
        // Getters
        public long getTotal() { return total; }
        public long getCompleted() { return completed; }
        public long getPending() { return pending; }
    }
}