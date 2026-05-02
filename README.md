# Employee Management System (Java) 🚀

This is a simple **Java-based Employee Management System** built to understand:

* Object-Oriented Programming (OOP)
* Functional Programming (Streams & Lambda)
* Layered Architecture (Repository → Service → Main)

---

## 📂 Project Structure

```bash
com/
 ├── Employee.java
 ├── EmployeeRepository.java
 ├── EmployeeService.java
 ├── EmployeeNotFounException.java
 └── Main.java
```

---

## 🧩 Classes Explained (Simple Way)

---

### 👤 1. Employee (Model Class)

Represents employee data.

#### Fields:

* id
* name
* email
* department
* salary
* age

✔ Includes:

* Getters & Setters
* Constructor
* `toString()` → print object
* `equals()` & `hashCode()` → object comparison

---

### 🗂️ 2. EmployeeRepository (Data Layer)

Acts like a **database (in-memory list)**.

```java
List<Employee> employeeList = new ArrayList<>();
```

✔ Responsibilities:

* Store employee data
* Return all employees
* Find employee by ID

---

### ⚙️ 3. EmployeeService (Business Logic)

Handles all **operations using Stream API**.

---

### 🔍 Methods Explained

#### ✅ Get All Employees

```java
public List<Employee> getEmployee()
```

---

#### 💰 Filter by Salary

```java
.filter(employee -> employee.getSalary() > minSalary)
```

✔ Real-time use:

* Find high-paid employees

---

#### 📄 Display Employee Details

```java
.forEach(employee -> System.out.println(...))
```

✔ Prints selected fields

---

#### 📧 Get All Emails

```java
.map(Employee::getEmail)
```

✔ Extracts only email field

---

#### 🔎 Get Employee by ID

```java
Optional<Employee> optional = repository.getEmployeeById(id);
```

✔ Uses **Optional** to avoid null issues

✔ Throws custom exception if not found

---

### ❌ 4. EmployeeNotFounException

Custom exception when employee not found.

```java
throw new EmployeeNotFounException("Employee not found with id: " + id);
```

---

### ▶️ 5. Main Class (Execution)

This is where everything runs.

---

## ▶️ How It Works (Flow)

```text
Main → Service → Repository → Data
```

---

## 🧪 Features Implemented

### ✔ 1. Get All Employees

```java
employeeService.getEmployee();
```

---

### ✔ 2. Filter Employees by Salary

```java
employeeService.filterBySalary(50000);
```

---

### ✔ 3. Display Employee Details

```java
employeeService.displayEmployeeDetails();
```

---

### ✔ 4. Get All Emails

```java
employeeService.getAllEmployeeEmails();
```

---

### ✔ 5. Find Employee by ID

```java
employeeService.getEmployeeById(3);
```

---

## 🎯 Sample Output

```text
Employee [id=3, name=Amit, email=amit@gmail.com, department=Finance, salary=60000.0, age=30]

Id : 1
Name : Ravi
Salary : 50000.0

ravi@gmail.com
priya@gmail.com
...

======Employee id by filter=======
Employee [id=3, name=Amit, ...]
```

---

## 💡 Key Concepts Used

* ✅ OOP (Encapsulation, Classes)
* ✅ Stream API
* ✅ Lambda Expressions
* ✅ Optional Class
* ✅ Custom Exception Handling

---

## 🔥 Real-Time Use Case

This project simulates:

* Employee database system
* HR management filtering
* Salary-based reports
* Email extraction for notifications

---

## 🚀 Future Improvements

You can extend this project to:

* Add **CRUD operations (Add, Update, Delete)**
* Connect with **Database (MySQL)**
* Convert into **Spring Boot REST API**
* Add **REST endpoints (Postman testing)**

---

## 🙌 Conclusion

This project is perfect for:

* Beginners learning Java
* Interview preparation
* Understanding real-world backend structure

---

## 👨‍💻 Author

Built for practice and learning Java fundamentals.
