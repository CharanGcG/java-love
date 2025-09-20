### 🔹 What is an Array?

* An **array** is a collection of elements of the **same type**, stored in a **contiguous block of memory**.
* Each element in an array is accessed using an **index** (starting from `0`).

👉 Think of it as a row of lockers, each locker has a number (index) and stores one item (value).

---

### 🔹 Syntax for Declaring an Array

```java
// Declaration
int[] numbers;   // preferred
int numbers[];   // also valid

// Allocation (specifying size)
numbers = new int[5];  // array of size 5
```

Here, `numbers` can store 5 integers (default values = `0`).

---

### 🔹 Initializing an Array

```java
int[] marks = {90, 85, 70, 95, 100};  // declare + initialize

String[] names = new String[3];
names[0] = "Alice";
names[1] = "Bob";
names[2] = "Charlie";
```

---

### 🔹 Accessing Array Elements

```java
System.out.println(marks[0]);  // prints 90
marks[2] = 75;                 // update value at index 2
```

⚠️ If you try to access an index outside the array’s range → **ArrayIndexOutOfBoundsException**.

---

### 🔹 Length of an Array

```java
System.out.println(marks.length);  // prints 5
```

---

### 🔹 Iterating Over Arrays

Using **for loop**:

```java
for (int i = 0; i < marks.length; i++) {
    System.out.println(marks[i]);
}
```

Using **for-each loop**:

```java
for (int mark : marks) {
    System.out.println(mark);
}
```

---

### 🔹 Key Points

1. Arrays in Java are **fixed size** (once created, cannot be resized).
2. Elements are stored in **contiguous memory locations**.
3. Default values:

   * Numeric types → `0`
   * boolean → `false`
   * object references → `null`

---
