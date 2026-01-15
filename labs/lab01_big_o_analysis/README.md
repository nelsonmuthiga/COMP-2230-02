# Lab 01: Big O Analysis

## Introduction to Java

Java is a high-level, object-oriented programming language widely used for building robust, scalable applications. In this course, we'll use Java to implement and analyze data structures and algorithms.

### Key Concepts in Java:
- **Classes and Objects**: Java programs are organized into classes. Everything in Java is an object (except primitives like `int`, `double`).
- **Main Method**: The entry point of a Java program is the `main` method: `public static void main(String[] args)`.
- **Variables**: Declare variables with types, e.g., `int x = 5;`.
- **Methods**: Functions inside classes, e.g., `public int add(int a, int b) { return a + b; }`.
- **Packages**: Organize code into packages for better structure.

### Running Java Code in GitHub Codespaces

GitHub Codespaces provides a cloud-based development environment with Java pre-installed.

1. **Open the Terminal**: In VS Code, open the terminal (View > Terminal).
2. **Compile Java Files**: Use `javac` to compile: `javac FileName.java`
3. **Run Java Programs**: Use `java` to run: `java FileName` (without .class extension)
4. **Example**:
   ```bash
   javac HelloWorld.java
   java HelloWorld
   ```

### Sample Java Program

Here's a simple "Hello World" program:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

Save this as `HelloWorld.java`, compile and run as above.

## Lab Objectives

In this lab, you'll learn about Big O notation, which describes the performance or complexity of an algorithm. We'll focus on time complexity.

### What is Big O?
- **O(1)**: Constant time – operations take the same time regardless of input size.
- **O(n)**: Linear time – time grows linearly with input size.
- **O(n²)**: Quadratic time – time grows quadratically.

### Tasks

1. **Analyze the provided code examples** for different complexities.
2. **Run the programs** and observe execution times for different input sizes.
3. **Answer the questions** in the code comments.

### Code Examples

See the Java files in this folder:
- `ConstantTime.java`: Demonstrates O(1) complexity.
- `LinearTime.java`: Demonstrates O(n) complexity.
- `QuadraticTime.java`: Demonstrates O(n²) complexity.
- `lecture_example/LectureExample1.java`: Lecture example showing F(n) = 2n + 1, O(n) complexity.
- `lecture_example/LectureExample2.java`: Example with f(n) = 3n² + 2n + 1000*log(n) + 5000, O(n²) complexity.
- `lecture_example/LectureExample3.java`: Example with f(n) = 3n³ + 2n² + 5n + 1, O(n³) complexity.
- `lecture_example/ConditionalExample.java`: Example of if-else with max(O(n), O(1)) = O(n).
- `lecture_example/NestedLoopExample.java`: Example of nested loops with O(n*m) complexity.
- `practice/SumExample.java`: Practice example comparing three ways to compute sum with different time/space complexities.

Compile and run each, then modify the input sizes to see how time changes.

### Questions

1. What happens to execution time in `LinearTime.java` when you double the input size?
2. Why is `QuadraticTime.java` slower for large inputs?
3. Can you think of a real-world example where O(n²) might be acceptable?
4. In `lecture_example/LectureExample1.java`, count the operations and verify F(n) = 2n + 1. Why is it O(n)?
5. In `lecture_example/LectureExample2.java`, identify the dominant term in f(n) = 3n² + 2n + 1000*log(n) + 5000 and explain why it's O(n²).
6. In `lecture_example/LectureExample3.java`, what is the dominant term in f(n) = 3n³ + 2n² + 5n + 1 and why is it O(n³)?
7. In `lecture_example/ConditionalExample.java`, why is the Big O max(O(n), O(1)) = O(n)?
8. In `lecture_example/NestedLoopExample.java`, why is the complexity O(n*m) and how does it change if n == m?
9. In `practice/SumExample.java`, compare the time and space complexities of the three methods. Which is best for large n and why?

Submit your answers and observations in a comment on the lab discussion forum.