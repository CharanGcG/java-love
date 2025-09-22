## 6️⃣ StringBuilder & StringBuffer

We already saw that **Strings are immutable**. Every change creates a **new object**, which is slow in loops or heavy concatenations.
To solve this, Java provides **mutable string classes**:

---

### 🔹 StringBuilder

* Introduced in Java 5.
* **Not synchronized** → faster.
* Best for **single-threaded** applications.

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
sb.insert(0, "Say ");
sb.delete(4, 5);
sb.reverse();
System.out.println(sb); // "dlroW olleS ay"
```

**Common methods:**

* `append(x)` → add at the end
* `insert(index, x)` → insert at given index
* `delete(start, end)` → delete substring
* `reverse()` → reverse string
* `replace(start, end, str)` → replace part of string
* `toString()` → convert back to `String`

---

### 🔹 StringBuffer

* Exists since Java 1.0.
* **Synchronized** → thread-safe.
* Slower than `StringBuilder`.
* Use only when **multiple threads modify the same string**.

Example:

```java
StringBuffer sbf = new StringBuffer("Hello");
sbf.append(" Thread-Safe");
System.out.println(sbf); // "Hello Thread-Safe"
```

---

### 🔹 Performance Example

```java
// Using String (inefficient in loop)
String s = "";
for (int i = 0; i < 5; i++) {
    s += i; // creates new String each time
}
System.out.println(s); // "01234"

// Using StringBuilder (efficient)
StringBuilder sb2 = new StringBuilder();
for (int i = 0; i < 5; i++) {
    sb2.append(i);
}
System.out.println(sb2); // "01234"
```

👉 `StringBuilder` avoids creating extra objects → more efficient in loops.

---

### 🔹 String vs StringBuilder vs StringBuffer — Quick Comparison

| Feature         | String             | StringBuilder             | StringBuffer                  |
| --------------- | ------------------ | ------------------------- | ----------------------------- |
| **Mutability**  | Immutable          | Mutable                   | Mutable                       |
| **Thread-safe** | Yes (immutability) | No (faster)               | Yes (slower)                  |
| **Performance** | Slow in loops      | Fast (single-thread)      | Medium (multi-thread)         |
| **Use Case**    | Fixed text         | Heavy changes in 1 thread | Heavy changes in multi-thread |

---

✅ Quick exercise: predict outputs

```java
StringBuilder sb = new StringBuilder("abc");
sb.append("def");
System.out.println(sb); // ?

StringBuffer sbf = new StringBuffer("123");
sbf.insert(1, "X");
System.out.println(sbf); // ?
```

Answers:

* `"abcdef"`
* `"1X23"`

---
