```java
Arrays.stream(nums).max().getAsInt();
```

we need this extra **`.getAsInt()`**.

---

## 📌 Why `getAsInt()`?

1. **Stream operations like `max()`, `min()`, `average()` return "optional" values.**

   * Example: `.max()` returns an **`OptionalInt`** (not a plain `int`).
   * Example: `.average()` returns an **`OptionalDouble`**.

   Reason: What if the array is **empty**?

   * No max, no min, no average exists!
   * Instead of throwing errors immediately, Java wraps the result in an **Optional**.

---

## 📌 What is `OptionalInt`?

Think of it as a *container* that may or may not hold a value.

* If the array has elements → `OptionalInt` holds the max/min.
* If the array is empty → `OptionalInt` is empty.

---

## 📌 Why `getAsInt()`?

* To **unwrap** the value from the container.
* Example:

  ```java
  int max = Arrays.stream(nums).max().getAsInt();
  ```

  Here `.max()` gives `OptionalInt`, and `.getAsInt()` extracts the `int`.

---

## 📌 Safer Alternative

Instead of calling `.getAsInt()` directly (which throws exception if array is empty), you can use:

```java
OptionalInt optionalMax = Arrays.stream(nums).max();

if (optionalMax.isPresent()) {
    System.out.println("Max = " + optionalMax.getAsInt());
} else {
    System.out.println("Array is empty, no max value");
}
```

Or provide a **default** value:

```java
int max = Arrays.stream(nums).max().orElse(-1);
```

---

✅ So:

* `.max()` → returns `OptionalInt`.
* `.getAsInt()` → extracts the actual `int` value.
* This design prevents crashes when arrays are empty.

---


Perfect question, Charan 👏 You spotted something subtle:

* For **`sum()`**, we don’t need `.getAsInt()`.
* But for **`max()`, `min()`, `average()`** we do.

Let’s break it down.

---

## 📌 Difference Between `sum()` and `max()/min()/average()`

### 🔹 `sum()`

* Always well-defined, even for an empty array.
* If the array is empty → the sum is `0`.
* So Java designers made:

  ```java
  int sum = Arrays.stream(nums).sum();
  ```

  → directly returns an `int`.

---

### 🔹 `max()` / `min()` / `average()`

* These are **not guaranteed** to exist for an empty array:

  * Empty array → no max
  * Empty array → no min
  * Empty array → no average

* To handle this safely, they return **Optional values**:

  * `max()` → `OptionalInt`
  * `min()` → `OptionalInt`
  * `average()` → `OptionalDouble`

That’s why we need:

```java
Arrays.stream(nums).max().getAsInt();
Arrays.stream(nums).average().getAsDouble();
```

---

## 📌 Summary

* `sum()` → Always valid → returns plain `int`
* `max()` / `min()` / `average()` → Might not exist → return `OptionalXXX`

---

👉 Basically, Java designers wanted **safety** for cases where the result might be undefined, but **convenience** where the result is always valid.

---
