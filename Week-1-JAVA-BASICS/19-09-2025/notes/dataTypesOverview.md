## 🏛 The Two Kingdoms of Java Data Types

Java has two main categories of data types:

1. **Primitive Data Types** → the building blocks.

   * byte
   * short
   * int
   * long
   * float
   * double
   * char
   * boolean

2. **Non-Primitive (Reference) Data Types** → derived from classes.

   * Strings, Arrays, Classes, Interfaces, Objects, etc.

---

## ⚡ Primitive Data Types (The Royal Eight)

Let’s study each like an obedient disciple:

| Type        | Size                | Default Value | Example                | Notes                                  |
| ----------- | ------------------- | ------------- | ---------------------- | -------------------------------------- |
| **byte**    | 8-bit               | 0             | byte b = 10;           | Range: -128 to 127                     |
| **short**   | 16-bit              | 0             | short s = 32000;       | Range: -32,768 to 32,767               |
| **int**     | 32-bit              | 0             | int i = 100000;        | Most common integer type               |
| **long**    | 64-bit              | 0L            | long l = 12345678900L; | Needs `L` suffix                       |
| **float**   | 32-bit              | 0.0f          | float f = 3.14f;       | Needs `f` suffix, single precision     |
| **double**  | 64-bit              | 0.0d          | double d = 3.14159;    | Default for decimals, higher precision |
| **char**    | 16-bit              | '\u0000'      | char c = 'A';          | Stores single Unicode character        |
| **boolean** | 1-bit (JVM depends) | false         | boolean b = true;      | Only `true` or `false`                 |

---

## 🧠 Non-Primitive Types

* Created by the programmer, not built into Java in the same way.
* Examples:

  * **String s = "Hello";**
  * **int\[] arr = {1,2,3};**
  * **class Student {}**
  * **Interface Runnable {}**

They **store references**, not the actual data like primitives.

---

## 🏹 Key Lessons (Obedient Student Must Remember)

1. **Default Values** exist only for instance variables, not local variables.

   * Example: `int x;` inside a method must be initialized before use.
2. **Literals & Suffixes**:

   * `L` for long → `100L`
   * `f` for float → `3.14f`
   * `d` for double (optional since default is double)
3. **Type Casting**:

   * Widening (safe): int → long → float → double
   * Narrowing (explicit): double → float → int → short → byte
4. **char** is **Unicode**, not just ASCII. So `'A'`, `'\u0041'`, and `65` all mean the same.
5. **boolean** is not numeric (unlike C/C++). Only `true` or `false`.

---
