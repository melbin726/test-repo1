# Tools and Resources 🛠️

Essential tools, resources, and references for Java backend development.

## 🔧 Development Tools

### IDEs (Integrated Development Environments)

#### IntelliJ IDEA (Recommended)
- **Community Edition** - Free and powerful
- **Download:** https://www.jetbrains.com/idea/download/
- **Features:** Excellent Java support, Spring Boot integration, debugging
- **Tips:** Use shortcuts (Ctrl+Shift+A for actions, Ctrl+N for classes)

#### Visual Studio Code
- **Free and lightweight**
- **Download:** https://code.visualstudio.com/
- **Extensions:** Java Extension Pack, Spring Boot Extension Pack
- **Good for:** Beginners, multi-language development

#### Eclipse
- **Free and popular**
- **Download:** https://www.eclipse.org/downloads/
- **Features:** Strong Java support, many plugins
- **Good for:** Enterprise development

### Build Tools

#### Maven (Used in this course)
- **Download:** https://maven.apache.org/download.cgi
- **Purpose:** Project management, dependency management, build automation
- **Key files:** `pom.xml` (Project Object Model)
- **Commands:**
  ```bash
  mvn clean compile    # Clean and compile
  mvn spring-boot:run  # Run Spring Boot app
  mvn test            # Run tests
  ```

#### Gradle (Alternative)
- **Download:** https://gradle.org/install/
- **Purpose:** Modern build tool, faster than Maven
- **Key files:** `build.gradle`

### Java Development Kit (JDK)

#### Recommended JDK Distributions
1. **Eclipse Temurin (Adoptium)** - Free, high-quality
   - Download: https://adoptium.net/
   - Versions: Java 17, 21 (LTS versions)

2. **Oracle JDK** - Official Oracle distribution
   - Download: https://www.oracle.com/java/technologies/downloads/

3. **Amazon Corretto** - Amazon's distribution
   - Download: https://aws.amazon.com/corretto/

## 🌐 Online Resources

### Official Documentation
- **Java Documentation:** https://docs.oracle.com/en/java/
- **Spring Boot Guide:** https://spring.io/guides/gs/spring-boot/
- **Spring Boot Reference:** https://docs.spring.io/spring-boot/docs/current/reference/html/
- **JPA Documentation:** https://docs.oracle.com/javaee/7/tutorial/persistence-intro.htm

### Learning Platforms
- **Oracle Java Tutorials:** https://docs.oracle.com/javase/tutorial/
- **Spring Academy:** https://spring.academy/
- **Baeldung:** https://www.baeldung.com/ (Excellent Spring tutorials)
- **Java Code Geeks:** https://www.javacodegeeks.com/

### Video Resources
- **Spring Boot Tutorial (YouTube):** Search for "Spring Boot tutorial"
- **Java Basics (YouTube):** Search for "Java programming tutorial"
- **Coding with John:** Excellent Spring Boot content

## 📚 Books (Optional but Recommended)

### Beginner Level
1. **"Head First Java" by Kathy Sierra**
   - Great for beginners
   - Visual learning approach

2. **"Java: The Complete Reference" by Herbert Schildt**
   - Comprehensive Java coverage
   - Good reference book

### Intermediate/Advanced
1. **"Spring Boot in Action" by Craig Walls**
   - Hands-on Spring Boot guide
   - Practical examples

2. **"Effective Java" by Joshua Bloch**
   - Best practices for Java
   - Written by Java architect

3. **"Clean Code" by Robert Martin**
   - Writing maintainable code
   - Professional development practices

## 🔍 API Testing Tools

### Postman (Recommended)
- **Download:** https://www.postman.com/downloads/
- **Purpose:** Test REST APIs, create requests, manage collections
- **Features:** Beautiful UI, team collaboration, automated testing

### cURL (Command Line)
- **Built into most systems**
- **Purpose:** Command-line API testing
- **Examples:**
  ```bash
  curl -X GET http://localhost:8080/api/todos
  curl -X POST http://localhost:8080/api/todos -H "Content-Type: application/json" -d '{"title":"Test"}'
  ```

### HTTPie (Alternative to cURL)
- **Download:** https://httpie.io/
- **Purpose:** User-friendly command-line HTTP client
- **Example:**
  ```bash
  http GET localhost:8080/api/todos
  http POST localhost:8080/api/todos title="Test Todo"
  ```

## 🗄️ Database Tools

### H2 Console (Built-in)
- **Access:** http://localhost:8080/h2-console (when app is running)
- **Purpose:** View and query H2 database
- **Connection:** `jdbc:h2:mem:tododb`

### DBeaver (Universal Database Tool)
- **Download:** https://dbeaver.io/download/
- **Purpose:** Connect to any database, run queries
- **Supports:** MySQL, PostgreSQL, H2, SQLite, Oracle, etc.

### MySQL Workbench
- **Download:** https://www.mysql.com/products/workbench/
- **Purpose:** MySQL database design and management

## 🌍 Deployment Platforms

### Free Hosting Options
1. **Heroku** - Easy deployment, free tier available
   - https://www.heroku.com/
   
2. **Railway** - Modern platform, easy Git deployment
   - https://railway.app/
   
3. **Render** - Free hosting for web services
   - https://render.com/

### Cloud Platforms
1. **AWS (Amazon Web Services)**
   - Elastic Beanstalk for easy Java deployment
   - RDS for databases

2. **Google Cloud Platform**
   - App Engine for Java applications

3. **Microsoft Azure**
   - App Service for Java web apps

## 📱 Development Environment Setup

### Windows Setup
```bash
# Install Java
winget install EclipseAdoptium.Temurin.17.JDK

# Install Maven
winget install Apache.Maven

# Verify installation
java --version
mvn --version
```

### macOS Setup
```bash
# Install using Homebrew
brew install openjdk@17
brew install maven

# Verify installation
java --version
mvn --version
```

### Linux (Ubuntu/Debian) Setup
```bash
# Install Java
sudo apt update
sudo apt install openjdk-17-jdk

# Install Maven
sudo apt install maven

# Verify installation
java --version
mvn --version
```

## 🔧 Useful Maven Dependencies

### Common Spring Boot Starters
```xml
<!-- Web applications -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<!-- Database access -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<!-- Security -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>

<!-- Testing -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <scope>test</scope>
</dependency>
```

### Database Drivers
```xml
<!-- H2 (in-memory) -->
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>
</dependency>

<!-- MySQL -->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <scope>runtime</scope>
</dependency>

<!-- PostgreSQL -->
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <scope>runtime</scope>
</dependency>
```

## 📋 Useful Commands Cheat Sheet

### Maven Commands
```bash
mvn clean                    # Clean project
mvn compile                  # Compile source code
mvn test                     # Run tests
mvn package                  # Create JAR file
mvn spring-boot:run          # Run Spring Boot app
mvn dependency:tree          # Show dependencies
```

### Git Commands (for version control)
```bash
git init                     # Initialize repository
git add .                    # Stage all changes
git commit -m "message"      # Commit changes
git push origin main         # Push to remote
git pull origin main         # Pull from remote
git status                   # Check status
```

### Java Commands
```bash
java --version               # Check Java version
javac ClassName.java         # Compile Java file
java ClassName               # Run Java program
java -jar app.jar            # Run JAR file
```

## 🚀 Quick Setup Script

Create a file `setup.sh` for quick environment setup:

```bash
#!/bin/bash
echo "Setting up Java Backend Development Environment..."

# Create project structure
mkdir -p my-java-project/src/main/java/com/example
mkdir -p my-java-project/src/main/resources
mkdir -p my-java-project/src/test/java

# Create basic pom.xml
cat > my-java-project/pom.xml << EOF
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 
         http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.example</groupId>
    <artifactId>my-project</artifactId>
    <version>1.0.0</version>
    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
    </properties>
</project>
EOF

echo "✅ Project structure created!"
echo "📁 Navigate to: cd my-java-project"
echo "🚀 Start coding!"
```

---

**🎯 With these tools and resources, you're ready to build amazing Java backend applications!**