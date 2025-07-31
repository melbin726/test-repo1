package com.example.todoapi.controller;

import com.example.todoapi.model.Todo;
import com.example.todoapi.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * REST Controller for Todo API
 * This handles all HTTP requests for todo operations
 */
@RestController
@RequestMapping("/api/todos")
@CrossOrigin(origins = "*") // Allow requests from any origin (for development)
public class TodoController {
    
    @Autowired
    private TodoService todoService;
    
    // GET /api/todos - Get all todos
    @GetMapping
    public ResponseEntity<List<Todo>> getAllTodos() {
        List<Todo> todos = todoService.getAllTodos();
        return ResponseEntity.ok(todos);
    }
    
    // GET /api/todos/{id} - Get todo by id
    @GetMapping("/{id}")
    public ResponseEntity<Todo> getTodoById(@PathVariable Long id) {
        Optional<Todo> todo = todoService.getTodoById(id);
        return todo.map(ResponseEntity::ok)
                  .orElse(ResponseEntity.notFound().build());
    }
    
    // POST /api/todos - Create a new todo
    @PostMapping
    public ResponseEntity<Todo> createTodo(@Valid @RequestBody Todo todo) {
        Todo createdTodo = todoService.createTodo(todo);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdTodo);
    }
    
    // PUT /api/todos/{id} - Update an existing todo
    @PutMapping("/{id}")
    public ResponseEntity<Todo> updateTodo(@PathVariable Long id, @Valid @RequestBody Todo todoDetails) {
        try {
            Todo updatedTodo = todoService.updateTodo(id, todoDetails);
            return ResponseEntity.ok(updatedTodo);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
    
    // PATCH /api/todos/{id}/complete - Mark todo as completed
    @PatchMapping("/{id}/complete")
    public ResponseEntity<Todo> completeTodo(@PathVariable Long id) {
        try {
            Todo completedTodo = todoService.completeTodo(id);
            return ResponseEntity.ok(completedTodo);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
    
    // DELETE /api/todos/{id} - Delete a todo
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable Long id) {
        try {
            todoService.deleteTodo(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
    
    // GET /api/todos/completed - Get completed todos
    @GetMapping("/completed")
    public ResponseEntity<List<Todo>> getCompletedTodos() {
        List<Todo> completedTodos = todoService.getTodosByStatus(true);
        return ResponseEntity.ok(completedTodos);
    }
    
    // GET /api/todos/pending - Get pending todos
    @GetMapping("/pending")
    public ResponseEntity<List<Todo>> getPendingTodos() {
        List<Todo> pendingTodos = todoService.getTodosByStatus(false);
        return ResponseEntity.ok(pendingTodos);
    }
    
    // GET /api/todos/search?q={keyword} - Search todos
    @GetMapping("/search")
    public ResponseEntity<List<Todo>> searchTodos(@RequestParam("q") String keyword) {
        List<Todo> searchResults = todoService.searchTodos(keyword);
        return ResponseEntity.ok(searchResults);
    }
    
    // GET /api/todos/stats - Get todo statistics
    @GetMapping("/stats")
    public ResponseEntity<TodoService.TodoStats> getTodoStats() {
        TodoService.TodoStats stats = todoService.getStats();
        return ResponseEntity.ok(stats);
    }
}