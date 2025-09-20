# 📘 Java Scanner Class

The **Scanner class** in Java, found within the `java.util` package, is a utility for parsing **primitive types** and **strings** using regular expressions.
It is commonly used to **read input** from various sources, including:

* The **keyboard** (`System.in`)
* **Files**
* **Strings**

---

## 🔹 Importing the Class

To use the Scanner class, you must import it at the beginning of your program:

```java
import java.util.Scanner;
```

---

## 🔹 Creating a Scanner Object

You can create an instance of the Scanner class by passing an **InputStream** or a **File**:

```java
Scanner scanner = new Scanner(System.in);          // For keyboard input
// Scanner fileScanner = new Scanner(new File("input.txt")); // For file input
```

---

## 🔹 Reading Input

The Scanner class provides multiple methods for reading different data types:

* `nextInt()` → Reads an `int`
* `nextDouble()` → Reads a `double`
* `nextLine()` → Reads an entire line of text (including spaces)
* `next()` → Reads the next token (sequence of characters separated by whitespace by default)
* `nextByte()`, `nextShort()`, `nextLong()`, `nextFloat()`, `nextBoolean()` → Read other primitive types
* `nextBigInteger()`, `nextBigDecimal()` → Read large or high-precision numbers

---

## 🔹 Checking for Next Input

Before reading, you can check if input exists using:

* `hasNext()`
* `hasNextInt()`
* `hasNextLine()`
* `hasNextDouble()`

👉 These prevent errors like **InputMismatchException**.

---

## 🔹 Closing the Scanner

It is crucial to **close the Scanner** when you’re done to release resources:

```java
scanner.close();
```

---

## 🔹 Example Program

```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for keyboard input

        System.out.print("Enter your name: ");
        String name = input.nextLine(); // Read entire line as a string

        System.out.print("Enter your age: ");
        int age = input.nextInt(); // Read an integer

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        input.close(); // Close the scanner
    }
}
```

---

## ✅ Summary

* `Scanner` helps in reading input easily.
* Works with **keyboard, files, and strings**.
* Provides methods for different **data types**.
* Always **close the Scanner** to free resources.

---
