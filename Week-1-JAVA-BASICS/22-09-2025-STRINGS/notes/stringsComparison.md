## 4️⃣ String Comparison in Java

There are **three main ways** to compare strings:

* `==`
* `.equals()` / `.equalsIgnoreCase()`
* `.compareTo()`

---

### 1. `==` → **Reference Equality**

* Checks if **both references point to the same object** in memory.
* Does **not** care about actual characters.

```java
String a = "java";
String b = "java";
String c = new String("java");

System.out.println(a == b); // true (same pooled literal)
System.out.println(a == c); // false (c is a new object)
```

---

### 2. `.equals()` → **Content Equality**

* Checks if the sequence of characters is the same.
* Ignores whether they are different objects.

```java
System.out.println(a.equals(b)); // true
System.out.println(a.equals(c)); // true
```

---

### 3. `.equalsIgnoreCase()` → **Case-Insensitive Equality**

* Same as `.equals()`, but ignores case differences.

```java
String s1 = "Hello";
String s2 = "hello";

System.out.println(s1.equals(s2));          // false
System.out.println(s1.equalsIgnoreCase(s2)); // true
```

---

### 4. `.compareTo()` → **Lexicographic Comparison**

* Compares based on Unicode values of characters.
* Returns:

  * `0` if equal
  * `< 0` if calling string is “less than” the other
  * `> 0` if greater

```java
System.out.println("apple".compareTo("banana")); // negative (-1)
System.out.println("banana".compareTo("apple")); // positive (1)
System.out.println("apple".compareTo("apple"));  // 0
```

⚠️ Case-sensitive:

```java
System.out.println("A".compareTo("a")); // -32
```

(because `'A'` = 65, `'a'` = 97 in Unicode)

---

### ✅ Best Practices

1. Use `==` **only when you care about object identity** (rare; e.g., checking against string literals in pools).
2. Use `.equals()` or `.equalsIgnoreCase()` for **normal content checks**.
3. Use `.compareTo()` when sorting or ordering strings (like in collections).

---

### Small Exercise (predict output)

```java
String x = "Code";
String y = "Code";
String z = new String("Code");

System.out.println(x == y);        // ?
System.out.println(x == z);        // ?
System.out.println(x.equals(z));   // ?
System.out.println(x.compareTo(z));// ?
```

Answer:

* `x == y` → true (same pooled literal)
* `x == z` → false (new object)
* `x.equals(z)` → true (same characters)
* `x.compareTo(z)` → 0 (same content)

---
