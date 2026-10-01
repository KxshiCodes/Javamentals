# Computer Science Fundamentals

These are reference notes on core computer science concepts. The goal is to understand what the computer is doing under the hood.

---

## Week 0: Scratch

### Takeaways

- A program is **Input → Algorithm → Output**.
- Building blocks: variables, functions, conditionals, loops, boolean expressions.
- **Abstraction** = hiding low-level details so I can use something without knowing how it works underneath.
- Programming is less about memorising syntax and more about breaking a problem into steps the computer can follow.

### Mental models (and how they look in Java)

| Concept | Mental model | Java |
|---|---|---|
| Variable | A place to keep information | `int age = 20;` |
| Function | An action the program can do | `static int square(int x) { return x * x; }` (called a *method* in Java) |
| Conditional | A decision / fork | `if (age >= 18) { ... } else { ... }` |
| Loop | Repeat while a condition is met | `for (int i = 0; i < 3; i++) { ... }` |
| Boolean | A yes/no question | `boolean isAdult = age >= 18;` |

---

## Week 1: C → what it means for Java

### Takeaways

- C is very close to the computer, so you must be specific. Java is a step higher: it handles more for you (especially memory) but still uses the same core ideas.
- **Source code** is what I write. A **compiler** translates it into something the computer can run.
- Different data types exist because different kinds of information are stored differently.
- Computers have finite memory (bits), so numbers have limits.

### How Java runs (different from C)

```
C:     Source code → Compiler → Machine code → Execution
Java:  Source code → javac → Bytecode (.class) → JVM runs it → Execution
```

The **JVM** (Java Virtual Machine) is a program that runs bytecode. That's why Java code runs on Windows, Mac and Linux without changes.

### Data types

| Type | Holds | Notes |
|---|---|---|
| `int` | whole numbers | 32 bits, about ±2.1 billion |
| `long` | bigger whole numbers | 64 bits, write `10000000000L` |
| `double` | decimals | default choice for decimals |
| `float` | decimals (less precise) | needs `f`: `3.14f`; rarely used |
| `char` | one character | single quotes: `'a'` |
| `boolean` | true / false | built in (no library needed) |
| `String` | text | double quotes: `"hi"` |

**CS50 vs. plain C vs. Java:** in C, `string` and `bool` aren't built in (CS50 adds them via `cs50.h`). In Java, `boolean` is built in and `String` is a real, built-in **class** (capital S), so it comes with useful methods like `.length()` and `.toUpperCase()`. No special library needed.

### Integer overflow: finite bits → finite range

```java
int n = Integer.MAX_VALUE;   // 2147483647
n = n + 1;                   // wraps around to -2147483648
System.out.println(n);
```

In C, signed overflow is technically *undefined behaviour*. In Java it's **defined**: it always wraps. Still a bug in most programs. Use `long` for bigger numbers, or `Math.addExact(a, b)` to get an exception instead of a silent wrong answer.

### Floating-point imprecision: some decimals can't be stored exactly in binary

```java
System.out.println(0.1 + 0.2);   // 0.30000000000000004
```

Same in Java and C. Don't compare doubles with `==`. Never use `double` for money (Java has `BigDecimal` for that).

---

## Week 2: Arrays

### Takeaways

- An array stores multiple values of the **same type**, back to back in memory.
- Indexing starts at **0**.
- Arrays have a **fixed size** once created.
- Cryptography: Plaintext → Cipher → Ciphertext.

### What's different in Java (good news)

| In C | In Java |
|---|---|
| Strings are `char` arrays ending in `'\0'` | `String` is an object. No `'\0'` to manage. |
| Going out of bounds = undefined behaviour (garbage, crash, or silent bug) | Going out of bounds = **`ArrayIndexOutOfBoundsException`**, a clear error message. |
| Must pass array size separately to functions | Arrays know their own size: `arr.length` |

Java protects you here, so **experiment freely**. The worst that happens is a readable error.

### In code

```java
// Create and fill an array
int[] a = {1, 2, 3};
System.out.println(a[0]);       // 1 (first element)
System.out.println(a.length);   // 3 (it knows its own size)

// Out of bounds: Java stops you with a clear error
System.out.println(a[5]);       // ArrayIndexOutOfBoundsException

// No need to pass the size separately
static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}

// Strings
String s = "HI!";
System.out.println(s.length());    // 3 (no '\0' counted)
System.out.println(s.charAt(0));   // 'H'
```

**Still true in Java:** always keep my indexes between `0` and `length - 1`.

### Compiling in detail

C has the preprocessing → compilation → assembly → linking pipeline. For Java, the version to remember is just: **`javac` compiles to bytecode, the JVM runs it.** (Tools like Maven/Gradle handle this for bigger projects, later.)

---

## Week 3: Algorithms

*(to add after the lecture)*

## Week 4: Memory

*(to add after the lecture. Java hides manual memory management, but the ideas of stack, heap and references still matter.)*

## Week 5: Data Structures

*(to add after the lecture. Java has these built in, e.g. `ArrayList` and `HashMap`.)*
