## **7. Advanced Topics**

### 🔹 1. Regex with `matches()` and `replaceAll()`

Strings in Java can use **regular expressions** for powerful text matching and manipulation.

* **`matches(String regex)`** → checks if the entire string matches the regex.

  ```java
  String email = "test@example.com";
  System.out.println(email.matches("\\w+@\\w+\\.com")); 
  // true
  ```

* **`replaceAll(String regex, String replacement)`** → replaces **all substrings** matching a regex.

  ```java
  String text = "a1b2c3";
  System.out.println(text.replaceAll("\\d", "#"));  
  // a#b#c#
  ```

---

### 🔹 2. String Formatting (`String.format()`)

* Similar to `printf` in C.
* Lets you insert variables into formatted strings.

```java
String name = "Charan";
int score = 95;
String msg = String.format("Hello %s, you scored %d%%.", name, score);
System.out.println(msg);
// Hello Charan, you scored 95%.
```

Common format specifiers:

* `%s` → string
* `%d` → integer
* `%f` → floating point
* `%.2f` → floating point with 2 decimal places

---

### 🔹 3. Type Conversions

Converting between `String` and other data types:

* **String → int**

  ```java
  int num = Integer.parseInt("123");
  ```

* **int → String**

  ```java
  String str = String.valueOf(123);
  ```

* **String → double**

  ```java
  double d = Double.parseDouble("3.14");
  ```

* **double → String**

  ```java
  String str = Double.toString(3.14);
  ```

⚠️ If parsing fails (e.g., `"abc"` → `Integer.parseInt`), it throws `NumberFormatException`.

---
