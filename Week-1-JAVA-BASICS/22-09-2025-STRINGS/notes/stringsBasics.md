# Strings — Basics

## What is a `String`?

A `String` in Java is an **object** that represents an immutable sequence of characters (text). It’s used everywhere — user input, file I/O, network, keys in maps, class names, etc.
Because it’s immutable, once a `String` object is created its contents cannot change; any “modification” produces a new `String` object.

Quick facts:

* Declared as `public final class String` in `java.lang`.
* Implements `CharSequence`, `Comparable<String>`, `Serializable`.
* Very heavily optimized in the JVM (so treat `String` as a basic building block).

---

## `String` is a class in `java.lang` (not a primitive)

Unlike primitives (`int`, `boolean`, etc.), `String` is a reference type (an object). But since `java.lang` is implicitly imported, `String` feels "built-in" — you can write `String s = "hi";` without imports.

Implications:

* Methods live on the `String` object (e.g., `s.length()`, `s.substring(1)`).
* You compare contents with `s.equals(t)`, not with `==` (unless you explicitly want reference equality).
* Because it’s `final`, you cannot subclass `String`.

---

## String literals vs `new String()`

Two common ways to get a string:

```java
String a = "hello";               // literal
String b = "hello";               // same literal -> usually same object reference
String c = new String("hello");   // creates a NEW String object on the heap
```

Behavior (typical outputs):

```java
System.out.println(a == b);        // true  (both reference the pooled literal)
System.out.println(a == c);        // false (c is a new object)
System.out.println(a.equals(c));   // true  (content is the same)
```

Notes:

* Using `new String(...)` explicitly creates a distinct `String` object (even if the same characters already exist in the pool).
* `equals()` checks character content; `==` checks whether two references point to the exact same object.

---

## The String pool (interning) — concept and why it exists

The **String pool** (also called the intern pool) is a JVM-maintained set of unique `String` instances for string literals and interned strings. The JVM keeps one canonical copy of each distinct literal to save memory and speed up equality checks for literals.

How it behaves:

* Literal strings (`"abc"`) are automatically placed in the pool (at class load time / when the literal is first used).
* You can explicitly intern a `String` object with `intern()` to get the pooled canonical reference.

Example:

```java
String s1 = "hello";              // pooled literal
String s2 = new String("hello");  // new object
String s3 = s2.intern();          // returns pooled "hello"

System.out.println(s1 == s3);     // true
```

Why this matters:

* Memory saving: many identical string literals share one object.
* Fast equality (for interned/literal strings) using `==` — but **only** when you know both references are canonical/pools.
* Because strings are immutable, sharing the same object is safe.

Caveat / details:

* Compile-time constant expressions are folded into a single literal (e.g., `"he" + "llo"` becomes `"hello"` at compile time and ends up in the pool).
* Runtime concatenation (using variables) creates new `String` objects (usually via `StringBuilder`) and those are **not** pooled unless you call `.intern()`.

Example showing compile-time vs runtime concat:

```java
String x = "he" + "llo";   // compile-time constant -> pooled "hello"
String y = "he";
String z = y + "llo";      // runtime concat -> new String object

System.out.println(x == s1); // true
System.out.println(z == s1); // false
```

---

## Useful tips / common pitfalls

* Don’t use `==` to compare contents — use `.equals()` (or `.equalsIgnoreCase()` when appropriate).
* Avoid `new String("...")` unless you have a specific reason — it wastes memory and often confuses newbies.
* If you need many concatenations (loops), use `StringBuilder` to avoid creating lots of temporary `String` objects.
* `intern()` can be useful in memory-sensitive contexts where many identical runtime-created strings exist, but use it carefully (it has JVM-level effects).

---

## Small exercise (predict the output)

```java
String a = "cat";
String b = "c" + "at";
String c = new String("cat");
String d = c.intern();

System.out.println(a == b); // ?
System.out.println(a == c); // ?
System.out.println(a == d); // ?
System.out.println(a.equals(c)); // ?
```

Answers:

* `a == b` → `true` (compile-time folding)
* `a == c` → `false` (c is a new object)
* `a == d` → `true` (d interned to pooled literal)
* `a.equals(c)` → `true` (content equal)

---
