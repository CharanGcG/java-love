# 📘 Strings in Java — Complete Guide

---

## **1. Basics**

* **What is a String?**

  * A sequence of characters.
  * In Java, `String` is a **class in `java.lang`**, not a primitive.
  * Example:

    ```java
    String s = "Hello";
    ```

* **String literals vs. `new String()`**

  ```java
  String s1 = "Hello";              // uses String pool
  String s2 = new String("Hello");  // creates new object in heap
  ```

* **String pool (interning)**

  * All string literals are stored in the **String pool**.
  * If two literals have the same value, they point to the same object in memory.

  ```java
  String a = "Java";
  String b = "Java";
  System.out.println(a == b); // true
  ```

---

## **2. Properties of Strings**

* **Immutability**

  * Once created, a `String` cannot be modified.
  * Operations like concatenation create a **new object**.

  ```java
  String x = "Hello";
  x.concat(" World");
  System.out.println(x); // "Hello"
  ```

* **Why `StringBuilder` and `StringBuffer`?**

  * To avoid performance issues with repeated modifications.
  * `StringBuilder` → mutable, faster, not thread-safe.
  * `StringBuffer` → mutable, slower, thread-safe.

---

## **3. Common Methods in `String`**

* `length()` → returns number of characters
* `charAt(index)` → returns character at position
* `substring(begin, end)` → extracts part of the string
* `equals()` vs `==` → content vs reference
* `equalsIgnoreCase()` → compares ignoring case
* `compareTo()` → lexicographical comparison
* `contains()`, `startsWith()`, `endsWith()`
* `indexOf()`, `lastIndexOf()`
* `toUpperCase()`, `toLowerCase()`, `trim()`
* `replace(old, new)`, `replaceAll(regex, new)`
* `split(regex)`, `String.join(delimiter, ...)`

---

## **4. String Comparison**

* `==` → checks references (memory addresses).
* `.equals()` → checks actual content.
* `.equalsIgnoreCase()` → content check ignoring case.

```java
String a = "Java";
String b = "Java";
String c = new String("Java");

System.out.println(a == b);       // true (both in pool)
System.out.println(a == c);       // false (new object)
System.out.println(a.equals(c));  // true
```

---

## **5. String Concatenation**

* Using `+` operator:

  ```java
  String s = "Hello" + " World";
  ```
* Using `concat()`:

  ```java
  String s = "Hello".concat(" World");
  ```
* Compiler optimizes `+` at compile-time for literals.

---

## **6. StringBuilder & StringBuffer**

* **Why?** → Because `String` is immutable.
* **StringBuilder**: fast, not thread-safe.
* **StringBuffer**: slower, thread-safe.

**Common methods**:

* `append()`
* `insert()`
* `delete()`
* `reverse()`

Example:

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb); // Hello World
```

---

## **7. Advanced Topics**

### Regex with `matches()` and `replaceAll()`

```java
String email = "test@example.com";
System.out.println(email.matches("\\w+@\\w+\\.com")); // true

String text = "a1b2c3";
System.out.println(text.replaceAll("\\d", "#")); // a#b#c#
```

### String Formatting

```java
String name = "Charan";
int score = 95;
String msg = String.format("Hello %s, you scored %d%%.", name, score);
System.out.println(msg);
```

### Type Conversions

* `String → int` → `Integer.parseInt("123")`
* `int → String` → `String.valueOf(123)`
* `String → double` → `Double.parseDouble("3.14")`
* `double → String` → `Double.toString(3.14)`

⚠️ Invalid parsing throws `NumberFormatException`.

---

# ✅ Summary

* `String` is a class, immutable, stored in **String pool** when created as literals.
* Use `.equals()` for comparison, not `==`.
* For frequent modifications, use `StringBuilder` or `StringBuffer`.
* Strings come with many useful methods for searching, modifying, and formatting.
* Regex and formatting make Strings very powerful in Java.

---
