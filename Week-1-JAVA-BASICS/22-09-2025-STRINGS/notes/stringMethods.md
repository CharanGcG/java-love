## 3️⃣ Common Methods in `String`

### 1. `length()`

Returns the number of characters in the string.

```java
String s = "Hello";
System.out.println(s.length()); // 5
```

---

### 2. `charAt(int index)`

Returns the character at the specified index (0-based).

```java
System.out.println(s.charAt(1)); // 'e'
```

**Pitfall:** IndexOutOfBoundsException if index < 0 or >= length.

---

### 3. `substring(beginIndex, endIndex)`

Extracts a portion of the string.

* `beginIndex` is inclusive.
* `endIndex` is exclusive.

```java
String s2 = "HelloWorld";
System.out.println(s2.substring(0, 5)); // "Hello"
System.out.println(s2.substring(5));    // "World" (till end)
```

---

### 4. `equals()` vs `==`

* `equals()` → checks **content** equality.
* `==` → checks **reference** equality.

```java
String a = "hi";
String b = new String("hi");
System.out.println(a.equals(b)); // true
System.out.println(a == b);      // false
```

---

### 5. `equalsIgnoreCase()`

Ignores case when comparing.

```java
String a = "Java";
String b = "java";
System.out.println(a.equalsIgnoreCase(b)); // true
```

---

### 6. `compareTo()`

Compares strings lexicographically:

* Returns `0` if equal
* Positive if first string > second string
* Negative if first string < second string

```java
System.out.println("abc".compareTo("abd")); // -1
System.out.println("abc".compareTo("abc")); // 0
```

---

### 7. `contains()`, `startsWith()`, `endsWith()`

Check presence of substrings.

```java
String text = "Java Programming";

System.out.println(text.contains("Program")); // true
System.out.println(text.startsWith("Java"));  // true
System.out.println(text.endsWith("ing"));     // true
```

---

### 8. `indexOf()`, `lastIndexOf()`

Find the position of a character or substring.

* `indexOf()` → first occurrence
* `lastIndexOf()` → last occurrence

```java
String str = "abracadabra";
System.out.println(str.indexOf('a'));       // 0
System.out.println(str.lastIndexOf('a'));   // 10
System.out.println(str.indexOf("cad"));     // 4
```

---

### 9. `toUpperCase()`, `toLowerCase()`, `trim()`

* Convert case or remove leading/trailing spaces.

```java
String s3 = "  hello World  ";
System.out.println(s3.toUpperCase()); // "  HELLO WORLD  "
System.out.println(s3.toLowerCase()); // "  hello world  "
System.out.println(s3.trim());        // "hello World"
```

---

### 10. `replace()`, `replaceAll()`

* `replace(oldChar/oldStr, newChar/newStr)` → simple replace
* `replaceAll(regex, replacement)` → regex-based replace

```java
String s4 = "banana";
System.out.println(s4.replace('a', 'o'));    // "bonono"
System.out.println(s4.replaceAll("a", "o")); // "bonono"
```

**Regex example:**

```java
String s5 = "abc123def456";
System.out.println(s5.replaceAll("\\d", "*")); // "abc***def***"
```

---

### 11. `split()`, `join()`

* `split(regex)` → splits string into array based on delimiter.
* `join(delimiter, elements...)` → joins array/collection into string.

```java
String csv = "apple,banana,orange";
String[] fruits = csv.split(",");
System.out.println(Arrays.toString(fruits)); // [apple, banana, orange]

String joined = String.join(" | ", fruits);
System.out.println(joined); // "apple | banana | orange"
```

---

### ✅ Quick tips

* **`substring()`** creates a new string (immutability).
* **`replace()`** vs **`replaceAll()`**: use `replaceAll` for regex.
* **`split()`** returns a **String\[]**, useful for parsing input.
* **Always use `.equals()` for content comparison** — never `==` unless you intentionally want reference check.

---
