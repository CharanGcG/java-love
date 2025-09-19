## 🛠️ Writing, Compiling & Executing Java Code

### 1. **Write the Code**

Create a file with a `.java` extension.
Example: `HelloWorld.java`

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

⚠️ Important:
The **class name** (`HelloWorld`) **must match** the filename (`HelloWorld.java`).

---

### 2. **Compile the Code**

Use the Java compiler `javac` to turn source code into **bytecode**.

```bash
javac HelloWorld.java
```

➡️ This creates a file called **HelloWorld.class** (bytecode file).

---

### 3. **Run the Code**

Use the Java Runtime (`java`) to execute the bytecode:

```bash
java HelloWorld
```

➡️ Output:

```
Hello, Java!
```

---

### 4. **What Actually Happens**

* `javac` → converts `.java` file → `.class` file (bytecode)
* `java` → runs `.class` file on the **JVM (Java Virtual Machine)**

---

### 5. **Example Workflow**

```bash
> notepad HelloWorld.java    // write code in Windows
> javac HelloWorld.java      // compile
> java HelloWorld            // run
```

On Linux/Mac (using nano/vim/VS Code, etc.):

```bash
nano HelloWorld.java
javac HelloWorld.java
java HelloWorld
```

---
