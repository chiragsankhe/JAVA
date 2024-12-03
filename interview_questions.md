## What is Java? 
```
Java is a high-level programming language that was developed by James Gosling in the year 1982.
It is based on the principles of object-oriented programming and can be used to develop large-scale applications
```
## 2  Why is Java a platform independent language?
```
Java language was developed so that it does not depend on any hardware or software because the compiler compiles the code and then converts it to platform-independent byte code which can be run on multiple systems.

The only condition to run that byte code is for the machine to have a runtime environment (JRE) installed in it.
```

## 3. Why is Java not a pure object oriented language?
```
Java supports primitive data types - byte, boolean, char, short, int, float, long, and double and
 hence it is not a pure object oriented language.
```
## pure object-oriented programming

A pure object-oriented programming (OOP) language is one where everything is treated as an object, including primitives like integers, characters, and booleans. In such languages, all functionalities are performed through objects, and there is no distinction between primitive and non-primitive types.

#### Characteristics of Pure OOP Languages:
- `Everything is an Object:` Even primitive data types and functions are treated as objects.
- `Encapsulation:` Data and methods are bundled together.
- `Inheritance:` Objects can inherit properties and behaviors from other objects.
- `Polymorphism:` The ability to define methods in different forms.
- `Abstraction:` Objects hide the internal implementation details.
- `No Standalone Functions:` All functions are part of some object.
#### Examples of Pure Object-Oriented Languages:
- `Smalltalk:` Considered the closest to a pure object-oriented language because everything, including control structures and numbers, is an object.
- `Ruby:` Treats everything as an object but is slightly less strict than Smalltalk.
#### Why Java is Not Pure:
Java is considered not purely object-oriented because:

It includes primitive data types (e.g., int, char, boolean) that are not objects.
It allows for static methods, which are not part of an object.
Some operations, like arithmetic (+, -, etc.), are not method calls on objects.
#### Why Pure OOP is Rare:
Pure OOP languages can sometimes be inefficient or overly restrictive for certain tasks, like mathematical computations, where using primitive types directly is faster. As a result, most modern OOP languages, like Java and Python, are a mix of object-oriented and procedural programming styles to balance efficiency with OOP principles.

## What is the difference between JDK and JRE?

`JDK (Java Development Kit):`
```
A software development environment used to develop Java applications and applets.
Includes JRE, compilers (e.g., javac), debugging tools, and other development tools.
Required for writing and compiling Java code.
```
`JRE (Java Runtime Environment):`
```
Provides the runtime environment for executing Java programs.
Includes the JVM and class libraries but lacks development tools like compilers.
Required to run Java applications but not to develop them.
```
## What is Java Virtual Machine (JVM)?
JVM is an abstract computing machine that enables a computer to run Java programs.
``` Functions of JVM:```
Converts bytecode (compiled Java code) into machine code.
Provides a runtime environment to execute Java applications.
Manages memory (garbage collection, stack, heap, etc.) and ensures platform independence.

## What are the different types of memory areas allocated by JVM?
`Method Area:`
Stores class metadata, constants, static variables, and method code.
` Heap: `
Used for dynamic memory allocation; stores objects and JRE classes.
` Stack:`
Each thread has its own stack. It stores method call frames, local variables, and partial results.
`Program Counter Register:`
A small memory area that holds the address of the currently executing Java bytecode instruction.
`Native Method Stack:`
Stores data for native (non-Java) methods used in the application.
## What is JIT compiler?
`JIT (Just-In-Time) Compiler:`

A part of the JVM that improves the performance of Java applications by compiling bytecode into native machine code at runtime.
Converts frequently executed bytecode into machine code for faster execution.
Operates in parallel with the interpreter.

## How is the Java platform different from other platforms?
```
Java is a platform-independent language, meaning it can run on any platform with a JVM.
It relies on the Java Runtime Environment (JRE) and JVM to abstract platform-specific details.
Unlike native platforms (e.g., Windows, Linux), Java uses bytecode, which is interpreted or compiled by the JVM.
```
## Why do people say that Java is a 'write once, run anywhere' language?
```
Java achieves platform independence by compiling source code into bytecode.
The bytecode is not tied to a specific machine or operating system; it can run on any device equipped with a JVM.
This eliminates the need to rewrite or recompile code for different platforms.
```
## How does ClassLoader work in Java?
The ClassLoader is a part of the JVM responsible for loading classes at runtime.

It reads the .class files and converts them into objects used by the JVM.

#### Types of ClassLoaders:

`Bootstrap ClassLoader:`
Loads core Java classes (from rt.jar or the Java standard libraries).
`Extension ClassLoader:`
Loads classes from the Java Extensions directory (lib/ext).
`Application ClassLoader:`
Loads classes from the application's classpath.
`Working Process:`

-It first checks if the class is already loaded.
-If not, it delegates the task to its parent ClassLoader in a parent-delegation model.
-If the parent can't find the class, the current ClassLoader loads it.










## . Difference between Heap and Stack Memory in java. And how java utilizes this.
```
Stack memory is the portion of memory that was assigned to every individual program.
And it was fixed. On the other hand, Heap memory is the portion that was not allocated to the java program
but it will be available for use by the java program when it is required, mostly during the runtime of the program.
```
