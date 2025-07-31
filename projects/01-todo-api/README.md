# Todo API - Your First REST API! 🚀

Welcome to your first real-world Java backend project! This is a complete REST API for managing todos, built with Spring Boot. You'll learn how to create, read, update, and delete data through HTTP endpoints.

## 🎯 What You'll Learn

- **REST API Development** - Build HTTP endpoints
- **Spring Boot Framework** - The most popular Java framework
- **Database Integration** - Store and retrieve data
- **API Testing** - Test your endpoints
- **Real-world Project Structure** - Professional code organization

## 📁 Project Structure

```
src/main/java/com/example/todoapi/
├── TodoApiApplication.java     # Main application class
├── controller/
│   └── TodoController.java     # REST endpoints
├── service/
│   └── TodoService.java        # Business logic
├── repository/
│   └── TodoRepository.java     # Database access
└── model/
    └── Todo.java               # Data model
```

## 🛠 Setup and Run

### Prerequisites
- Java 17 or higher
- Maven 3.6 or higher

### Running the Application

1. **Navigate to the project directory:**
   ```bash
   cd projects/01-todo-api
   ```

2. **Build the project:**
   ```bash
   mvn clean compile
   ```

3. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```

4. **Access the API:**
   - API Base URL: `http://localhost:8080/api/todos`
   - Database Console: `http://localhost:8080/h2-console`

## 📚 API Endpoints

### 1. Get All Todos
```http
GET /api/todos
```
**Response:**
```json
[
  {
    "id": 1,
    "title": "Learn Java",
    "description": "Complete the Java backend course",
    "completed": false,
    "createdAt": "2024-01-15T10:30:00",
    "updatedAt": null
  }
]
```

### 2. Get Single Todo
```http
GET /api/todos/{id}
```
**Example:** `GET /api/todos/1`

### 3. Create New Todo
```http
POST /api/todos
Content-Type: application/json

{
  "title": "Learn Spring Boot",
  "description": "Build a REST API with Spring Boot"
}
```

### 4. Update Todo
```http
PUT /api/todos/{id}
Content-Type: application/json

{
  "title": "Learn Spring Boot (Updated)",
  "description": "Build multiple REST APIs",
  "completed": true
}
```

### 5. Mark Todo as Complete
```http
PATCH /api/todos/{id}/complete
```

### 6. Delete Todo
```http
DELETE /api/todos/{id}
```

### 7. Get Completed Todos
```http
GET /api/todos/completed
```

### 8. Get Pending Todos
```http
GET /api/todos/pending
```

### 9. Search Todos
```http
GET /api/todos/search?q=java
```

### 10. Get Statistics
```http
GET /api/todos/stats
```
**Response:**
```json
{
  "total": 10,
  "completed": 7,
  "pending": 3
}
```

## 🧪 Testing Your API

### Using cURL

1. **Create a todo:**
   ```bash
   curl -X POST http://localhost:8080/api/todos \
        -H "Content-Type: application/json" \
        -d '{"title": "My First Todo", "description": "Learning REST APIs"}'
   ```

2. **Get all todos:**
   ```bash
   curl http://localhost:8080/api/todos
   ```

3. **Update a todo:**
   ```bash
   curl -X PUT http://localhost:8080/api/todos/1 \
        -H "Content-Type: application/json" \
        -d '{"title": "Updated Todo", "description": "Updated description", "completed": true}'
   ```

4. **Delete a todo:**
   ```bash
   curl -X DELETE http://localhost:8080/api/todos/1
   ```

### Using Postman

1. Download and install [Postman](https://www.postman.com/)
2. Create a new collection called "Todo API"
3. Add requests for each endpoint above
4. Test all the endpoints

## 💾 Database

This project uses H2 in-memory database for simplicity:

- **URL:** `jdbc:h2:mem:tododb`
- **Username:** `sa`
- **Password:** (empty)
- **Console:** http://localhost:8080/h2-console

### Sample SQL Queries

```sql
-- View all todos
SELECT * FROM todos;

-- Count completed todos
SELECT COUNT(*) FROM todos WHERE completed = true;

-- Find todos by title
SELECT * FROM todos WHERE title LIKE '%Java%';
```

## 🎯 Key Concepts Demonstrated

### 1. MVC Architecture
- **Model:** `Todo.java` (data structure)
- **View:** JSON responses (API responses)
- **Controller:** `TodoController.java` (handles requests)

### 2. Service Layer Pattern
- Business logic separated in `TodoService.java`
- Clean separation of concerns

### 3. Repository Pattern
- Data access abstracted in `TodoRepository.java`
- Spring Data JPA provides automatic implementations

### 4. REST Principles
- Proper HTTP methods (GET, POST, PUT, DELETE)
- Meaningful URLs
- Appropriate status codes

### 5. Data Validation
- `@NotBlank` for required fields
- `@Size` for length constraints
- `@Valid` for request validation

## 🚀 Extending the Project

Try these enhancements to practice:

### Beginner Level
1. Add a `priority` field (HIGH, MEDIUM, LOW)
2. Add a `dueDate` field
3. Create endpoint to get overdue todos

### Intermediate Level
1. Add user authentication
2. Allow multiple users with their own todos
3. Add categories/tags for todos
4. Implement pagination for large result sets

### Advanced Level
1. Add real database (MySQL/PostgreSQL)
2. Implement caching with Redis
3. Add comprehensive error handling
4. Create unit and integration tests
5. Add API documentation with Swagger

## 🐛 Troubleshooting

### Common Issues

1. **Port 8080 already in use:**
   ```bash
   # Change port in application.properties
   server.port=8081
   ```

2. **Cannot connect to H2 database:**
   - Make sure the application is running
   - Check the console URL: http://localhost:8080/h2-console

3. **JSON parsing errors:**
   - Ensure Content-Type is application/json
   - Check JSON syntax

## 🎉 Congratulations!

You've built your first REST API! This project demonstrates:

- ✅ Complete CRUD operations
- ✅ RESTful endpoint design
- ✅ Database integration
- ✅ Input validation
- ✅ Professional project structure
- ✅ Real-world development practices

## 🔗 What's Next?

1. Complete the [Blog API Project](../02-blog-api/README.md)
2. Learn about [Spring Security](../../docs/09-security/README.md)
3. Explore [Database Integration](../../docs/08-database/README.md)
4. Study [Testing Best Practices](../../docs/10-testing/README.md)

---

**🎊 Great job! You're now a backend developer who can build real APIs!**