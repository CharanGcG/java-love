Let’s analyze your code:

```java
short a = 10;
short b = 0;
System.out.println(a + b);
```

---

### 🔎 Step 1: Rule of Numeric Promotion

In Java, when you perform arithmetic (`+`, `-`, `*`, `/`), **all operands smaller than `int` (i.e., `byte`, `short`, `char`) are automatically promoted to `int`.**

So:

* `a` is `short`
* `b` is `short`
* In the expression `a + b`, both are **promoted to int** before addition.

---

### 🔎 Step 2: Result Type

That means `a + b` is **evaluated as an `int`**.
So the result is of type **int**, not `short`.

---

### 🔎 Step 3: Output

* Since `10 + 0 = 10`, it prints `10`.
* But the *type of the expression* is `int`.

---

✅ **Answer:**
The data type of `a + b` is **`int`**.

---