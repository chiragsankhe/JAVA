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

















## 4. Difference between Heap and Stack Memory in java. And how java utilizes this.
```
Stack memory is the portion of memory that was assigned to every individual program.
And it was fixed. On the other hand, Heap memory is the portion that was not allocated to the java program
but it will be available for use by the java program when it is required, mostly during the runtime of the program.
```
