# Java Streams – Beginner’s Guide

## 📌 What are Streams?

* A **Stream** in Java is a sequence of elements (like numbers, strings, objects) that you can **process** using operations such as filtering, mapping, and reducing.
* Introduced in **Java 8**, streams make it easier to work with collections (arrays, lists, etc.) in a **functional** style.

👉 Think of it like a **pipeline**:
Data goes in ➝ transformations happen ➝ result comes out.

---

## 📌 Why use Streams?

* **Concise**: Less code compared to loops.
* **Readable**: Operations read like English (filter, sort, collect).
* **Functional style**: Uses lambda expressions.
* **Parallel processing**: Easy to process data in parallel (multi-core CPUs).

---

## 📌 Stream Sources

Streams can be created from:

* **Collections** (`list.stream()`)
* **Arrays** (`Arrays.stream(arr)`)
* **Static methods** (`Stream.of(…)`, `IntStream.range(…)`)

Example:

```java
import java.util.*;
import java.util.stream.*;

public class StreamSources {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.stream().forEach(System.out::println);

        int[] numbers = {1, 2, 3, 4, 5};
        Arrays.stream(numbers).forEach(System.out::println);

        Stream.of("A", "B", "C").forEach(System.out::println);
    }
}
```

---

## 📌 Types of Stream Operations

### 1. **Intermediate Operations** (return a new stream)

* `filter()` – keep elements that match a condition
* `map()` – transform elements
* `sorted()` – sort elements
* `distinct()` – remove duplicates

Example:

```java
List<String> names = Arrays.asList("Alice", "Bob", "Alex");
names.stream()
     .filter(n -> n.startsWith("A"))
     .map(String::toUpperCase)
     .forEach(System.out::println);
// Output: ALICE, ALEX
```

---

### 2. **Terminal Operations** (produce a result)

* `forEach()` – iterate through elements
* `collect()` – gather results into a list, set, etc.
* `reduce()` – combine elements into a single value
* `count()`, `sum()`, `min()`, `max()`, `average()`

Example:

```java
int[] numbers = {1, 2, 3, 4, 5};

int sum = Arrays.stream(numbers).sum(); // 15
long count = Arrays.stream(numbers).count(); // 5
int max = Arrays.stream(numbers).max().getAsInt(); // 5
```

---

## 📌 Parallel Streams

Easy way to use **multiple threads**:

```java
List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
nums.parallelStream().forEach(System.out::println);
```

---

## 📌 Key Notes

1. Streams **do not store data** – they work on the source (like a list).
2. Operations are **lazy** – nothing happens until a terminal operation is called.
3. A Stream can be **used only once**. After a terminal operation, it’s consumed.
4. Designed for **functional-style programming**.

---

## 📌 Example: Full Pipeline

```java
List<String> names = Arrays.asList("Zoe", "Alex", "John", "Anna");

List<String> result = names.stream()
    .filter(n -> n.startsWith("A"))   // keep names starting with A
    .sorted()                         // sort alphabetically
    .map(String::toUpperCase)         // convert to uppercase
    .toList();                        // collect to list

System.out.println(result); // [ALEX, ANNA]
```

---

✅ Streams = powerful way to handle data processing in Java: concise, functional, and parallel-ready.

---
