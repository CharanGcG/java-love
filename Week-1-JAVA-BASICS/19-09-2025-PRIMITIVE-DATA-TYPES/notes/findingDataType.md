## 1. **At Compile-Time (Static Checking)**

You can always see the type by looking at the declaration:

```java
int x = 10;       // type is int
double y = 3.14;  // type is double
```

The compiler enforces it strictly — you can’t suddenly make `x` a String.

---

## 2. **Using `getClass()` (For Non-Primitives)**

For **objects and reference types**:

```java
String s = "Hello";
System.out.println(s.getClass().getName());  // prints: java.lang.String
```

For arrays:

```java
int[] arr = {1,2,3};
System.out.println(arr.getClass().getName()); // prints: [I (special code for int array)
```

---

## 3. **Using `instanceof` (Type Checking at Runtime)**

```java
Object obj = "Java";
if (obj instanceof String) {
    System.out.println("It's a String!");
}
```

This is like asking Java: "Are you of this type?"

---

## 4. **For Primitives**

Primitives (`int`, `double`, `char`, etc.) do not have `.getClass()` (since they’re not objects).
But you can wrap them with their **Wrapper classes**:

```java
int num = 42;
System.out.println(((Object)num).getClass().getName()); // prints: java.lang.Integer
```

Here Java auto-boxes `int → Integer`.

---

## 5. **Using Reflection (Advanced, for Debugging)**

If you’re writing a method that takes `Object`:

```java
public static void printType(Object obj) {
    System.out.println(obj.getClass().getName());
}

printType(123);         // java.lang.Integer
printType("Hello");     // java.lang.String
printType(3.14f);       // java.lang.Float
```

---

⚠️ Note:

* For **primitives**, the type is only known at **compile-time**, not runtime (unless boxed).
* For **reference types**, `.getClass()` and `instanceof` are the obedient tools.

