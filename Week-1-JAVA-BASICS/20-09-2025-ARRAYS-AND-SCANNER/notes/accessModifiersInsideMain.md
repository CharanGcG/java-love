### 🔹 The problem

You wrote:

```java
public int[] numbers;
```

**inside the `main` method**.

But in Java:

* **Local variables** (declared inside methods) **cannot** have access modifiers (`public`, `private`, `protected`).
* Only **class-level members (fields)** can have access modifiers.

That’s why the compiler complains:

> `Illegal modifier for parameter numbers; only final is permitted`

---

### 🔹 Correct versions

If you want an array **inside `main`** (local variable):

```java
public class ArrayDeclaration {
    public static void main(String[] args) {
        int[] numbers;              // ✅ no access modifier here
        numbers = new int[5];       // allocate memory
    }
}
```

If you want an array as a **class-level field**:

```java
public class ArrayDeclaration {
    public int[] numbers;  // ✅ allowed here (field in the class)

    public static void main(String[] args) {
        ArrayDeclaration obj = new ArrayDeclaration();
        obj.numbers = new int[5];
    }
}
```

---

✅ **Rule of thumb**:

* Inside a class → fields can have `public`, `private`, `protected`, or none.
* Inside a method → **no access modifiers**, only `final` is allowed for local variables/parameters.

---
