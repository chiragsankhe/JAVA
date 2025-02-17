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


```
import java.util.*;
import java.lang.*;
import java.io.*;

 class Laptop{

		String model ;
		int price ;

      Laptop(String a , int b)
		{
			this.model= a ;
			this.price = b  ;
		}
		

		Laptop(Laptop dell)
		{
			this.model = dell.model;
			this.price = dell.price;
		}

          
		//    same name function but diffrent parameter 

		void sell(String model)
		{
			System.out.println(model);
		}

		void sell(int price)
		{
			System.out.println(price);
		}
		void sell(String model , int price)
		{
			System.out.println(model);
			System.out.println(price);

		}


	}

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		String a = scn.nextLine();
		int b = scn.nextInt();

		Laptop dell = new Laptop(a,b);

		Laptop hp = new Laptop(dell);

        //   parameter a,b 
		dell.sell(a,b);

		
	}
}

```

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

#### 🔹 1️⃣ Class
+ A class is a blueprint or template for creating objects. It defines properties (variables) and methods (functions) that objects of the class will have.

```
Edit
class Car {  
    String brand;  // Property (Instance Variable)
    int speed;     

    void drive() {  // Method
        System.out.println(brand + " is driving at " + speed + " km/h.");
    }
}
```
+ Here, Car is a class that defines properties (brand, speed) and a method (drive()).
### 🔹 2️⃣ Object
+ An object is an instance of a class. It is a real entity created using the new keyword.
```
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();  // Object created
        myCar.brand = "Tesla";
        myCar.speed = 100;
        myCar.drive();  // Output: Tesla is driving at 100 km/h.
    }
}
```
+ myCar is an object of the Car class.
+ It has its own copy of brand and speed.
+ `Calling myCar.drive(); `executes the method.

+ 🔹 Multiple objects can be created from the same class!
```
Car car1 = new Car();  
Car car2 = new Car();
```
#### 🔹 3️⃣ Constructor
+ A constructor is a special method that initializes an object when it is created.

+ It has the same name as the class.
+ It does not return any value (not even void).
+ It is called automatically when an object is created.
```
class Car {
    String brand;
    int speed;

    // Constructor
    Car(String b, int s) {  
        brand = b;
        speed = s;
    }

    void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla", 120);  // Constructor is called automatically
        myCar.drive();  // Output: Tesla is driving at 120 km/h.
    }
}
```
+ 🔹 Without a constructor, you would have to assign values manually.
+ 🔹 With a constructor, values are assigned automatically when creating an object.

#### 🔹 4️⃣ Instance
+ An instance is simply another word for an object of a class.
+ When you create an object using new, you create an instance of that class.
```
Car myCar = new Car("Tesla", 120);  // myCar is an instance of Car
Car yourCar = new Car("BMW", 150);  // yourCar is another instance
```
+ Each instance has its own values for brand and speed.

|Instance (Object)	|brand	|speed|
|----------------|---------|-----|
|myCar|	"Tesla"	|120 km/h|
|yourCar|	"BMW"	|150 km/h|

#### 🔹 5️⃣ Method
A method is a function inside a class that performs an action.
It can be called (invoked) on an object.

```
class Car {
    String brand;
    int speed;

    // Constructor
    Car(String b, int s) {
        brand = b;
        speed = s;
    }

    // Method
    void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla", 120);
        myCar.drive();  // Calling the method
    }
}
```
+ 🔹 Methods can be called using objects:
```
myCar.drive();  // Tesla is driving at 120 km/h.
```
+ 🔹 Methods can take parameters and return values too.
```
int getSpeed() {
    return speed;
}
```
✅ Summary Table

|Concept	|Definition|
|-----------|----------|
|Class	|A blueprint/template that defines properties and methods for objects.|
|Object	|A real-world entity created from a class.|
|Constructor	|A special method that initializes an object when created.|
|Instance	|Another word for an object of a class.|
|Method	|A function inside a class that performs actions.|


+ 🔥 Example Using All Concepts Together
```
class Car {
    String brand;
    int speed;

    // Constructor
    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method
    void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects (instances) of Car class
        Car myCar = new Car("Tesla", 120);
        Car yourCar = new Car("BMW", 150);

        // Calling methods
        myCar.drive();   // Tesla is driving at 120 km/h.
        yourCar.drive(); // BMW is driving at 150 km/h.
    }
}
```

##📌 Types of Constructors in Java 🚀
+ In Java, a constructor is a special method used to initialize objects.
+ It must have the same name as the class and has no return type (not even void).

+ There are three types of constructors in Java:
###### 1️⃣ Default Constructor
###### 2️⃣ Parameterized Constructor
###### 3️⃣ Copy Constructor

### 1️⃣ Default Constructor (No-Argument Constructor)
+ A constructor with no parameters.
+ It assigns default values to instance variables.
+ If you don’t define any constructor, Java automatically provides a default constructor.
```
class Laptop {
    String model;
    int price;

    // ✅ Default Constructor (No Parameters)
    Laptop() {
        model = "Unknown";
        price = 0;
    }

    void display() {
        System.out.println("Model: " + model + ", Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Laptop dell = new Laptop(); // ✅ Default constructor is called
        dell.display();  // Output: Model: Unknown, Price: 0
    }
}
```
### 2️⃣ Parameterized Constructor
+ A constructor with parameters.
+ It allows passing values when creating an object.
```
class Laptop {
    String model;
    int price;

    // ✅ Parameterized Constructor
    Laptop(String model, int price) {
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Model: " + model + ", Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Laptop dell = new Laptop("Dell XPS", 50000);  // ✅ Passing values
        dell.display();  // Output: Model: Dell XPS, Price: 50000
    }
}
```
+ ✔ `this.model = model;` ensures that the instance variable model is assigned the constructor parameter.

### 3️⃣ Copy Constructor
A constructor that copies values from another object.
It creates a new object with the same properties as an existing object.
```
class Laptop {
    String model;
    int price;

    // ✅ Parameterized Constructor
    Laptop(String model, int price) {
        this.model = model;
        this.price = price;
    }

    // ✅ Copy Constructor
    Laptop(Laptop oldLaptop) {
        this.model = oldLaptop.model;
        this.price = oldLaptop.price;
    }

    void display() {
        System.out.println("Model: " + model + ", Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Laptop original = new Laptop("MacBook", 100000); // ✅ Original object
        Laptop copy = new Laptop(original); // ✅ Copy constructor is called

        original.display();  // Output: Model: MacBook, Price: 100000
        copy.display();      // Output: Model: MacBook, Price: 100000
    }
}
```
+ ✔ The copy constructor ensures that copy has the same values as original.

+ 📌 Summary Table
  
|Type of Constructor	|Description	|Example|
|-----------------|--------------|------------|
|Default Constructor|	No parameters, assigns default values|	`Laptop() { model = "Unknown"; }`|
|Parameterized Constructor	|Takes parameters to initialize values	|`Laptop(String model, int price) { this.model = model; }`|
|Copy Constructor|	Creates a new object by copying an existing object	|Laptop(Laptop obj) { `this.model = obj.model;` }|

#### 🚀 Quick Recap
+ ✔ If you don’t create a constructor, Java provides a default one.
+ ✔ Parameterized constructors help assign values while creating an object.
+ ✔ Copy constructors help duplicate an existing object’s properties.



## 📌 Polymorphism in Java 🚀
+ Polymorphism means "many forms" and allows the same method to have different behaviors in Java.

+ There are two types of polymorphism:
#### 1️⃣ Compile-time Polymorphism (Method Overloading)
#### 2️⃣ Runtime Polymorphism (Method Overriding)

### 1️⃣ Compile-time Polymorphism (Method Overloading)
+ Same method name, different parameters (number, type, or both).
+ Decided at compile time.
+ Java determines which method to call based on arguments passed.
✅ Example of Method Overloading
```
class MathOperations {
    // Method with two int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with double parameters
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();

        System.out.println(obj.add(10, 20));       // Calls add(int, int)
        System.out.println(obj.add(10, 20, 30));  // Calls add(int, int, int)
        System.out.println(obj.add(5.5, 2.5));    // Calls add(double, double)
    }
}
```
+ 🛠 Output
```
30
60
8.0
```
+ ✔ Method name is the same (add) but works differently based on parameters.

### 2️⃣ Runtime Polymorphism (Method Overriding)
+ Same method name, same parameters, but different behavior in child class.
+ Happens at runtime.
+ Requires inheritance (parent-child relationship).
+ Uses `@Override `annotation for clarity.
✅ Example of Method Overriding
```
// Parent class
class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

// Child class overriding method
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Parent class object
        myAnimal.sound(); // Output: Animals make sounds

        Animal myDog = new Dog();  // Upcasting - Runtime polymorphism
        myDog.sound(); // Output: Dog barks
    }
}
```
🛠 Output
```
Animals make sounds
Dog barks
```
+ ✔ The `sound()` method behaves differently based on the object type.

+ 📌 Key Differences
  
| Feature	| Method Overloading  |Method Overriding |
|---------------|---------------------|-----------------------|
|Type	| Compile-time Polymorphism	|Runtime Polymorphism|
|Method Signature	|Same name, different parameters	|Same name, same parameters|
| Return Type	|Can be different	|Must be the same or covariant|
| Inheritance	|Not required	|Required (Parent-Child Relationship)|
| Binding	|Early binding (Compile-time)	|Late binding (Runtime)|
| Modifiers	|Can be static|	Cannot override static methods|
| Keyword	|Not required	|Uses @Override annotation|

+🚀 Real-world Example
#### ATM Machine Example (Overriding)
```
class ATM {
    void withdraw() {
        System.out.println("Withdraw cash using card.");
    }
}

class UPI extends ATM {
    @Override
    void withdraw() {
        System.out.println("Withdraw cash using UPI.");
    }
}

public class Main {
    public static void main(String[] args) {
        ATM atm1 = new ATM();
        atm1.withdraw(); // Output: Withdraw cash using card.

        ATM atm2 = new UPI();
        atm2.withdraw(); // Output: Withdraw cash using UPI.
    }
}
```
#### 🔎 When to Use Polymorphism?
+ `✔ Overloading:` When you need multiple versions of a method with different parameters.
+ `✔ Overriding:` When a child class needs to modify the behavior of a parent class method.

## Inheritance in Java
Inheritance is a fundamental concept in Object-Oriented Programming (OOP) that allows a class (child class) to inherit properties and behaviors (fields and methods) from another class (parent class). It promotes code reusability and establishes a relationship between classes.

### 1. Why Use Inheritance?
+ `Code Reusability `– Avoids code duplication by using existing classes.
+ `Method Overriding `– Allows a subclass to provide a specific implementation of a method in the parent class.
+ `Hierarchical Organization` – Establishes relationships between classes in a structured way.33
### 2. Types of Inheritance in Java
Java supports the following types of inheritance:

|Type	|Description|
|-------|-------------|
|Single Inheritance	|One class inherits from another class.|
|Multilevel Inheritance|	A class inherits from a class, which in turn inherits from another class.|
|Hierarchical Inheritance	|Multiple classes inherit from a single parent class.|

##🚫 Java does not support multiple inheritance with classes (to avoid ambiguity), but it supports multiple inheritance through interfaces.

### 3. Syntax of Inheritance
We use the extends keyword for class inheritance.
```
// Parent Class
class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

// Child Class (inherits from Animal)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); // Inherited method
        d.bark();  // Own method
    }
}
```
Output
```
Animals make sounds
Dog barks
```
### 4. Multilevel Inheritance
A class inherits from another class, which itself is inherited from another class.
```
// Grandparent Class
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

// Parent Class
class Mammal extends Animal {
    void breathe() {
        System.out.println("Breathing...");
    }
}

// Child Class
class Dog extends Mammal {
    void bark() {
        System.out.println("Barking...");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();     // Inherited from Animal
        d.breathe(); // Inherited from Mammal
        d.bark();    // Own method
    }
}
```
Output
```
Eating...
Breathing...
Barking...
```
### 5. Hierarchical Inheritance
+ One parent class is inherited by multiple child classes.
```
// Parent Class
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

// Child Class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

// Child Class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Meowing...");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // Inherited method
        d.bark(); // Own method

        Cat c = new Cat();
        c.eat();  // Inherited method
        c.meow(); // Own method
    }
}
```
Output
```
Eating...
Barking...
Eating...
Meowing...
```
### 6. Method Overriding in Inheritance
+ A child class can override a method of the parent class to provide its own implementation.
```
class Animal {
    void sound() {
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {  // Overriding the method
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); // Calls overridden method
    }
}
```
Output
```
Dog barks
```
### 7. super Keyword in Inheritance
+ Used to call the parent class constructor.
+ Used to access the parent class methods.
```
class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }

    void sound() {
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // Calls parent constructor
        System.out.println("Dog constructor");
    }

    void sound() {
        super.sound(); // Calls parent method
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
```
Output
```
Animal constructor
Dog constructor
Animals make sound
```
Dog barks
### 8. Final Keyword in Inheritance
+ `final class `→ Prevents a class from being inherited.
+ `final method `→ Prevents method overriding.
```
final class Animal {
    void sound() {
        System.out.println("Animals make sound");
    }
}
// This will cause an error
// class Dog extends Animal {} // ❌ Cannot inherit from a final class
```
```
class Animal {
    final void sound() {
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal {
    // void sound() {}  // ❌ Cannot override a final method
}
```
### 9. Multiple Inheritance using Interfaces
+ Java doesn't support multiple inheritance with classes but allows it through interfaces.
```
interface A {
    void methodA();
}

interface B {
    void methodB();
}

// Multiple inheritance using interfaces
class C implements A, B {
    public void methodA() {
        System.out.println("Method A");
    }
    public void methodB() {
        System.out.println("Method B");
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
    }
}
```
+ Output
```
Method A
Method B
```
### Conclusion
+ ✅ Inheritance enhances code reusability and maintainability.
+ ✅ Method overriding allows modifying behavior in subclasses.
+ ✅ The super keyword helps access parent class methods and constructors.
+ ✅ Java prevents multiple inheritance in classes to avoid ambiguity but supports it with interfaces.


## Packages
### Java Built-in Packages and User-defined Packages
+ In Java, packages are used to group related classes and interfaces together. They help in modularizing code, avoiding name conflicts, and improving maintainability.

#### 1. Types of Packages in Java
+ `Built-in Packages` (Predefined Java Packages) – Provided by Java.
+ `User-defined Packages` – Created by developers.
  
#### 2. Built-in Packages in Java
+ Java comes with several built-in packages that provide essential functionalities.

#### Common Java Built-in Packages:
|Package	|Description|
|---------------|------------------------------------------------------------------------|
|java.lang	|Core classes like String, Math, Integer, System, Object (imported by default).|
|java.util	|Utility classes like ArrayList, HashMap, Collections, Date, Random.|
|java.io  	|Input and output operations (File, BufferedReader, PrintWriter).|
|java.net	|Networking features (Socket, URL, HttpURLConnection).|
|java.sql	|Database handling (Connection, Statement, ResultSet).|
|javax.swing	|GUI components (JButton, JFrame, JLabel).|
|java.awt	|Abstract Window Toolkit for GUI (Button, Color, Font).|
|java.nio	|Non-blocking I/O operations.|
|java.time	|Date and time API (LocalDate, LocalTime).|
|java.security	|Security and encryption utilities.|

+ Example:` Using Built-in Packages`
+ 📝 Using `java.util.ArrayList`
```
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println(list);
    }
}
```
Output
```
[Java, Python, C++]
```
+ 📝 Using `java.time.LocalDate`

```
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);
    }
}
```
Output
```
Today's date: 2025-02-15
```
#### 3. `User-Defined Packages`
+ You can create your own packages to organize your code.

+ Steps to Create and Use a Package
+ `Create a Package:` Use the package keyword at the beginning of a file.
+ `Compile the Class:` `javac -d `. `FileName.java`
+ `Import and Use the Class:` `import package_name.ClassName`;
  
Example: Creating and Using a User-defined Package
##### 📌 Step 1: Create a Package (mypackage)
Create a file `MyClass.java` inside a folder `Mypackage/.`
```
package mypackage;  // Package declaration

public class MyClass {
    public void showMessage() {
        System.out.println("Hello from MyClass inside mypackage!");
    }
}
```
#### 📌 Step 2: Compile the File
Run this command in the terminal:
```
javac -d . MyClass.java
```
This will create a folder mypackage containing MyClass.class.

#### 📌 Step 3: Create a Main Class to Use the Package
Create another file Main.java outside the mypackage folder.
```
import mypackage.MyClass;  // Import user-defined package

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showMessage();
    }
}
```
#### 📌 Step 4: Compile and Run the Main Class
```
javac Main.java
java Main
```
Output
```
Hello from MyClass inside mypackage!
```
4. Access Modifiers and Packages
   
|Modifier	|Same Class	|Same Package	|Subclass (Different Package)	|Other Classes (Different Package)|
|---------------|---------------|--------------|-------------------------------|----------------------------------|
| public	| ✅	| ✅	| ✅	|✅|
|protected	|✅	|✅	|✅	|❌|
|default (no modifier)	|✅	|✅	|❌	|❌|
|private	|✅	|❌	|❌	|❌|


6. Importing Packages
Types of Import Statements
+ Import a Specific Class
```
import java.util.ArrayList;
```
+ Import the Whole Package
```
import java.util.*;
```
+ Use Fully Qualified Name (No Import)
```
public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
    }
}
```
### Conclusion
+ ✅ Built-in packages (like java.util, java.io) provide ready-made functionalities.
+ ✅ User-defined packages help organize large projects.
+ ✅ Import statements help use classes from packages efficiently.
+ ✅ Access modifiers determine package-level visibility.


## Access Modifiers

### Access Modifiers in Java
Access modifiers in Java control the visibility and accessibility of classes, methods, and variables. They help in encapsulation and ensure that only necessary parts of the code are exposed to other classes.

1. Types of Access Modifiers in Java

|Modifier	|Same Class	|Same Package	|Subclass (Different Package)	|Other Classes (Different Package)|
------------------|-----------|-----------------|------------------------------|----------------------------------|
|public|	✅ Yes	✅ Yes|✅ Yes	|✅ Yes|
|protected	|✅ Yes|✅ Yes	|✅ Yes|❌ No|
|default (no modifier)|	✅ Yes	|✅ Yes|❌ No	|❌ No|
|private	|✅ Yes|❌ No|	❌ No	|❌ No|

3. Explanation of Each Modifier
#### 🔹 1. public (Most Accessible)
Accessible from anywhere (same class, same package, subclass, and different packages).
Used when a class or method should be available everywhere.

+ // File: PublicExample.java
```
package mypackage;

public class PublicExample {
    public void show() {
        System.out.println("Public method can be accessed anywhere.");
    }
}
```
+ // File: Main.java (Different Package)
```
import mypackage.PublicExample; 

public class Main {
    public static void main(String[] args) {
        PublicExample obj = new PublicExample();
        obj.show();  // ✅ Accessible
    }
}
```
✅ Output
```
Public method can be accessed anywhere.
```
### 🔹 2. protected (Limited to Subclasses and Same Package)
+ Accessible within the same package and subclasses in different packages.
+ Not accessible from non-subclass classes outside the package.

package mypackage;
```
public class ProtectedExample {
    protected void show() {
        System.out.println("Protected method can be accessed within the same package and subclasses.");
    }
}
```
// Subclass in a different package
```
package anotherpackage;
import mypackage.ProtectedExample;

public class ChildClass extends ProtectedExample {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.show();  // ✅ Accessible (because it's a subclass)
    }
}
```
// File: Main.java (Different Package, Not a Subclass)
```
import mypackage.ProtectedExample;

public class Main {
    public static void main(String[] args) {
        ProtectedExample obj = new ProtectedExample();
        obj.show();  // ❌ ERROR: Not accessible
    }
}
```
✅ Output (For Subclass)
```
Protected method can be accessed within the same package and subclasses.
```
❌ Error for Non-Subclass
```
error: show() has protected access in ProtectedExample
```
### 🔹 3. default (Package-Private)
+ If no modifier is used, the default access modifier is applied.
+ Accessible only within the same package.
+ Not accessible outside the package, even in subclasses.
```
package mypackage;

class DefaultExample {
    void show() {  // Default access
        System.out.println("Default method can be accessed within the same package only.");
    }
}
```
// File: Main.java (Same Package)
```
package mypackage;

public class Main {
    public static void main(String[] args) {
        DefaultExample obj = new DefaultExample();
        obj.show();  // ✅ Accessible
    }
}
```
// File: AnotherClass.java (Different Package)
```
package anotherpackage;
import mypackage.DefaultExample;  

public class AnotherClass {
    public static void main(String[] args) {
        DefaultExample obj = new DefaultExample();
        obj.show();  // ❌ ERROR: Not accessible
    }
}
```
✅ Output (Same Package)
```
Default method can be accessed within the same package only.
```
❌ Error (Different Package)

```
error: DefaultExample is not public in mypackage; cannot be accessed from outside package
```
### 🔹 4. private (Most Restricted)
+ Accessible only within the same class.
+ Not accessible from subclasses, other classes, or even the same package.
```
package mypackage;

public class PrivateExample {
    private void show() {
        System.out.println("Private method can only be accessed within the same class.");
    }

    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
        obj.show();  // ✅ Accessible (inside same class)
    }
}
```
// File: Main.java (Same Package)
```
package mypackage;

public class Main {
    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
        obj.show();  // ❌ ERROR: Not accessible
    }
}
```
✅ Output (Inside Same Class)
```
Private method can only be accessed within the same class.
```
❌ Error (Outside Class)
```
error: show() has private access in PrivateExample
```
+ 3. Summary Table of Access Modifiers
     
|Modifier	|Within Class	|Same Package	|Subclass (Different Package)	|Other Package|
|------------|----------------|-------------|--------------------------|-------------------|
|public|✅ Yes|✅ Yes|	✅ Yes	|✅ Yes|
|protected|✅ Yes|✅ Yes|✅ Yes|❌ No|
|default (no modifier)	|✅ Yes|✅ Yes|❌ No|	❌ No|
|private|✅ Yes|❌ No	|❌ No	|❌ No|

+ 4. Use Cases for Each Modifier
     
|Modifier|Use Case|
|---------|---------|
|public|	Use when a method/class should be accessible everywhere.|
|protected|	Use when a method should be inherited but not freely accessed outside.|
|default|	Use when access should be restricted to the same package.|
|private|	Use when a method/variable should be hidden from other classes.|

##### 5. Best Practices for Access Modifiers
+ ✔ Use private for data encapsulation (data hiding).
+ ✔ Use protected for methods meant to be inherited but not widely accessible.
+ ✔ Use public sparingly to prevent unnecessary exposure.
+ ✔ Use default to limit access within a package.

## Encapsulation in Java
Encapsulation is one of the four fundamental Object-Oriented Programming (OOP) principles (along with Abstraction, Inheritance, and Polymorphism). It is the practice of wrapping data (variables) and methods (functions) that operate on the data into a single unit, usually a class.

#### Key Features of Encapsulation
+ `Data Hiding` → The class's internal details are hidden from the outside world.
+ `Access Control `→ Use access modifiers (private, public, protected, default) to control access to class members.
+ `Getter & Setter Methods `→ Provide controlled access to private fields.
+ `Improved Maintainability` → Helps in modifying code without affecting external code.
+ `Security `→ Prevents unauthorized access and modifications to data.
Example of Encapsulation
```
// Encapsulated class
class BankAccount {
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String name, double initialBalance) {
        this.accountHolderName = name;
        this.balance = initialBalance;
    }

    // Getter method
    public double getBalance() {
        return balance;
    }

    // Setter method (with validation)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method with encapsulation logic
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Prachi", 5000);

        // Accessing data through methods
        account.deposit(2000);
        account.withdraw(1000);

        System.out.println("Current Balance: " + account.getBalance());

        // Direct access is not possible due to encapsulation
        // account.balance = 10000; // ❌ Compilation Error
    }
}
```
### Why Use Encapsulation?
+ Prevents direct modification of critical data.
+ Ensures better control over data with validation logic.
+ modular programming, making code more readable and maintainable.


## Abstraction


### Definition of Abstraction in Java
+ Abstraction is the process of hiding implementation details and showing only essential features of an object. It allows you to focus on what an object does rather than how it does it.

#####  In Java, abstraction is achieved using:
+ `Abstract Classes `(abstract keyword)
+ `Interfaces `(interface keyword)
  
Simple Example of Abstraction
```
abstract class Shape {
    abstract void draw(); // Abstract method (no implementation)
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle...");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape myShape = new Circle();
        myShape.draw(); // Output: Drawing a Circle...
    }
}
```


#### Abstraction in Java
Abstraction is one of the four pillars of Object-Oriented Programming (OOP) in Java. It is the process of hiding implementation details from the user and only showing essential features.

#### Key Features of Abstraction
+ `Hides implementation details `→ Only relevant details are exposed.
+ `Increases maintainability` → Code is easier to manage and modify.
+ `Supports modular programming` → Helps break a complex system into smaller, manageable parts.
+ `Achieved using Abstract Classes and Interfaces` in Java.
### 1️⃣ Abstraction Using Abstract Class
+ An abstract class is a class that cannot be instantiated and can have both abstract (without body) and concrete (with body) methods.

Example of Abstract Class
```
// Abstract class
abstract class Vehicle {
    abstract void start(); // Abstract method (No implementation)

    void stop() {  // Concrete method (Has implementation)
        System.out.println("Vehicle is stopping...");
    }
}

// Concrete subclass
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting with a key...");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car(); // Upcasting
        myCar.start();  // Calls overridden method from Car class
        myCar.stop();   // Calls concrete method from Vehicle class
    }
}
```
### 🔹 Key Points:

+ The Vehicle class is abstract, so we cannot create an object of it.
+ The Car class extends Vehicle and provides implementation for the abstract method start().
+ The stop() method is a concrete method, so it can be used directly.
  
### 2️⃣ Abstraction Using Interface
+ An interface in Java is a blueprint of a class that contains only abstract methods (before Java 8).
+ 100% abstraction (before Java 8).
+ Can contain default and static methods (from Java 8 onwards).
+ Used to achieve multiple inheritance.
Example of Interface
```
// Interface
interface Animal {
    void makeSound();  // Abstract method
}

// Implementing class
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Upcasting
        myDog.makeSound();
    }
}
```
### 🔹 Key Points:

+ Animal is an interface with an abstract method makeSound().
+ Dog implements Animal and provides its own implementation.
+ An interface cannot have instance variables, only constants (public static final variables).
### 🆚 Abstract Class vs Interface
|Feature	|Abstract Class	|Interface|
|---------------|---------------|----------|
| Methods	|Can have both abstract and concrete methods	|Only abstract methods (before Java 8)|
| Fields	|Can have instance variables	|Only constants (public static final)|
| Inheritance	|Single inheritance (extends)	|Multiple inheritance (implements)|
| Access Modifiers	|Can have any access modifier	|Methods are public by default|
| Best Used For	|Code reuse, partial abstraction	|Total abstraction, multiple inheritance|

###📌 When to Use What?
+ ✔ Use an abstract class when:
+ You want to provide some implementation but leave certain methods abstract.
+ You expect related classes to share code.
+ ✔ Use an interface when:

+ You want to enforce 100% abstraction.
+ You need multiple inheritance.
+ You are defining behavior that multiple unrelated classes can adopt (e.g., Flyable, Runnable).
+🚀 Real-World Example
Think of a car:
+ `Abstraction: `You just use the steering, accelerator, and brakes—you don't need to know how the engine works internally.
+ `Encapsulation:` The engine is hidden inside the hood, and you interact with it through predefined controls.
Would you like a more detailed real-world example or another concept explained? 😊


🔹 Why Use Abstraction?

Hides complexity and shows only the necessary details.
Improves code maintainability and flexibility.
Encourages modular programming.



## Interface in Java
An interface in Java is a blueprint of a class that contains only abstract methods (before Java 8) and can be used to achieve 100% abstraction. It is used to define a contract that multiple classes can implement.

### Key Features of Interfaces in Java
+ ✅ Contains only abstract methods (before Java 8)
+ ✅ Supports multiple inheritance (unlike classes)
+ ✅ Methods are public and abstract by default
+ ✅ Variables are public, static, and final (constants) by default
+ ✅ Cannot have constructors (no object creation)

#### Syntax of an Interface
```
// Defining an interface
interface Animal {
    void makeSound(); // Abstract method (no body)
}

// Implementing the interface in a class
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Upcasting
        myDog.makeSound();
    }
}
```
Output:
```
Dog barks: Woof! Woof!
```
#### Interface with Multiple Implementations
```
interface Vehicle {
    void start();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with a key.");
    }
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike starts with a self-start button.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start(); // Output: Car starts with a key.

        Vehicle myBike = new Bike();
        myBike.start(); // Output: Bike starts with a self-start button.
    }
}
```
#### Interface with Default and Static Methods (Java 8+)
From Java 8, interfaces can have default and static methods with implementation.
```
interface Printer {
    void print();

    // Default method with implementation
    default void show() {
        System.out.println("Default method in interface.");
    }

    // Static method in interface
    static void staticMethod() {
        System.out.println("Static method in interface.");
    }
}

class InkjetPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing using Inkjet Printer.");
    }
}

public class Main {
    public static void main(String[] args) {
        Printer myPrinter = new InkjetPrinter();
        myPrinter.print();
        myPrinter.show(); // Calling default method

        Printer.staticMethod(); // Calling static method (using interface name)
    }
}
```
Output:
```
Printing using Inkjet Printer.
Default method in interface.
Static method in interface.
```
### Multiple Inheritance Using Interfaces
Java does not support multiple inheritance with classes, but it supports multiple inheritance with interfaces.
```
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

// A class implementing multiple interfaces
class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }
}

public class Main {
    public static void main(String[] args) {
        Duck myDuck = new Duck();
        myDuck.fly();
        myDuck.swim();
    }
}
```
Output:
```
Duck is flying.
Duck is swimming.
```
### Interface vs Abstract Class
| Feature	| Interface	| Abstract Class |
|---------------|---------------|----------------|
| Methods	|Only abstract methods (before Java 8)|	Can have both abstract and concrete methods|
| Fields	|Only constants (public static final)|	Can have instance variables|
| Access Modifiers	|Methods are public by default|	Can have any access modifier|
| Inheritance	|Supports multiple inheritance (implements)	|Single inheritance (extends)|
| Constructors	|Cannot have constructors	|Can have constructors|
| Default & Static Methods|	Supported from Java 8	|Supported|
### When to Use an Interface?
+ ✔ Use an interface when you want to define a contract that multiple classes should follow.
+ ✔ Use interfaces when you need multiple inheritance in Java.
+ ✔ Use interfaces when you want a class to implement multiple behaviors.

## static

### static Keyword in Java
The static keyword in Java is used for memory management. It can be applied to variables, methods, blocks, and nested classes. When a member is declared as static, it belongs to the class rather than instances of the class.

### 1️⃣ Static Variables (Class Variables)
+ A static variable is shared among all instances of the class.
+ It belongs to the class and is stored in the method area (not heap).
+ Only one copy of a static variable exists, regardless of the number of objects created.
Example:
```
class Student {
    int rollNo; // Instance variable
    String name;
    static String college = "AccioJob"; // Static variable (shared)

    // Constructor
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    // Method to display values
    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Prachi");
        Student s2 = new Student(102, "Rahul");

        s1.display();
        s2.display();

        // Changing the static variable affects all objects
        Student.college = "IIT Delhi";

        s1.display();
        s2.display();
    }
}
```
Output:
```
101 Prachi AccioJob
102 Rahul AccioJob
101 Prachi IIT Delhi
102 Rahul IIT Delhi
```
+ 🔹 college is static, so changing it affects all objects.

2️⃣ Static Methods
A static method belongs to the class, not to instances.
It can be called without creating an object.
It cannot access non-static (instance) variables or methods.
Example:
```
class Utility {
    // Static method
    static void showMessage() {
        System.out.println("Hello, this is a static method!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Calling static method without creating an object
        Utility.showMessage();
    }
}
```
Output:
```
Hello, this is a static method!
```
+ 🔹 Restrictions of Static Methods:

+ Cannot access non-static variables or methods directly.
+ Cannot use this or super keywords.
### 3️⃣ Static Block
+ A static block is used to initialize static data members.
+ It is executed only once when the class is loaded.
Example:
```
class Test {
    static int num;

    // Static block
    static {
        num = 100;
        System.out.println("Static block executed!");
    }

    // Constructor
    Test() {
        System.out.println("Constructor executed!");
    }
}

public class Main {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
    }
}
```
Output:
```
Static block executed!
Constructor executed!
Constructor executed!
```
+ 🔹 Key Points:

+ The static block executes once when the class is loaded.
+ The constructor executes every time an object is created.

### 4️⃣ Static Nested Class
A static nested class can be created inside another class.
It can access only static members of the outer class.
Example:
```
class Outer {
    static int data = 50;

    // Static nested class
    static class Inner {
        void show() {
            System.out.println("Data: " + data);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner(); // Creating object of static nested class
        obj.show();
    }
}
```
Output:
```
Data: 50
```
+ 🔹 A static nested class does not require an instance of the outer class.

#### Summary Table
|Feature	|static Behavior|
|--------------|----------------|
|Static Variable|	Shared among all objects of the class|
|Static Method|	Belongs to the class, cannot access instance members directly|
|Static Block|	Executes once when the class is loaded|
\Static Nested Class|	Can access only static members of the outer class|
### When to Use static?
+ ✔ When you need a shared variable or method for all objects.
+ ✔ When you want a utility method that doesn’t depend on instance variables.
+ ✔ When you want a nested class that doesn’t require an outer class instance.
