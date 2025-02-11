## Java OOP(Object Oriented Programming) Concepts

+ Object-Oriented Programming or Java OOPs concept refers to programming languages that use objects in programming. They use objects as a primary source to implement what is to happen in the code. Objects are seen by the viewer or user, performing tasks you assign.

+ Object-oriented programming aims to implement real-world entities like inheritance, hiding, polymorphism, etc. in programming. The main aim of OOPs is to bind together the data and the functions that operate on them so that no other part of the code can access this data except that function.

+ Example:

```
// Use of Object and Classes in Java
import java.io.*;

class Numbers {
    // Properties
    private int a;
    private int b;

    // Methods
    public void sum() { System.out.println(a + b); }

    public void sub() { System.out.println(a - b); }

    public static void main(String[] args)
    {

        // Creating Instance of Class
        // Object
        Numbers obj = new Numbers();

        // Assigning Values to the Properties
        obj.a = 1;
        obj.b = 2;

        // Using the Methods
        obj.sum();
        obj.sub();
    }
}
```
```
Output
3
-1
```
+ It is a simple example showing a class Numbers containing two variables which can be accessed and updated only by instance of the object created.

## Java Class
+ A Class is a user-defined blueprint or prototype from which objects are created. It represents the set of properties or methods that are common to all objects of one type. Using classes, you can create multiple objects with the same behavior instead of writing their code multiple times. This includes classes for objects occurring more than once in your code. In general, class declarations can include these components in order: 

+ `Modifiers:` A class can be public or have default access (Refer to this for details).
+ `Class name:` The class name should begin with the initial letter capitalized by convention.
+ `Body:` The class body is surrounded by `braces, { }`.
  
## Java Object
+ An Object is a basic unit of Object-Oriented Programming that represents real-life entities. A typical Java program creates many objects, which as you know, interact by invoking methods. The objects are what perform your code, they are the part of your code visible to the viewer/user.
+  An object mainly consists of: 

+ `State:` It is represented by the attributes of an object. It also reflects the properties of an object.
+ `Behavior:` It is represented by the methods of an object. It also reflects the response of an object to other objects.
+ `Identity:` It is a unique name given to an object that enables it to interact with other objects.
+ `Method:` A method is a collection of statements that perform some specific task and return the result to the caller. A method can perform some specific task without returning anything. Methods allow us to reuse the code without retyping it, which is why they are considered time savers. In Java, every method must be part of some class, which is different from languages like C, C++, and Python. 
+ Example:
```
// Java Program to demonstrate
// Use of Class and Objects

// Class Declared
public class GFG {
    
      // Properties Declared
    static String Employee_name;
    static float Employee_salary;

      // Methods Declared
    static void set(String n, float p) {
        Employee_name  = n;
        Employee_salary  = p;
    }

    static void get() {
        System.out.println("Employee name is: " +Employee_name );
        System.out.println("Employee CTC is: " + Employee_salary);
    }

      // Main Method
    public static void main(String args[]) {
        GFG.set("Rathod Avinash", 10000.0f);
        GFG.get();
    }
}
```
```
Output
Employee name is: Rathod Avinash
Employee CTC is: 10000.0
For more information, please refer to the article – Classes and Object.
```

## Method and Method Passing
+ A method is a collection of statements that perform specific tasks and return a result to the caller. It can be declared with or without arguments, depending on the requirements. A method can take input values, perform operations, and return a result.

### 1. Predefined Methods (Built-in Methods)
 + These are methods that come with Java libraries (e.g., Math, String, ArrayList classes).
```
public class Main {
    public static void main(String[] args) {
        // Using built-in Math method
        System.out.println(Math.sqrt(25)); // Output: 5.0
        System.out.println(Math.max(10, 20)); // Output: 20
    }
}
```
+  No need to define them, just use them directly.

### 2. User-defined Methods
+ These are methods created by programmers inside a class to perform specific tasks.
```
class Calculator {
    // User-defined method
    int multiply(int a, int b) {
        return a * b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.multiply(4, 5)); // Output: 20
    }
}
```
+ Defined by the user inside a class.

### 3. Static Methods
+ A static method belongs to the class rather than an object. It can be called directly using the class name.
```
class MathUtils {
    static int square(int num) {
        return num * num;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(MathUtils.square(6)); // Output: 36
    }
}
```
+ Called using the class name, no need to create an object.

### 4. Instance Methods
+ These methods belong to an object of a class and require an instance to be called.
```
class Person {
    String name;

    void display() {
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Prachi";
        p.display(); // Output: Name: Prachi
    }
}
```

+ Requires an object to call the method.

### 5. Getter and Setter Methods
Used to get and set values of private variables (Encapsulation).
```
class Student {
    private String name;

    // Setter
    void setName(String newName) {
        name = newName;
    }

    // Getter
    String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Prachi");
        System.out.println(s.getName()); // Output: Prachi
    }
}
```
+ Controls access to private variables.

### 6. Parameterized and Non-Parameterized Methods
+ `Parameterized Methods` take arguments.
+ `Non-Parameterized Methods` do not take any arguments.
```
class Example {
    // Non-parameterized method
    void greet() {
        System.out.println("Hello!");
    }

    // Parameterized method
    void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }
}

public class Main {
    public static void main(String[] args) {
        Example obj = new Example();
        obj.greet(); // Output: Hello!
        obj.greetUser("Prachi"); // Output: Hello, Prachi!
    }
}
```
### 7. Method Overloading (Compile-time Polymorphism)
+ Same method name but different parameters.
```
class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();
        System.out.println(m.add(5, 3)); // Output: 8
        System.out.println(m.add(2.5, 3.5)); // Output: 6.0
    }
}
```
+ Decided at compile-time which method to execute.

### 8. Method Overriding (Run-time Polymorphism)
+ A child class provides a different implementation of a method from the parent class.

```
class Parent {
    void show() {
        System.out.println("Parent class method.");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child class method.");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child(); // Runtime polymorphism
        obj.show(); // Output: Child class method.
    }
}
```
+ Decided at runtime which method to execute.

+ Summary Table
  
|Type of Method|	Description|	Example|
|--------------|--------------|------------|
|Predefined Methods	|Built-in Java methods| Math.sqrt(25)|
|User-defined Methods|Created by programmers| void greet()|
|Static Methods| Belongs to class, no object| needed static int square(int n)|
|Instance Methods|	Belongs to object, requires an instance| void display()|
|Getter/Setter Method|	Access private data  |setName(), getName()|
|Parameterized Methods|	Accept parameters |void greetUser(String name)|
|Method Overloading| Same name, different parameters| add(int, int), add(double, double)|
|Method Overriding|	Same method, different implementation in child class|	@Override void show()|


```
import java.util.*;
import java.lang.*;
import java.io.*;

class Pen { // Class names should start with uppercase as per Java conventions
    String name;
    String color;
    int price;

    public void sell() {
        System.out.println("Name: " + name + ", Color: " + color + ", Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Taking user input
        String name = scn.nextLine();
        String color = scn.nextLine();
        int price = scn.nextInt();

        // Creating an object of Pen class
        Pen pen1 = new Pen();

        // Correctly assigning values
        pen1.name = name;
        pen1.color = color;
        pen1.price = price;

        // Calling the sell method
        pen1.sell();

        scn.close(); // Closing Scanner to prevent resource leak
    }
}
```

