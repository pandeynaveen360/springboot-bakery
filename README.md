# 🎂 Spring Boot Bakery

## 📌 Overview

This is a beginner-friendly Spring Boot project that demonstrates **Dependency Injection (DI)**, **Interfaces**, and **Multiple Bean Handling** using a simple real-world example of a Cake Baking system.

The application simulates how a cake is prepared using different types of **Frosting** and **Syrup**.

---

## 🚀 Features

* Uses **Spring Boot**
* Demonstrates **Interface-based design**
* Implements **Dependency Injection**
* Handles **multiple beans using @Qualifier**
* Clean and simple project structure (beginner friendly)

---

## 🧠 Concepts Used

* Interface vs Implementation
* Dependency Injection (DI)
* Inversion of Control (IoC)
* Spring Beans (`@Component`)
* `@Qualifier` for resolving multiple beans

---

## 🏗️ Project Structure

```bash
src/main/java/com/example/demo/bakery
│
├── Frosting.java              # Interface
├── Syrup.java                 # Interface
│
├── ChocolateFrosting.java     # Implementation
├── StrawberryFrosting.java    # Implementation
├── ChocolateSyrup.java        # Implementation
├── StrawberrySyrup.java       # Implementation
│
├── CakeBaker.java             # Main logic (uses DI)
```

---

## ⚙️ How It Works

1. Spring scans all classes with `@Component`
2. Creates objects (Beans)
3. Injects dependencies into `CakeBaker`
4. Uses `@Qualifier` to select specific implementation
5. Executes `bakeCake()` method

---

## ▶️ Running the Project

### Step 1: Clone Repository

```bash
git clone https://github.com/pandeynaveen360/springboot-bakery.git
```

### Step 2: Navigate to Project

```bash
cd springboot-bakery
```

### Step 3: Run Application

```bash
mvn spring-boot:run
```

---

## 📦 Build JAR File

```bash
mvn clean package
```

Run JAR:

```bash
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

---

## ✅ Output

```bash
Cake baked with Chocolate Frosting and Chocolate Syrup
```

---

## 💡 Why This Project?

This project is created to understand core Spring concepts in a simple and practical way using real-world analogies.

---

## 🙌 Author

**Naveen Pandey**
B.Tech CSE (AI & ML)
📍 Greater Noida, India

---

## ⭐ If you like this project

Give it a ⭐ on GitHub!
