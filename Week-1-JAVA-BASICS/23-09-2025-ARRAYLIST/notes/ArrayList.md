## 1. What is an ArrayList?

* A **resizable array** in Java.
* Unlike arrays (fixed size), an `ArrayList` can **grow or shrink dynamically**.
* Stores elements **in order** (insertion order is preserved).
* Allows **duplicates**.
* Works only with **objects** (so we use wrapper classes for primitives).

---

## 2. Declaring an ArrayList

```java
import java.util.ArrayList;

ArrayList<Integer> numbers = new ArrayList<>(); // empty list of Integers
ArrayList<String> names = new ArrayList<>();    // empty list of Strings
```

---

## 3. Common Methods

Here are the most useful ones:

| Method                | Example                             | What it does                 |
| --------------------- | ----------------------------------- | ---------------------------- |
| `add(E e)`            | `list.add(10);`                     | Adds element at end          |
| `add(int index, E e)` | `list.add(1, 20);`                  | Adds at specific position    |
| `get(int index)`      | `list.get(0);`                      | Returns element at index     |
| `set(int index, E e)` | `list.set(0, 100);`                 | Replaces element             |
| `remove(int index)`   | `list.remove(1);`                   | Removes element at index     |
| `remove(Object o)`    | `list.remove(Integer.valueOf(30));` | Removes first matching value |
| `size()`              | `list.size();`                      | Returns number of elements   |
| `contains(Object o)`  | `list.contains(20);`                | Checks if element exists     |
| `isEmpty()`           | `list.isEmpty();`                   | Checks if list is empty      |
| `clear()`             | `list.clear();`                     | Removes all elements         |

---

## 4. Example

```java
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // Adding
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println(fruits); // [Apple, Banana, Mango]

        // Get
        System.out.println(fruits.get(1)); // Banana

        // Set
        fruits.set(1, "Orange");
        System.out.println(fruits); // [Apple, Orange, Mango]

        // Remove by index
        fruits.remove(0);
        System.out.println(fruits); // [Orange, Mango]

        // Remove by value
        fruits.remove("Mango");
        System.out.println(fruits); // [Orange]

        // Size
        System.out.println("Size: " + fruits.size()); // 1
    }
}
```

---

⚡ Key difference from arrays:

* Arrays: `String[] arr = new String[5];` → fixed length.
* ArrayList: `ArrayList<String> list = new ArrayList<>();` → can grow/shrink.

---


# ⚙️ Internal Working of **ArrayList**

At its core, an **ArrayList is backed by a normal Java array**.
But unlike arrays (which are fixed size), the **ArrayList resizes itself automatically** when it runs out of room.

---

## 1. Default Capacity

* When you create an empty `ArrayList`:

  ```java
  ArrayList<Integer> list = new ArrayList<>();
  ```

  internally it creates an array of **capacity = 10** (in most JDK versions).

---

## 2. Adding Elements

* When you call `list.add(…)`, it puts the element into the **backing array** at the next free index.
* The **`size`** variable tracks how many elements are actually in use.

Example:

```java
ArrayList<Integer> list = new ArrayList<>();
list.add(1); // goes to index 0
list.add(2); // goes to index 1
```

Backing array looks like:

```
[1, 2, null, null, null, null, null, null, null, null]
 size = 2, capacity = 10
```

---

## 3. Resizing (Dynamic Growth)

* If the backing array is **full**, ArrayList creates a **new bigger array**, copies old elements, then adds the new one.
* Growth formula (in OpenJDK):

  ```
  newCapacity = oldCapacity + (oldCapacity >> 1)
  ```

  👉 which is about **1.5x the old capacity**.

Example:

* If capacity = 10 and you add the 11th element →
  new capacity = `10 + 10/2 = 15`.

---

## 4. Removing Elements

* When you call `list.remove(index)` →
  all elements **after that index are shifted left** to fill the gap.
* Example:

  ```
  [A, B, C, D, E]
   remove(2) → remove "C"
   result: [A, B, D, E]
  ```
* This means **removing from the end is faster** than removing from the beginning or middle.

---

## 5. Time Complexity

| Operation       | Time Complexity                                                                       |
| --------------- | ------------------------------------------------------------------------------------- |
| `add()` at end  | Amortized **O(1)** (most times it just adds, occasionally O(n) when resizing happens) |
| `get(index)`    | **O(1)** (direct index access)                                                        |
| `set(index, e)` | **O(1)**                                                                              |
| `remove(index)` | **O(n)** (shifts elements)                                                            |
| `contains(e)`   | **O(n)** (linear search)                                                              |

---

## 6. Memory Trade-off

* Since it over-allocates space (capacity ≥ size), there may be some **unused slots**.
* But this makes `add()` efficient most of the time.
* If memory is tight, you can call:

  ```java
  list.trimToSize();
  ```

  to shrink capacity = size.

---

👉 So in short:

* **Fast random access** (like arrays).
* **Slow insert/remove in the middle** (shifting).
* **Resizable** (internally re-allocates and copies).

---
