## 📌 What is `java.util.Arrays`?

* `Arrays` is a **utility class** in the `java.util` package.
* It provides **static methods** (you don’t create an object of `Arrays`) to perform common operations on arrays.
* Without it, we’d need to write loops for everything like sorting, comparing, copying, etc.
* It works for **all array types**: `int[]`, `char[]`, `double[]`, `Object[]`, etc.

👉 You use it by **importing**:

```java
import java.util.Arrays;
```

---

## 📌 Why is `Arrays` important?

1. Java arrays themselves are just **containers of fixed size**. They don’t have built-in methods (unlike ArrayList).
2. To make arrays easier to use, Java provides this helper class.
3. Methods inside `Arrays` are **well-optimized** (faster than writing your own loops).

---

## 📌 Categories of Methods in `Arrays`

Here’s a breakdown of what `java.util.Arrays` offers:

### 🔹 1. **Printing**

* `toString(array)` → nicely prints array elements instead of memory address.
* `deepToString(array)` → for nested arrays (2D/3D arrays).

Example:

```java
int[][] arr = {{1, 2}, {3, 4}};
System.out.println(Arrays.toString(arr));     // [[I@6d06d69c, [I@7852e922] (ugly)
System.out.println(Arrays.deepToString(arr)); // [[1, 2], [3, 4]]
```

---

### 🔹 2. **Sorting**

* `sort(array)` → sorts array in ascending order.
* `sort(array, fromIndex, toIndex)` → sorts only a portion.
* For objects, you can pass a **Comparator**.

Example:

```java
String[] names = {"Zoe", "Alex", "John"};
Arrays.sort(names);
System.out.println(Arrays.toString(names)); // [Alex, John, Zoe]
```

---

### 🔹 3. **Searching**

* `binarySearch(array, key)` → searches for a value in a sorted array.
* If found → returns index.
* If not found → returns **negative value** (insertion point -1).

Example:

```java
int[] nums = {10, 20, 30, 40};
System.out.println(Arrays.binarySearch(nums, 30)); // 2
System.out.println(Arrays.binarySearch(nums, 25)); // -3
```

---

### 🔹 4. **Filling**

* `fill(array, value)` → fills entire array.
* `fill(array, fromIndex, toIndex, value)` → fills part of array.

Example:

```java
int[] arr = new int[5];
Arrays.fill(arr, 99);
System.out.println(Arrays.toString(arr)); // [99, 99, 99, 99, 99]
```

---

### 🔹 5. **Copying**

* `copyOf(original, newLength)` → new array with specified length.
* `copyOfRange(original, from, to)` → copy part of an array.

Example:

```java
int[] nums = {1, 2, 3, 4};
int[] copy = Arrays.copyOf(nums, 6);
System.out.println(Arrays.toString(copy)); // [1, 2, 3, 4, 0, 0]
```

---

### 🔹 6. **Comparing**

* `equals(arr1, arr2)` → checks if arrays have same length and elements.
* `deepEquals(arr1, arr2)` → checks nested arrays.

Example:

```java
int[] a = {1, 2, 3};
int[] b = {1, 2, 3};
System.out.println(Arrays.equals(a, b)); // true
```

---

### 🔹 7. **Hashing**

* `hashCode(array)` → returns hash code of array (useful in collections).
* `deepHashCode(array)` → for nested arrays.

---

### 🔹 8. **Streaming**

* `stream(array)` → converts array to a Stream (for modern Java functional programming).
* Works well with lambdas for sum, average, filter, etc.

Example:

```java
int[] nums = {1, 2, 3, 4, 5};
int sum = Arrays.stream(nums).sum();
System.out.println(sum); // 15
```

---

## 📌 Special Notes

* Methods are **overloaded** for all primitive types and `Object[]`.
* Many methods (like `sort`) use efficient algorithms internally (e.g., Dual-Pivot Quicksort for primitives).
* `Arrays` is often used with **Collections** for converting between arrays and lists (`Arrays.asList()`).

---

✅ In short:
`java.util.Arrays` = Toolbox for array operations (printing, sorting, searching, comparing, copying, filling, streaming).

---
