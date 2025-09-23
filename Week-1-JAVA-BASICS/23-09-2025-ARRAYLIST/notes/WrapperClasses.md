### 1. What are Wrapper Classes?

* In Java, **primitives** (`int`, `char`, `double`, etc.) are not objects.
* But Java is an **object-oriented** language — and many APIs (like Collections) require objects.
* To solve this, Java provides **wrapper classes** in the `java.lang` package.

| Primitive | Wrapper Class |
| --------- | ------------- |
| `byte`    | `Byte`        |
| `short`   | `Short`       |
| `int`     | `Integer`     |
| `long`    | `Long`        |
| `float`   | `Float`       |
| `double`  | `Double`      |
| `char`    | `Character`   |
| `boolean` | `Boolean`     |

**Example:**

```java
int x = 10;
Integer y = Integer.valueOf(x); // wrapping primitive into object
```

---

### 2. Autoboxing & Unboxing

* **Autoboxing** → automatically converting a primitive → wrapper.
* **Unboxing** → automatically converting a wrapper → primitive.

**Example:**

```java
int a = 5;
Integer obj = a;       // autoboxing

Integer obj2 = 100;
int b = obj2;          // unboxing
```

---

### 3. Why use Wrapper Classes?

* Collections (`ArrayList`, `HashMap`, etc.) don’t work with primitives:

  ```java
  ArrayList<int> list = new ArrayList<>(); // ❌ not allowed
  ArrayList<Integer> list = new ArrayList<>(); // ✅ works
  ```
* Useful utility methods:

  ```java
  int num = Integer.parseInt("123");   // convert String to int
  String s = Integer.toString(99);     // convert int to String
  ```

---


# Java Wrapper Classes: Commonly Used Methods

Java’s wrapper classes provide a robust set of methods that allow you to perform conversions, comparisons, and utility operations on primitive types.

***

## Conversion Methods

- **valueOf():**  
  Static method; returns a wrapper object representing the specified primitive value or parsed string.  
  *Example:* `Integer.valueOf(int i)`, `Double.valueOf(String s)`

- **parse...():**  
  Static method; converts string representation to primitive type.  
  *Example:* `Integer.parseInt(String s)`, `Double.parseDouble(String s)`

- **...Value():**  
  Instance method; returns the value of the wrapper object as its corresponding primitive type.  
  *Example:* `intValue()`, `doubleValue()`, `byteValue()`[1][2]

- **toString():**  
  Returns a string representation of the wrapper object's value.

***

## Comparison Methods

- **compareTo():**  
  Compares the wrapper object with another object of the same type.  
  Returns 0 if equal, negative if less than, positive if greater.

- **equals():**  
  Checks if the wrapper object is equal to another specified object.

***

## Utility Methods

### Character Class

- `isDigit(char ch)`: Checks if a character is a digit  
- `isLetter(char ch)`: Checks if a character is a letter  
- `isUpperCase(char ch)`: Checks if a character is uppercase  
- `isLowerCase(char ch)`: Checks if a character is lowercase  
- `toUpperCase(char ch)`: Converts a character to uppercase  
- `toLowerCase(char ch)`: Converts a character to lowercase[4]

### Math Class (used with Double and Float)

- `abs()`: Returns the absolute value  
- `ceil()`: Returns the smallest integer greater than or equal to the argument  
- `floor()`: Returns the largest integer less than or equal to the argument  
- `round()`: Returns the closest long or int value  
- `min()`: Returns the smaller of two arguments  
- `max()`: Returns the larger of two arguments[2]

***

## Example

```java
public class WrapperMethodsExample {
    public static void main(String[] args) {
        // Conversion methods
        String numStr = "123";
        int parsedInt = Integer.parseInt(numStr);
        System.out.println("Parsed int: " + parsedInt);

        Integer wrapperInt = Integer.valueOf(456);
        System.out.println("Wrapper Integer: " + wrapperInt);

        double dblValue = wrapperInt.doubleValue();
        System.out.println("Double value from Integer: " + dblValue);

        // Comparison methods
        Integer int1 = 10;
        Integer int2 = 20;
        System.out.println("Comparison of 10 and 20: " + int1.compareTo(int2)); // Negative value

        // Character utility methods
        char ch = 'A';
        System.out.println("Is 'A' a letter? " + Character.isLetter(ch));
        System.out.println("Uppercase of 'a': " + Character.toUpperCase('a'));
    }
}
```

***
