Employee Database CRUD App
A complete Java + JDBC + MySQL project that demonstrates CRUD operations (Create, Read, Update, Delete) on an employees table.
This project is designed as a step‑by‑step.

📌 Project Tasks (Mini Guide)
- Set up Database and Table
- Create employee_db database
- Create employees table with fields: id, name, email, department, salary, created_at
- Use JDBC Classes
- Connection → connect to MySQL
- PreparedStatement → execute parameterized queries
- ResultSet → fetch and display results
- Implement CRUD Operations
- Add Employee → Insert new record
- View Employees → Fetch all or by ID
- Update Employee → Modify department/salary
- Delete Employee → Remove record by ID
- Test Flow
- Insert → View → Update → Delete → Verify in console + Workbench

🛠️ Tech Stack
- Java 21
- MySQL 8+
- Maven (dependency management)
- JDBC (database connectivity)
- SLF4J (logging)

📂 Project Structure
src/main/java/com/kunal/employeedbapp/
 ├── App.java                  # Main runner (CRUD demo flow)
 ├── dao/
 │    ├── EmployeeDao.java     # DAO interface
 │    └── EmployeeDaoJdbc.java # JDBC implementation
 ├── model/
 │    └── Employee.java        # Employee entity (POJO)
 └── util/
      └── DbUtil.java          # Database connection utility
src/main/resources/
 └── db.properties             # DB config (URL, user, password)



⚙️ Setup Instructions
1. Database Setup
CREATE DATABASE IF NOT EXISTS employee_db;
USE employee_db;

CREATE TABLE IF NOT EXISTS employees (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  email VARCHAR(120) UNIQUE NOT NULL,
  department VARCHAR(60) NOT NULL,
  salary DECIMAL(12,2) NOT NULL,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


2. Create User (optional)
CREATE USER IF NOT EXISTS 'emp_user'@'localhost' IDENTIFIED BY 'root';
GRANT ALL PRIVILEGES ON employee_db.* TO 'emp_user'@'localhost';
FLUSH PRIVILEGES;


3. Configure db.properties
db.url=jdbc:mysql://localhost:3306/employee_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC
db.user=emp_user
db.password=root


4. Run the Project
- Open in IntelliJ IDEA
- Run App.java
- Console will show CRUD flow

📊 Sample Console Output
Starting EmployeeDBApp...
Inserted: Employee{id=1, name='Test User', email='test.user@example.com', dept='IT', salary=55000.00}
All employees: [Employee{id=3, name='Test User', email='test.user@example.com', dept='IT', salary=55000.00}]
Find by id: Employee{id=3, name='Test User', email='test.user@example.com', dept='IT', salary=55000.00}
Updated? true -> Employee{id=3, name='Test User', email='test.user@example.com', dept='Engineering', salary=60000.00}
Deleted? true
Remaining employees: []



📌 Learning Outcomes
- ✅ How to connect Java with MySQL using JDBC
- ✅ How to use Connection, PreparedStatement, ResultSet
- ✅ How to implement CRUD operations with DAO pattern
- ✅ How to externalize DB config with db.properties
- ✅ How to test and verify data in both console and Workbench
Auther
Kunal
