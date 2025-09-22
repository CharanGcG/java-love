## 🔒 Immutability: why String objects cannot be changed

When you create a `String` in Java, its contents cannot be modified.
Example:

```java
String s = "hello";
s.concat(" world");
System.out.println(s); // still "hello"
```

Even though we called `concat()`, the original `s` wasn’t changed. A **new `String`** (`"hello world"`) was created, but we didn’t store it.

### Why immutability?

1. **Security**

   * Strings are used in sensitive places (passwords, file paths, network addresses, class loading).
   * If they were mutable, malicious code could change values behind the scenes.

2. **Thread-safety**

   * Since `String` objects never change, multiple threads can safely share the same instance without synchronization.

3. **String pool (interning)**

   * If strings could change, the pool would be unsafe.
   * Immutability allows the JVM to safely reuse the same literal `"hello"` across different parts of a program.

4. **Hashing & Performance**

   * Strings are often used as keys in hash-based collections (`HashMap`, `HashSet`).
   * Because contents never change, cached hash codes remain valid, making lookups fast and reliable.

---

## ⚡ Performance impact → why `StringBuilder` and `StringBuffer` exist

Since strings are immutable, **every modification creates a new object**.
This can be costly in loops or heavy concatenation.

### Example of inefficiency:

```java
String result = "";
for (int i = 0; i < 5; i++) {
    result += i; // new String created every time!
}
System.out.println(result); // "01234"
```

Here, Java internally does something like:

* Step 1: `"" + 0` → `"0"` (new object)
* Step 2: `"0" + 1` → `"01"` (new object)
* … and so on.

This creates **many temporary strings** → slow and memory-heavy.

---

### ✅ Solution: `StringBuilder` and `StringBuffer`

Both are **mutable string classes**: they allow you to modify character sequences without creating new objects every time.

#### `StringBuilder`

* Introduced in Java 5.
* Faster because it’s **not synchronized**.
* Use in **single-threaded** programs.

#### `StringBuffer`

* Older (from Java 1.0).
* **Thread-safe** (synchronized methods).
* Slower than `StringBuilder`.
* Use only when multiple threads modify the same string.

---

### Example with `StringBuilder`:

```java
StringBuilder sb = new StringBuilder("hello");
sb.append(" world");
sb.insert(0, "Say ");
sb.delete(4, 5);
System.out.println(sb); // "Say hello world"
```

No new `String` objects are created for each modification → much more efficient.

---

### Rule of Thumb

* Use **`String`** for small, fixed, or read-only text.
* Use **`StringBuilder`** for lots of modifications in single-threaded code.
* Use **`StringBuffer`** for multi-threaded scenarios (rare nowadays; often better to manage synchronization separately).

---

✅ Quick exercise:
Predict the output:

```java
String s = "java";
s.toUpperCase();
System.out.println(s);

StringBuilder sb = new StringBuilder("java");
sb.append(" rocks");
System.out.println(sb);
```

(Answer:

* `"java"` → unchanged, because `toUpperCase()` returns a new string.
* `"java rocks"` → modified directly in the `StringBuilder`.)

---

