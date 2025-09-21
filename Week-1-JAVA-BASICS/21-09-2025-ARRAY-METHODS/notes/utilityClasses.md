# Utility Class in Java

A **utility class** (also known as a *helper class*) is a class primarily designed to provide a collection of static methods that perform common, reusable functions. These methods operate on data passed as arguments rather than maintaining any internal state.

***

## Key Characteristics

- **Static Methods**  
  Most or all methods in a utility class are declared as `static`, so they can be called directly on the class without creating an instance.

- **Private Constructor**  
  A private constructor prevents instantiation, enforcing the idea that the utility class is not meant to be used as an object.

- **Stateless**  
  Utility classes do not maintain internal state between method calls. All data is passed as method parameters.

- **Common Functionalities**  
  They provide commonly used functionalities such as:
  - String manipulation  
  - Mathematical calculations  
  - Date formatting  
  - File operations  

***

## Example: String Utility Class

```java
public final class StringUtils {

    // Private constructor to prevent instantiation
    private StringUtils() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated.");
    }

    public static boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static String capitalize(String str) {
        if (isEmpty(str)) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}
```

***

## Usage Example

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(StringUtils.isEmpty(""));           // true
        System.out.println(StringUtils.isEmpty("Hello"));      // false
        System.out.println(StringUtils.capitalize("java"));    // Java
    }
}
```

***

## Best Practices

- **Use utility classes when:**
  - You need to group related static helper methods that don’t require object state.
  - The functionality is stateless and procedural, such as common string, math, or date operations.
  - You want to avoid code duplication by centralizing reusable logic.

- **Avoid utility classes when:**
  - Methods require or manipulate instance-specific state.
  - Object-oriented principles like inheritance and polymorphism would provide clearer design.
  - The class starts accumulating unrelated methods, making maintenance difficult.
  - Dependency injection or mocking for testing is required, as static methods can be harder to mock.

***

