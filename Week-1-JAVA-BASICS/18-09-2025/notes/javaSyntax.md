## 📝 Java Syntax Basics

### 1. **A Simple Java Program**

Every Java program starts with a **class** and a **main method** (the entry point).

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

🔑 Breakdown:

* `public class HelloWorld` → Defines a class named `HelloWorld`
* `public static void main(String[] args)` → Starting point of the program
* `System.out.println("Hello, World!");` → Prints text to the console

---

### 2. **Statements and Semicolons**

* Every **statement** in Java ends with a **semicolon (;)**
* Example:

```java
int number = 10;
System.out.println(number);
```

---

### 3. **Case Sensitivity**

* Java is **case-sensitive**.
* `System` ≠ `system`, `Main` ≠ `main`.
* `main` must be written in lowercase for execution.

---

### 4. **Curly Braces `{}`**

* Used to group code (classes, methods, loops).
* Example:

```java
if (true) {
    System.out.println("This is inside braces");
}
```

---

### 5. **Comments**

Used to explain code (ignored by compiler).

```java
// Single-line comment

/*
   Multi-line
   comment
*/
```

---

### 6. **Printing Output**

```java
System.out.println("Hello Java");  // prints with newline
System.out.print("Hello ");        // prints without newline
System.out.print("Java");          
```

➡️ Output:

```
Hello Java
Hello Java
```

---

### ✅ Mini Task

Try writing a program in Java that prints:

1. Your name
2. Your favorite programming language
3. A fun message (like `"Java is my first love!"`)

---
