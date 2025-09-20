# 📘 Java `main` Method Variations

In Java, the JVM looks for a very specific entry point:

```java
public static void main(String[] args)
```

Any deviation from this signature causes compilation or runtime errors. Below are experiments with modified `main` methods.

---

## ✅ Valid Main Signature

```java
public static void main(String[] args) {
    System.out.println("Hello, World!");
}
```

* **Compiles:** ✅
* **Runs:** ✅
* **Reason:** This is the exact signature required by JVM.

---

## 1. Missing `public`

```java
static void main(String[] args) {
    System.out.println("Without public");
}
```

* **Compiles:** ✅
* **Runs:** ❌
* **Error:** `main method not found in class ...`
* **Reason:** JVM cannot access it since it’s package-private.

---

## 2. Missing `static`

```java
public void main(String[] args) {
    System.out.println("Without static");
}
```

* **Compiles:** ✅
* **Runs:** ❌
* **Error:** `main method not found in class ...`
* **Reason:** JVM requires `static` so it can call `main` without creating an object.

---

## 3. Missing `main` (different method name)

```java
public static void someMethod(String[] args) {
    System.out.println("Without main - someMethod instead");
}
```

* **Compiles:** ✅
* **Runs:** ❌
* **Error:** `main method not found in class ...`
* **Reason:** JVM specifically looks for `main`, not any other name.

---

## 4. Missing `void` (returning `int`)

```java
public static int main(String[] args) {
    System.out.println("Without void, int instead");
    return 1;
}
```

* **Compiles:** ✅
* **Runs:** ❌
* **Error:** `main method not found in class ...`
* **Reason:** The return type must be `void`. Any other type disqualifies it as a valid entry point.

---

## 5. Completely missing return type

```java
public static main(String[] args) {
    System.out.println("Without void");
}
```

* **Compiles:** ❌
* **Error:** `missing return type`
* **Reason:** Every method (except constructors) must declare a return type.

---

## 6. Changing parameter name

```java
public static void main(String[] arguments) {
    System.out.println("Without String[] args - String[] arguments instead");
}
```

* **Compiles:** ✅
* **Runs:** ✅
* **Reason:** JVM only cares about the type (`String[]`), not the parameter name (`args` vs `arguments`).

---

# ⚡ Summary

* ✅ Works: **correct signature**, parameter name changes.
* ❌ Runtime Error: Missing `public`, missing `static`, wrong return type, wrong method name.
* ❌ Compile Error: Missing return type.

---

