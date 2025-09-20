## 🔹 1. **Static Initialization (direct values at declaration)**

```java
int[] numbers = {1, 2, 3, 4, 5};
String[] fruits = {"Apple", "Banana", "Cherry"};
```

👉 Java automatically infers the size from the number of elements.

---

## 🔹 2. **Dynamic Initialization (specify size, assign later)**

```java
int[] numbers = new int[5];  // size = 5, all values default to 0
numbers[0] = 10;
numbers[1] = 20;
```

👉 Useful when you know the size but not the values yet.

---

## 🔹 3. **Using `new` with values**

```java
int[] numbers = new int[]{1, 2, 3, 4, 5};
```

👉 Same as static initialization, but explicitly uses `new`.

⚠️ Difference:

```java
int[] a = {1, 2, 3};         // ✅ allowed at declaration
int[] b;
b = new int[]{4, 5, 6};      // ✅ must use "new" if not declaring & initializing at once
```

---

## 🔹 4. **Anonymous Arrays**

Used when passing an array directly without a name.

```java
printArray(new int[]{1, 2, 3, 4});
```

```java
void printArray(int[] arr) {
    for (int num : arr) {
        System.out.println(num);
    }
}
```

---

## 🔹 5. **Using Loops**

```java
int[] squares = new int[5];
for (int i = 0; i < squares.length; i++) {
    squares[i] = i * i;
}
```

---

## 🔹 6. **Using `Arrays.fill()`**

```java
import java.util.Arrays;

int[] numbers = new int[5];
Arrays.fill(numbers, 7);   // all elements become 7 → [7, 7, 7, 7, 7]
```

---

## 🔹 7. **Using `Stream` or `IntStream` (Java 8+)**

```java
import java.util.stream.IntStream;

int[] numbers = IntStream.range(1, 6).toArray();  // [1, 2, 3, 4, 5]
```

---

✅ **Summary**:

* `{}` → quick, static initialization.
* `new int[size]` → dynamic, values default to `0`.
* `new int[]{...}` → when separating declaration and assignment.
* `Arrays.fill()` / loops / streams → for programmatic initialization.

---
