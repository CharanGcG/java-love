## 5️⃣ String Concatenation

Concatenation = joining strings together. In Java, there are multiple ways:

---

### 1. Using `+` Operator

The simplest and most common way:

```java
String a = "Hello";
String b = "World";
String c = a + " " + b;
System.out.println(c); // "Hello World"
```

👉 Behind the scenes:

* At **compile time**, the compiler optimizes string literals.

  ```java
  String s = "Hello" + "World"; 
  // becomes "HelloWorld" directly in the pool
  ```
* At **runtime** (when variables are used), Java uses a `StringBuilder` internally:

  ```java
  String s = a + b;
  // roughly becomes new StringBuilder().append(a).append(b).toString();
  ```

---

### 2. Using `concat()`

Another method available on `String`.

```java
String a = "Hello";
String b = "World";
System.out.println(a.concat(" ").concat(b)); // "Hello World"
```

⚠️ Notes:

* Works only with strings (can’t concatenate with numbers directly).
* Throws `NullPointerException` if the argument is `null`.

---

### 3. Using `StringBuilder` / `StringBuffer`

Best for **loops** or heavy concatenation.

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" ").append("World");
System.out.println(sb.toString()); // "Hello World"
```

* Much faster than repeated `+` inside loops.
* `StringBuffer` is the thread-safe version (slower).

---

### 4. Compile-time Optimization Example

```java
String x = "foo" + "bar";  // "foobar" (done at compile-time, 1 object in pool)
String y = "foo";
String z = y + "bar";      // new String created at runtime
System.out.println(x == z); // false
```

---

### 5. Concatenation with other types

Java automatically converts non-strings to strings when using `+`.

```java
int age = 25;
String s = "Age: " + age;  
System.out.println(s); // "Age: 25"
```

⚠️ This is why `"2" + 2 + 2` → `"222"`, but `2 + 2 + "2"` → `"42"`.
Evaluation is left to right.

---

### ✅ Quick tips

* Use `+` for readability in **small cases**.
* Use `StringBuilder` in **loops** or performance-sensitive code.
* Remember that `concat()` is rarely used in practice — `+` is more common.

---

### Mini Exercise

What’s the output?

```java
String a = "hi";
String b = "there";
String c = a + b;
String d = "hi" + "there";

System.out.println(c == d); // ?
System.out.println(c.equals(d)); // ?
```

Answer:

* `c == d` → false (c created at runtime, d is compile-time pooled).
* `c.equals(d)` → true (content matches).

---
