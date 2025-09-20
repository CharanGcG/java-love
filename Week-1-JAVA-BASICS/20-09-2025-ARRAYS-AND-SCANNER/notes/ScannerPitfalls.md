## ⚠️ Common Pitfalls with `Scanner`

### 1. Mixing `nextInt()` and `nextLine()`

* `nextInt()` (and similar methods like `nextDouble()`) **does not consume the newline (`\n`) character** after the number.
* If you call `nextLine()` immediately after, it will read the leftover newline instead of waiting for user input.

❌ Wrong usage:

```java
System.out.print("Enter age: ");
int age = input.nextInt();   // reads number, but leaves newline

System.out.print("Enter name: ");
String name = input.nextLine();  // skips input! reads leftover newline
```

✅ Fix: Add an extra `nextLine()` to consume the newline.

```java
int age = input.nextInt();
input.nextLine();  // consume leftover newline

String name = input.nextLine();
```

---

### 2. Not Closing the Scanner

* Forgetting to call `scanner.close()` can cause resource leaks.
* However, **don’t close a Scanner on `System.in`** if you plan to reuse it later — once closed, you can’t reopen it.

---

### 3. Input Type Mismatch

If the input doesn’t match the expected type, you’ll get `InputMismatchException`.

Example:

```java
int num = input.nextInt();   // user types "hello"
```

👉 Program crashes.

✅ Fix: Use `hasNextInt()`, `hasNextDouble()`, etc. to validate before reading.

```java
if (input.hasNextInt()) {
    int num = input.nextInt();
} else {
    System.out.println("Invalid input!");
}
```

---

### 4. Forgetting That `next()` Reads Only One Token

* `next()` reads input only until the next **whitespace**.
* To read full sentences with spaces, always use `nextLine()`.

Example:

```java
System.out.print("Enter full name: ");
String name = input.next();     // user types "Alice Johnson"
System.out.println(name);       // Output: "Alice" (only first word)
```

---

✅ **Summary of Pitfalls**:

* Always handle **newline issues** when mixing `nextInt()` and `nextLine()`.
* Validate input with `hasNextXxx()`.
* Use `nextLine()` for multi-word strings.
* Close the scanner properly.

---