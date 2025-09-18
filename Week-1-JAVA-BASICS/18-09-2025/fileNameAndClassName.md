### ✅ Why file name and class name must match (when the class is `public`)

1. **Rule, not just convenience**

   * In Java, if a class is declared as **`public`**, its name **must match the file name** (case-sensitive).
   * Example:

     ```java
     public class Hello {
         public static void main(String[] args) {
             System.out.println("Hello!");
         }
     }
     ```

     ➡️ Must be saved as `Hello.java`.
     If you save it as `Test.java`, the compiler will throw:

     ```
     error: class Hello is public, should be declared in a file named Hello.java
     ```

2. **Why this rule?**

   * Java uses the file name → class name mapping to **easily locate public classes** during compilation and execution.
   * The JVM looks for the `.class` file matching the class name when you run `java ClassName`.
   * If filenames didn’t match, the compiler/runtime would have to do extra work to find the right entry point.

3. **What if the class is NOT public?**

   * Then the file name doesn’t need to match.
   * Example:

     ```java
     class Test {
         public static void main(String[] args) {
             System.out.println("No public class here!");
         }
     }
     ```

     You can save this as `Anything.java`, compile (`javac Anything.java`), and run (`java Test`).
   * Here, the file name isn’t tied to the class because no class is declared `public`.

---

### 🔑 Key Takeaway

* **Public class → File name must match (strict rule).**
* **Non-public class → File name can be different (but only one main class can be executed).**

So it’s not just for “convenience” — it’s actually part of Java’s **syntax rules** to keep structure and enforce clarity in larger projects where multiple files and packages exist.
