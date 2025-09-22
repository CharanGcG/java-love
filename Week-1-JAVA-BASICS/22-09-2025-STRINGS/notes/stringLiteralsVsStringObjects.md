# String Literals vs String Objects in Java

In Java, both string literals and `String` objects represent sequences of characters, but they differ in how they are **created** and **stored in memory**.

***

## String Literals

- A string literal is a sequence of characters enclosed in double quotes, such as `"hello world"`.
- When a string literal is encountered, Java checks the **String Pool** (a special area within heap memory).
- If a string with the same content already exists in the String Pool, Java **reuses the existing object** and returns its reference.
- If the string is not found, a new String object is created in the String Pool, and its reference is returned.
- This mechanism is called **string interning**, which optimizes memory usage by avoiding duplicate objects.

**Example:**

```java
String s1 = "Java";
String s2 = "Java"; // s1 and s2 refer to the same object in the String Pool
```

***

## String Objects (using `new` keyword)

- A `String` object can be explicitly created using the `new` keyword and the `String` constructor, such as `new String("hello world")`.
- Each time `new String()` is called, a **new object** is created in heap memory, 
  even if the content already exists in the String Pool.
- Thus, two String objects created with `new` that have identical content still refer to different objects.

**Example:**

```java
String obj1 = new String("Java");
String obj2 = new String("Java"); // obj1 and obj2 refer to different objects in the heap
```

***

## String Pool:

![String pool image](/Week-1-JAVA-BASICS/22-09-2025-STRINGS/outputs/images/string%20pool%20explanation.png)

## Key Differences

| Feature             | String Literal                                | String Object (using `new`)        |
|---------------------|-----------------------------------------------|-------------------------------------|
| **Creation**         | Direct assignment with double quotes          | Using `new` keyword and constructor |
| **Memory Location**  | String Pool (within heap memory)              | Heap memory (outside the pool)      |
| **Memory Optimization** | Reuses objects via interning mechanism   | Always creates a new object         |
| **`==` Operator**    | Compares references (may return true if interned) | Compares references (always false for different objects) |
| **`equals()` Method**| Compares content                             | Compares content                    |

***
