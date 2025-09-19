# 🌊 Two Types of Type Conversion in Java

## 1. **Widening Conversion** (a.k.a. Implicit Casting / Type Promotion)

* **Small cup → bigger cup** (no data loss).
* Done automatically by Java.
* Example:

  ```java
  int x = 100;
  long y = x;   // int → long (automatic)
  double z = y; // long → double (automatic)
  ```
* **Order of promotion:**

  ```
  byte → short → int → long → float → double
  ```

✔ Safe.
✔ No explicit cast required.
✔ No data loss (except sometimes with float/double due to precision).

---

## 2. **Narrowing Conversion** (a.k.a. Explicit Casting / Type Demotion)

* **Big cup → small cup** (might spill data).
* Must be done manually with a cast.
* Example:

  ```java
  double pi = 3.14159;
  int i = (int) pi; // i = 3 (fraction lost)
  ```

⚠ Needs explicit cast.
⚠ Data loss or overflow can happen.

---

# 🎯 Special Cases to Remember

### 🔹 `byte`, `short`, and `char` promotion

* In expressions, they **promote to int** automatically.
* Example:

  ```java
  byte a = 10, b = 20;
  byte c = (byte) (a + b); // (a+b) becomes int, must cast back
  ```

### 🔹 Mixing types

```java
int a = 5;
double b = 2.5;
double result = a + b; // int promoted to double → result = 7.5
```

### 🔹 Overflow example

```java
int big = 130;
byte small = (byte) big; // -126 (overflow due to range)
```

---

# 🧘 Guru’s Mantra: Rules of Type Conversion

1. **Automatic if widening, manual if narrowing.**
2. **Default type for integer literals → int.**

   * Example: `100` is `int`. For `long` → `100L`.
3. **Default type for decimal literals → double.**

   * Example: `3.14` is `double`. For `float` → `3.14f`.
4. **During operations, smaller types promote to int** (even byte/short/char).
5. **boolean never converts** to/from numbers.

---
