
## Variable , data type and  taking input 


1. What is a variable in Java?
+	Answer:
A variable in Java is a container that holds data that can be changed during the execution of a program. It acts as a storage location in memory with a specific data type.

2. What are the different types of variables in Java?
+ Answer:
   There are three types of variables in Java:
1.	`Local Variables`: Declared inside a method, constructor, or block.
2.	`Instance Variables`: Declared in a class but outside of methods, constructors, or blocks (non-static fields).
3.	`Static Variables`: Declared with the static keyword and shared across all instances of a class.
________________________________________
3. What are the eight primitive data types in Java?
+ Answer:
  
1.	!byte`: 8-bit integer (Range: -128 to 127)
2.	`short`: 16-bit integer (Range: -32,768 to 32,767)
3.	`int`: 32-bit integer (Range: -2^31 to 2^31-1)
4.	`long`: 64-bit integer (Range: -2^63 to 2^63-1)
5.	`float`: 32-bit floating point
6.	`double`: 64-bit floating point
7.	`char`: 16-bit Unicode character
8.	`boolean`: true/false values

4. What is the default value of a local variable?
+	Answer: Local variables do not have a default value in Java. They must be initialized before use, otherwise, the compiler will throw an error.
________________________________________
5. What is typecasting in Java?
+	Answer: Typecasting is converting one data type into another. There are two types:

1.	`Implicit Typecasting (Widening)`: Automatic conversion of a smaller data type to a larger data type (e.g., int to double).
2.	`Explicit Typecasting (Narrowing)`: Manually converting a larger data type to a smaller data type (e.g., double to int).
________________________________________
6. What is the difference between float and double?
+	Answer:
+	float is a single-precision 32-bit floating-point data type, while double is a double-precision 64-bit floating-point data type.
+	double has a greater precision and can store larger decimal values compared to float.
________________________________________

7. How do you take input from the user in Java?
   
To take input from the user, Java provides the Scanner class, which is part of the java.util package.
- Example:
```
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for an integer
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Taking input for a string
        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.println("You entered: " + number + " and " + name);
    }
}
```
8.  What is the difference between next() and nextLine() methods of Scanner class?
+ `next()`: Reads input till the first space or whitespace is encountered. It’s used to read a single word.
+ `nextLine()`: Reads the entire line of input (including spaces) until the user hits the Enter key.

9. What is the default value of variables in Java?
+	`Local variables`: No default value. They must be initialized before use.
+	`Instance variables`: Default values depend on the data type:
-	int = 0
-	double = 0.0
-	char = '\u0000'
-	boolean = false
-	Object references (non-primitives) = null
  
10. Can a variable name start with a number in Java?
No, variable names in Java cannot start with a number. They must start with a letter (A-Z or a-z), a dollar sign ($), or an underscore (_).

11. What is the difference between primitive and reference data types?
•	`Primitive types`: Store the actual values (e.g., int, char, boolean).
•	`Reference types`: Store references (addresses) to objects or arrays. Examples are String, arrays, and user-defined objects.

12. Here are the key differences between float and double in Java:
    
1. Size:
-	float: 4 bytes (32 bits)
-	double: 8 bytes (64 bits)
2. Precision:
-	float: Single precision, which gives approximately 6-7 decimal digits of accuracy.
-	double: Double precision, which gives approximately 15-16 decimal digits of accuracy.
3. Range:
-	float: Can represent numbers roughly between 1.4×10−451.4 \times 10^{-45}1.4×10−45 to 3.4×10383.4 \times 10^{38}3.4×1038.
-	double: Can represent numbers roughly between 4.9×10−3244.9 \times 10^{-324}4.9×10−324 to 1.7×103081.7 \times 10^{308}1.7×10308.
4. Default Type:
-	double is the default type for decimal numbers in Java. If you write a number with a decimal point without specifying the type, Java assumes it is a double. To specify a float, you need to add an `F` or `f`at the end of the value.
+ Example:
```
float f = 3.14F;   // Float literal
double d = 3.14;   // Double literal (default)
```
5. Use Cases:
-	float: Used when memory savings are more critical than precision (e.g., in large arrays of floating-point numbers).
-	double: Preferred when higher precision is required, such as in scientific computations.
6. Performance:
•	On some processors, float operations might be slightly faster than double because of the smaller size. However, in most modern systems, double is typically used because of its better precision and the performance difference is often negligible

13. the import statements

```
import java.util.*;
import java.lang.*;
import java.io.*;
```

In Java, the import statements are used to bring various classes, packages, or entire libraries into your code so that you can use their functionalities without having to specify their full package names. Here's when and why you would use each of the import statements you mentioned:

1. import java.util.*;
-	`Purpose`: Imports all the classes from the java.util package.
-	`Common Uses`: You would use this when you need to work with utility classes such as:
-	ArrayList, HashMap, HashSet, LinkedList, etc.
-	Date, Calendar, Random, Scanner, etc.
•	Example:

```
import java.util.ArrayList;
import java.util.HashMap;

public class Example {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
    }
}
```
2. import java.lang.*;
-	Purpose: Imports all the classes from the java.lang package.
-	Common Uses: The java.lang package is automatically imported by default, so you generally don't need to explicitly import it. It includes fundamental classes like:
-	String, Math, Integer, System, Thread, Exception, etc.
	Example:

```
public class Example {
    public static void main(String[] args) {
        String str = "Hello, world!";
        int result = Math.max(10, 20);
    }
}
```
3. import java.io.*;
-	Purpose: Imports all the classes from the java.io package.
-	Common Uses: You would use this when working with input and output operations, such as:
-	File handling with File, FileReader, FileWriter, BufferedReader, BufferedWriter, etc.
-	Streams like InputStream, OutputStream, ObjectInputStream, ObjectOutputStream, etc.
•	Example:

```
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Example {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Hello, world!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
## Summary:
-	java.util.*: For utility classes like collections, dates, and random number generation.
-	java.lang.*: For fundamental classes like String, Math, and System (automatically imported).
-	java.io.*: For input and output operations, including file handling and stream processing. 


## Operators &   Conditionals

Operators in Java are special symbols that perform operations on variables and values. Java supports several types of operators, categorized into different groups based on the type of operation they perform.

### Arithmetic Operators
These operators perform basic mathematical operations.
Operator	Description	Example
+ +	`Addition`	a + b
+ -	`Subtraction`	a - b
+ *	`Multiplication`	a * b
+ /	`Division`a / b
+ %	`Modulus` (remainder)	a % b

Example:
```
int a = 10, b = 3;
System.out.println(a + b);  // Output: 13
System.out.println(a % b);  // Output: 1
```
________________________________________
### Relational (Comparison) Operators

These operators compare two values and return a boolean result (true or false).
Operator	Description	Example
+ ==	Equal to	a == b
+ !=	Not equal to	a != b
+ >	Greater than	a > b
+ <	Less than	a < b
+ >=	Greater than or equal to	a >= b
+ <=	Less than or equal to	a <= b

Example:
```
int a = 10, b = 20;
System.out.println(a > b);  // Output: false
System.out.println(a <= b); // Output: true
```
________________________________________
### Logical Operators

These operators perform logical operations on boolean expressions.
Operator	Description	Example
+ &&	Logical AND (true if both are true)	a && b
+ || lofical OR (if 1 true from two)	a || b	
+ !	Logical NOT (negates the boolean value)	!a
```
boolean a = true, b = false;
System.out.println(a && b);  // Output: false
System.out.println(a || b);  // Output: true
System.out.println(!a);      // Output: false
```
________________________________________
###  Assignment Operators
These operators are used to assign values to variables.
Operator	Description	Example
+ =	Assigns value	a = 5
+ +=	Adds and assigns	a += 5 (same as a = a + 5)
+ -=	Subtracts and assigns	a -= 5
+ *=	Multiplies and assigns	a *= 5
+ /=	Divides and assigns	a /= 5
+ %=	Modulus and assigns	a %= 5

```
int a = 10;
a += 5;  // Now a is 15
System.out.println(a);
```
________________________________________
### Increment and Decrement Operators

These operators are used to increment or decrement a value by 1.
Operator	Description	Example
+ ++	Increment (adds 1)	a++ or ++a
+ --	Decrement (subtracts 1)	a-- or --a

-	a++ (Post-increment): Value is used first, then incremented.
-	++a (Pre-increment): Value is incremented first, then used.

```
int a = 5;
System.out.println(a++);  // Output: 5 (then a becomes 6)
System.out.println(++a);  // Output: 7 (a is incremented before print)
```
________________________________________
### Bitwise Operators
These operators perform operations on bits and are useful for low-level programming.
Operator	Description	Example
+ &	Bitwise AND	a & b
+ `	`	Bitwise OR
+ ^	Bitwise XOR	a ^ b
+ ~	Bitwise Complement	~a
+ <<	Left Shift	a << 2
+ >>	Right Shift	a >> 2
+ >>>	Unsigned Right Shift	a >>> 2
Example:
java
Copy code
int a = 5; // Binary: 0101
int b = 3; // Binary: 0011

System.out.println(a & b);  // Output: 1 (Binary: 0001)
System.out.println(a | b);  // Output: 7 (Binary: 0111)
________________________________________
### Ternary (Conditional) Operator
The ternary operator is a shorthand for if-else conditions. It has the form:

`condition ? value_if_true : value_if_false;`
```
int a = 10, b = 20;
int max = (a > b) ? a : b;
System.out.println(max);  // Output: 20
```
________________________________________


1.	What are conditionals in Java?
+ Answer:-
Conditionals in Java refer to statements that allow the program to make decisions and execute different code paths based on certain conditions. These include `if`, `if-else`, `if-else if`, and `switch` statements.

2. Explain the if-else statement in Java with an example.
+ Answer:
  The if-else statement evaluates a condition, and if the condition is true, it executes the block of code inside the if statement. If it is false, the code inside the else block is executed.
•	Example:
```
int num = 10;
if (num > 0) {
    System.out.println("Positive number");
} else {
    System.out.println("Negative number");
}
```
3. Can you nest if-else statements in Java?

+ Answer: Yes, you can nest if-else statements, meaning you can place an if-else statement inside another if-else statement to check multiple conditions.

4. What is the difference between if-else and switch statements?
	Answer:
-	if-else is used to evaluate boolean expressions and can work with conditions involving logical operators.
-	switch is more suitable when comparing a single variable against a set of constants, usually for equality checks.
-	if-else can handle complex conditions, while switch is generally more readable when there are multiple possible outcomes for a single variable.

5. Can a switch statement be used with strings in Java?
-	Answer: Yes, starting from Java 7, switch statements can be used with String objects. The switch compares the value of the string against the specified case labels.
•	Example:
```
String day = "Monday";
switch (day) {
    case "Monday":
        System.out.println("Start of the work week");
        break;
    case "Friday":
        System.out.println("End of the work week");
        break;
    default:
        System.out.println("Mid-week");
}
```
6. What will happen if there is no break statement in a switch case?
+ Answer: If the break statement is omitted in a switch case, `Java will continue executing the following cases` (fall-through behavior) until it encounters a break or the end of the switch block.


8. What is the difference between == and .equals() in Java conditionals?
   
+ Answer: == checks for reference equality (whether two object references point to the same object), while .equals() checks for value equality (whether two objects are meaningfully equal). For primitive types, == checks value equality.
  
10. How do logical operators work with conditionals in Java?
    
+Answer: Logical operators (&&, ||, and !) are used in conjunction with conditionals to combine multiple conditions or to negate conditions.
+	&& (AND): Returns true if both conditions are true.
+	|| (OR): Returns true if at least one condition is true.
o+	! (NOT): Reverses the result of the condition.

12. Explain the switch statement limitations in Java.
    
-	Answer: The switch statement has the following limitations:
-	It can only work with byte, short, int, char, String, and enums.
-	It doesn't support floating-point numbers (float or double).
-	It evaluates based on exact matches only and cannot handle complex boolean expressions or ranges

14. how you can use the Scanner class to take input for different types of                  variables:
+ Int
  
int num = scn.nextInt();
+ double
  
double d = scn.nextDouble();

+ String for single word
  
String str = scn.next();

+ String for entire line
  
String line = scn.nextLine();
+ Char  for single charater
  
char ch = scn.next().charAt(0);


## loop
.
1. What are the types of loops in Java?
-	Answer: Java provides three types of loops:
-	`for loop`: Used when the number of iterations is known.
-	`while loop`: Used when the number of iterations is unknown, and it checks the condition before entering the loop.
-	`do-while loop`: Similar to the while loop but checks the condition after executing the loop at least once.

2. What is the difference between for loop and while loop?
•	Answer:
-	`for loop`: Best used when the number of iterations is known. It initializes, checks the condition, and increments in one line.
-	`while loop`: Best when the number of iterations is unknown. It only checks the condition before entering the loop and iterates as long as the condition is true.

3. Explain the structure of a for loop in Java.
•	Answer:
```
for (initialization; condition; update) {
    // Code to be executed
}
```
Example:
```
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```
4. Can you write an example of a while loop in Java?
•	Answer:
```
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```
5. What is the difference between while and do-while loops?
•	Answer:
-	In a while loop, the condition is checked before entering the loop.
-	In a do-while loop, the condition is checked after executing the loop body, so the loop will always execute at least once.
Example of do-while loop:
```
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```
6. How can you exit a loop prematurely in Java?
-	Answer: You can use the break statement to exit a loop prematurely. It is often used when a certain condition is met inside the loop.
Example:
```
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break;  // Loop terminates when i equals 5
    }
    System.out.println(i);
}
```
7. What is the continue statement in Java loops?
•	Answer: The continue statement skips the current iteration of a loop and proceeds with the next iteration.
Example:
```
for (int i = 0; i < 5; i++) {
    if (i == 2) {
        continue;  // Skip the current iteration when i equals 2
    }
    System.out.println(i);
}
```
8. How can you implement an infinite loop in Java?
•	Answer: An infinite loop can be created by omitting the loop condition or making the condition always true. Be careful with infinite loops as they can make the program unresponsive.
Example:
```
while (true) {
    // Infinite loop
}
```
9. How do nested loops work in Java?
•	Answer: A nested loop is a loop inside another loop. The inner loop will run completely for each iteration of the outer loop.
Example:
```
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 2; j++) {
        System.out.println("i: " + i + ", j: " + j);
    }
}
```
10. What is the time complexity of nested loops?
•	Answer: The time complexity of a nested loop is the product of the complexities of the individual loops. For example, if both loops run n times, the time complexity is `O(n²)`.

11. How do you loop over an array using a for-each loop in Java?
•	Answer: The for-each loop is used to iterate over arrays or collections.
Example:
```
int[] numbers = {1, 2, 3, 4, 5};
for (int num : numbers) {
    System.out.println(num);
}
```
12. What happens if you omit the initialization, condition, or update expressions in a for loop?
•	Answer:
-	Omitting initialization or update makes the loop still valid; you just need to handle initialization and updates inside the loop.
-	Omitting the condition makes the loop infinite (since the condition defaults to true).
Example (infinite loop by omitting the condition):
```
for (int i = 0; ; i++) {
    System.out.println(i);
}
```
13. How can you iterate over a collection in Java?
•	Answer: You can use a for-each loop or an Iterator to iterate over a collection.
Example using for-each:
```
List<String> list = Arrays.asList("A", "B", "C");
for (String item : list) {
    System.out.println(item);
}
```
14. Can you use a for loop with multiple variables in Java?
•	Answer: Yes, a for loop can use multiple variables by separating them with commas in the initialization and update expressions.
Example:
```
for (int i = 0, j = 10; i < j; i++, j--) {
    System.out.println("i: " + i + ", j: " + j);
}
```
15. How do you reverse a for loop in Java?
+	Answer: You can reverse a for loop by adjusting the initialization, condition, and update expressions.
Example:
```
for (int i = 5; i >= 0; i--) {
    System.out.println(i);


}
```

## array


1. What is an array in Java?
+ Answer: An array in Java is a data structure that stores a fixed-size sequence of elements of the same type. The elements are stored in contiguous memory locations, and the size of an array is fixed once it is created.
```
Copy code
int[] arr = new int[5];  // Array of size 5
```
2. How do you declare and initialize an array in Java?
+ Answer: Arrays can be declared by specifying the type followed by square brackets. Arrays can be initialized either at the time of declaration or separately.
Examples:
+ Declaration without initialization:
```
int[] arr;  // Declares an array variable
arr = new int[5];  // Initializes the array with size 5
```
+ Declaration and initialization:
```
int[] arr = new int[]{1, 2, 3, 4, 5};  // Initializes an array with elements
```
3. What is the default value of elements in an array?
Answer:
+	Primitive types (e.g., int, char, boolean):
+	int[] and double[]: 0
+	boolean[]: false
+	char[]: \u0000 (null character)
+	Object types: All elements are null by default.
Example:
```
int[] intArr = new int[5];  // All elements will be initialized to 0
boolean[] boolArr = new boolean[5];  // All elements will be initialized to false
```
4. How do you find the length of an array in Java?
+ Answer: You can find the length of an array using the .length attribute.
Example:
```
int[] arr = {1, 2, 3, 4, 5};
System.out.println(arr.length);  // Output: 5
```
5. How do you iterate over an array in Java?
+ Answer: You can iterate over an array using a for loop or an enhanced for-each loop.
Examples:
  + Using a for loop:
```
int[] arr = {1, 2, 3, 4, 5};
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```
+ Using an enhanced for loop:
```
for (int num : arr) {
    System.out.println(num);
}
```
6. What is a multi-dimensional array in Java?
Answer: A multi-dimensional array is an array of arrays. The most common form is a two-dimensional array (a matrix), but you can have arrays with more dimensions.
Example of a 2D array:
```
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

// Accessing an element in a 2D array
System.out.println(matrix[1][2]);  // Output: 6
7. What is the difference between a one-dimensional array and a two-dimensional array?
Answer:
+	`One-dimensional array`: A linear sequence of elements.
+	`Two-dimensional array`: A grid of elements, represented as an array of arrays. It is often used to represent a matrix or table.
Examples:
+ One-dimensional array:
```
int[] arr = {1, 2, 3, 4, 5};
```
+ Two-dimensional array:
```
int[][] arr = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```
8. How do you copy an array in Java?
Answer: You can copy an array using methods like `System.arraycopy()`,` Arrays.copyOf()`, or manually using a loop.
Examples:
+ Using System.arraycopy():
```
int[] sourceArray = {1, 2, 3, 4, 5};
int[] destArray = new int[5];
System.arraycopy(sourceArray, 0, destArray, 0, 5);
```
+ Using Arrays.copyOf():
```
int[] sourceArray = {1, 2, 3, 4, 5};
int[] copiedArray = Arrays.copyOf(sourceArray, sourceArray.length);
```
9. What is the difference between length in arrays and length() in strings?
Answer:
•	For `arrays`, `length` is a property that gives the number of elements in the array.
•	For `strings`, `length()` is a method that returns the number of characters in the string.
Examples:
```
int[] arr = {1, 2, 3, 4, 5};
System.out.println(arr.length);  // Output: 5
```
```
String str = "Hello";
System.out.println(str.length());  // Output: 5
```
10. Write a Java program to reverse an array.
Answer:
```
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        // Print the reversed array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
Output:
Copy code
5 4 3 2 1
```
11. What is a Jagged Array in Java?
Answer: A jagged array is an array of arrays where the subarrays can have different lengths. It is not a true multi-dimensional array because the length of each row can vary.
Example:
```
int[][] jaggedArray = {
    {1, 2},
    {3, 4, 5},
    {6, 7, 8, 9}
};
```
12. How do you sort an array in Java?
Answer: You can use `Arrays.sort()` to sort an array in ascending order.
Example:
```
int[] arr = {5, 2, 8, 7, 1};
Arrays.sort(arr);  // Sorts the array in ascending order
for (int i : arr) {
    System.out.print(i + " ");
}
Output:
Copy code
1 2 5 7 8
```
13. How do you find the largest and smallest element in an array?
+ Answer: You can loop through the array and keep track of the largest and smallest elements.
Example:
```
public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {12, 34, 56, 78, 99, 23};
        int max = arr[0];
        int min = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);
    }
}
Output:
makefile
Copy code
Largest: 99
Smallest: 12
```
14. What is an ArrayIndexOutOfBoundsException in Java?
Answer: An `ArrayIndexOutOfBoundsException` occurs when you try to access an index that is outside the bounds of the array. In Java, array indices start at `0 and go up to length - 1`. Trying to access an index outside this range will throw the exception.
Example:
```
             0  1  2 
int[] arr = {1, 2, 3};
System.out.println(arr[3]);  // Throws ArrayIndexOutOfBoundsException
```

## Math class 

The Math class in Java is a part of the java.lang package, and it provides a collection of static methods for performing basic numeric operations such as exponentiation, logarithms, trigonometry, and more. Since all methods in the Math class are static, you don't need to create an instance of the Math class to use them—you can directly call the methods on the class itself.
### Key Features of the Math Class:
+ Basic arithmetic operations (e.g., `abs()`, `max()`, `min()`, `sqrt()`)
+ Exponentiation (`pow()`, `exp()`)
+ Trigonometric functions (`sin()`, `cos()`, `tan()`)
+ Logarithmic functions (`log()`, `log10()`)
+ Rounding functions (ceil(), floor(), round())
### Types of Functions in the Math Class:
#### Arithmetic Functions: These methods provide basic operations like absolute value, min, max, and square roots.
+	`Math.abs()` – Returns the absolute value of a number.
```
Math.abs(-5);  // returns 5
```
+ `Math.max()` and `Math.min() `– Returns the maximum or minimum of two values.
```
Math.max(10, 20);  // returns 20
Math.min(10, 20);  // returns 10
```
+ `Math.sqrt()` – Returns the square root of a number.
```
Math.sqrt(16);  // returns 4.0
```
#### Exponential and Logarithmic Functions: These methods perform exponentiation and logarithmic operations.
+ `Math.pow()` – Raises a number to the power of another number.
```
Math.pow(2, 3);  // returns 8.0
```
+ `Math.exp()` – Returns Euler's number eee raised to the power of a given number.
```
Math.exp(1);  // returns 2.718281828459045 (value of e)
```
+ `Math.log()` – Returns the natural logarithm (base eee) of a value.
```
Math.log(2.71828);  // returns approximately 1
```
+ `Math.log10()` – Returns the logarithm base 10 of a value.
```
Math.log10(100);  // returns 2.0
```
#### Trigonometric Functions:
The Math class provides methods for sine, cosine, tangent, and other trigonometric operations. These methods take radians as input.
+ Math.sin() – Returns the sine of a value.
```
Math.sin(Math.PI / 2);  // returns 1.0
```
+ Math.cos() – Returns the cosine of a value.
```
Math.cos(Math.PI);  // returns -1.0
```
+ Math.tan() – Returns the tangent of a value.
```
Math.tan(Math.PI / 4);  // returns 1.0
```
+ `Math.toRadians()` and `Math.toDegrees() `– Converts degrees to radians and vice versa.
```
Math.toRadians(180);  // returns 3.141592653589793 (π)
Math.toDegrees(Math.PI);  // returns 180.0
```
#### Rounding Functions:
 These methods round floating-point numbers to the nearest integer or specific value.
+ `Math.round()` – Rounds a floating-point number to the nearest long or int.
```
System.out.println(Math.round(5.4));   // Output: 5
System.out.println(Math.round(5.5));   // Output: 6
System.out.println(Math.round(5.9));   // Output: 6
System.out.println(Math.round(-5.5));  // Output: -5
Math.round(2.5);  // returns 3
```
+ `Math.ceil()` – Rounds a number upward to the nearest integer (towards positive infinity).
```
Math.ceil(2.1);  // returns 3.0
```
+ `Math.floor()` – Rounds a number downward to the nearest integer (towards negative infinity).
```
Math.floor(2.9);  // returns 2.0
```
#### `Random Number Generation`: The Math.random() method returns a pseudorandom number between 0.0 (inclusive) and 1.0 (exclusive).
+ `Math.random()`
```
double randomValue = Math.random();  // returns a value between 0.0 and 1.0
```
+ If you want a random integer within a range, you can scale the result of Math.random():
```
int randomInt = (int)(Math.random() * 10);  // random number between 0 and 9
```
#### Hyperbolic Functions: These methods calculate hyperbolic sine, cosine, and tangent.
+ `Math.sinh()` – Returns the hyperbolic sine of a value.
```
Math.sinh(1);  // returns 1.1752011936438014
```
+ `Math.cosh()` – Returns the hyperbolic cosine of a value.
```
Math.cosh(1);  // returns 1.5430806348152437
```
+ `Math.tanh()` – Returns the hyperbolic tangent of a value.
```
Math.tanh(1);  // returns 0.7615941559557649
```
#### Sign-Related Functions: These methods deal with the sign of the value.
+	Math.signum() – Returns the sign of a number: -1.0 for negative, 1.0 for positive, or 0.0 for zero.
```
Math.signum(-5.0);  // returns -1.0
```
#### Special Constants: The Math class defines some useful mathematical constants:
+ `Math.PI` – The value of π (approximately 3.14159).
+ `Math.E` – The value of eee (approximately 2.71828).
Example:
```
System.out.println(Math.PI);  // Output: 3.141592653589793
System.out.println(Math.E);   // Output: 2.718281828459045
```
Example of Using the Math Class:
Here is a sample program that demonstrates a few common methods of the Math class:
java
Copy code
```
public class MathExample {
    public static void main(String[] args) {
        // Arithmetic operations
        int max = Math.max(10, 20);
        double sqrt = Math.sqrt(16);
        double power = Math.pow(2, 3);

        // Trigonometric operations
        double radians = Math.toRadians(90);
        double sine = Math.sin(radians);

        // Rounding operations
        double ceilValue = Math.ceil(2.3);
        double floorValue = Math.floor(2.7);

        // Random number
        double random = Math.random();

        // Output the results
        System.out.println("Max: " + max);
        System.out.println("Square Root: " + sqrt);
        System.out.println("2^3: " + power);
        System.out.println("Sine of 90 degrees: " + sine);
        System.out.println("Ceil of 2.3: " + ceilValue);
        System.out.println("Floor of 2.7: " + floorValue);
        System.out.println("Random Number: " + random);
    }
```
## Subarray

+ Here are some common subarray-related interview questions, along with explanations and examples:
1. Find the Maximum Sum of a Subarray (Kadane’s Algorithm)
Question: Given an array of integers, find the subarray with the maximum sum.
Approach:
•	Use Kadane’s Algorithm to solve this problem efficiently in O(n) time.
•	Keep track of the current subarray sum and the maximum sum found so far.
Example:
java
Copy code
```
public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = findMaxSum(arr);
        System.out.println("Maximum subarray sum is " + maxSum);
    }

    public static int findMaxSum(int[] arr) {
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
Output:
python
Copy code
Maximum subarray sum is 6

In this case, the subarray [4, -1, 2, 1] has the maximum sum.
```
3. Find the Length of the Longest Subarray with Sum K
Question: Given an array of integers, find the length of the longest subarray whose sum is equal to a given value K.
Approach:
•	Use a HashMap to store the cumulative sum at each index.
•	If the cumulative sum minus K is found in the map, calculate the length of the subarray.
Example:
```
import java.util.HashMap;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int K = 15;
        int maxLength = findMaxLength(arr, K);
        System.out.println("Length of the longest subarray with sum " + K + " is " + maxLength);
    }

    public static int findMaxLength(int[] arr, int K) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == K) {
                maxLength = i + 1;
            }

            if (map.containsKey(sum - K)) {
                maxLength = Math.max(maxLength, i - map.get(sum - K));
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLength;
    }
}
Output:
python
Copy code
Length of the longest subarray with sum 15 is 4
The subarray [5, 2, 7, 1] has a sum of 15 and a length of 4.
```
3. Find the Minimum Size Subarray with Sum ≥ S
+ Question: Given an array of integers and a target sum S, find the minimum length of a subarray that has a sum greater than or equal to S.
Approach:
+ Use a sliding window technique. Maintain a window that adjusts when the sum becomes greater than or equal to S.
Example:
java
Copy code
```
public class MinSizeSubarraySum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int S = 7;
        int minLength = findMinLength(arr, S);
        System.out.println("Minimum length subarray with sum ≥ " + S + " is " + minLength);
    }

    public static int findMinLength(int[] arr, int S) {
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum >= S) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= arr[left++];
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}
Output:
python
Copy code
Minimum length subarray with sum ≥ 7 is 2

The subarray [4, 3] has a sum of 7 and a length of 2.
```
5. Count the Number of Subarrays with Sum Exactly K
Question: Given an array of integers, count the number of subarrays that sum up to a given value K.
Approach:
+ Use a HashMap to store cumulative sums and their frequencies.
+ For each cumulative sum, check if there is a previous cumulative sum that when subtracted gives K.
Example:
java
Copy code
```
import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1};
        int K = 2;
        int count = countSubarraysWithSumK(arr, K);
        System.out.println("Number of subarrays with sum " + K + " is " + count);
    }

    public static int countSubarraysWithSumK(int[] arr, int K) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        map.put(0, 1);  // To handle the case where the subarray starts from index 0

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum - K)) {
                count += map.get(sum - K);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
Output:
python
Copy code
Number of subarrays with sum 2 is 2
The subarrays [1, 1] and [1, 1] both have a sum of 2.
```
5. Find Maximum Product Subarray
+ Question: Given an array of integers, find the contiguous subarray that has the largest product.
Approach:
+ Traverse the array, keeping track of the maximum product and the minimum product at each step (since a negative number can flip the max and min products).
+ Update the result with the maximum product found so far.
Example:
```
public class MaxProductSubarray {
    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        int maxProduct = findMaxProduct(arr);
        System.out.println("Maximum product subarray is " + maxProduct);
    }

    public static int findMaxProduct(int[] arr) {
        if (arr.length == 0) return 0;
        
        int maxProduct = arr[0];
        int minProduct = arr[0];
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                // Swap maxProduct and minProduct when arr[i] is negative
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(arr[i], maxProduct * arr[i]);
            minProduct = Math.min(arr[i], minProduct * arr[i]);

            result = Math.max(result, maxProduct);
        }

        return result;
    }
}
Output:
csharp
Copy code
Maximum product subarray is 6
The subarray [2, 3] has the maximum product of 6.
```
________________________________________
### Other Subarray Interview Questions:
+ Find the subarray with the smallest sum.
+ Find the maximum length of a subarray with equal number of 0s and 1s (binary array).
+ Find the number of subarrays where the sum is divisible by a given integer.
+ Find the subarray with the most distinct elements.
These types of subarray questions are commonly asked to test your understanding of different algorithms like sliding window, dynamic programming, and prefix sums.
  
## map fuction in java 
The Map interface in Java provides a way to store key-value pairs, where each key is unique, and each key maps to exactly one value. It is part of the `java.util package`. The Map interface is implemented by various classes like `HashMap`, `TreeMap`, `LinkedHashMap`, and `Hashtable`.
#### Key Characteristics of a Map:
+ `Unique keys`: A map does not allow duplicate keys.
+ `One value per key`: Each key maps to exactly one value, but different keys can map to the same value.
+ `Null keys and values`: Some implementations (like HashMap) allow one null key and multiple null values.
#### Common Map Implementations:
1. `HashMap`: Stores keys and values in an unordered manner using a hash table.
2. `TreeMap`: Stores keys and values in sorted order using a red-black tree.
3. `LinkedHashMap`: Maintains insertion order of keys.
#### Basic Operations in Map:
+ `put(K key, V value)`: Associates the specified value with the specified key in the map.
+ `get(Object key)`: Returns the value to which the specified key is mapped, or null if the map contains no mapping for the key.
+ `remove(Object key)`: Removes the mapping for the specified key.
+ `containsKey(Object key)`: Returns true if the map contains a mapping for the specified key.
+ `containsValue(Object value)`: Returns true if the map maps one or more keys to the specified value.
+ `size()`: Returns the number of key-value mappings in the map.
+ `isEmpty()`: Returns true if the map contains no key-value mappings.
+ `keySet()`: Returns a set view of the keys contained in the map.
+ `values()`: Returns a collection view of the values contained in the map.
+ `entrySet()`: Returns a set view of the key-value pairs contained in the map.
#### Example: Using HashMap
```
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the map
        map.put("Apple", 10);
        map.put("Banana", 15);
        map.put("Orange", 20);

        // Accessing values using keys
        System.out.println("Apple Quantity: " + map.get("Apple"));  // Output: 10
        System.out.println("Banana Quantity: " + map.get("Banana"));  // Output: 15

        // Iterating over the map using entrySet()
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Checking if a key exists
        System.out.println("Contains key 'Apple'? " + map.containsKey("Apple"));  // Output: true

        // Removing a key-value pair
        map.remove("Banana");

        // Checking the size of the map
        System.out.println("Map size: " + map.size());  // Output: 2
    }
}
Output:
rust
Copy code
Apple Quantity: 10
Banana Quantity: 15
Apple -> 10
Banana -> 15
Orange -> 20
Contains key 'Apple'? true
Map size: 2
```
### Iterating through a Map:
You can iterate through a Map in various ways:
+ `Using entrySet()` (recommended for both keys and values):
```
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}
```
+ `Using keySet()` (if you only need keys):
```
for (String key : map.keySet()) {
    System.out.println("Key: " + key);
}
```
+ `Using values()` (if you only need values):
```
for (Integer value : map.values()) {
    System.out.println("Value: " + value);
}
```
### Important Implementations of Map:
1. `HashMap:`
-	Fast lookups (O(1) average time complexity).
-	Does not maintain any order.
-	Allows one null key and multiple null values.
2. `TreeMap`:
-	Sorted by natural order of keys or a custom comparator.
-	Slower lookups (O(log n) due to tree structure).
-	Does not allow null keys, but allows multiple null values.
3. `LinkedHashMap:`
-	Maintains insertion order.
-	Slightly slower than HashMap due to additional linked list structure.
4. `Hashtable`:
o	Synchronized (thread-safe), but slower than HashMap.
o	Does not allow null keys or values.

### Example: Using TreeMap for Sorted Order
```
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();

        // Adding key-value pairs
        treeMap.put("Banana", 15);
        treeMap.put("Apple", 10);
        treeMap.put("Orange", 20);

        // TreeMap sorts the keys in natural order
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
Output:
rust
Copy code
Apple -> 10
Banana -> 15
Orange -> 20
```
### Key Points to Remember:
+ HashMap is unsorted and allows null keys/values.
+ TreeMap is sorted but does not allow null keys.
+ LinkedHashMap maintains insertion order.
+ Use entrySet() for iterating over key-value pairs efficiently
	
 
## 2 D array
Here are some common Java 2D array interview questions that might be useful in your preparation:

1. Traverse a 2D Array:
+ Write a program to traverse and print a 2D array in row-major order (left to right, top to bottom).
+ Follow-up: How would you print in column-major order?
2. Matrix Multiplication:
+ Given two 2D matrices, write a program to multiply them if the number of columns in the first matrix equals the number of rows in the second matrix.
3. Find the Maximum Element in a 2D Array:
+ Write a program to find the maximum element in a 2D array.
4. Search for an Element in a 2D Array:
+ Write a program to search for an element in a 2D array. The array may or may not be sorted.
5. Transpose of a Matrix:
+ Write a program to compute the transpose of a 2D matrix.
6. Diagonal Sum:
+ Write a program to find the sum of the elements on the primary and secondary diagonals of a square 2D matrix.
7.Spiral Order Traversal:
+ Given a 2D array, print the elements in a spiral order starting from the top-left corner of the matrix.
8. Find the Saddle Point of a Matrix:
+ A saddle point in a matrix is an element which is the minimum element in its row and the maximum in its column. Write a program to find the saddle point.
9. Rotate a Matrix by 90 Degrees:
+ Write a program to rotate a 2D matrix by 90 degrees clockwise.
10. Check if a Matrix is Symmetric:
+ Write a program to check if a given 2D matrix is symmetric.
These questions cover both basic operations on 2D arrays as well as some more complex logic. Would you like any particular question to be explored in detail?

## String 
Here are some common Java String interview questions that cover various concepts related to the String class in Java:

1. What is the difference between String, StringBuilder, and StringBuffer?
+ `String`: Immutable, meaning that once a String object is created, it cannot be changed.
+ `StringBuilder`: Mutable, designed for better performance when you need to modify strings (e.g., concatenation). It is not synchronized, so it's faster but not thread-safe.
+ `StringBuffer`: Mutable and synchronized (thread-safe), but slower than StringBuilder.
  
2. Why are strings immutable in Java?
+ String immutability provides `security`, `caching`, and `better performance` in Java. Immutability ensures that a string's value `cannot be altered`, making it `safe` to use in multithreaded environments and as keys in hash-based collections like HashMap.
  
3. What is the difference between == and equals() when comparing strings?
+  `==` checks for reference equality, meaning it checks whether the two strings point to the same memory location.
`equals()` checks for value equality, meaning it compares the actual content of the strings.

4. How does the `intern()` method work in Java strings?
+The intern() method returns a canonical representation of the string from the string pool. If the string already exists in the pool, it returns the reference from the pool. If not, it adds the string to the pool and returns the reference. This helps save memory by avoiding duplicate string objects.

6. How is memory managed for strings in Java?
+ Strings in Java are stored in a special memory area called the `String Pool`. Whenever a string literal is created, Java checks if the same value already exists in the pool. If it does, the reference is reused; if not, a new string is added to the pool.
Non-literal strings (created with new String()) are stored in the heap and not in the string pool by default.

7. What is string concatenation, and how is it handled internally?
+ String concatenation is the process of combining two strings. In Java, you can concatenate strings using the `+ `operator. Internally, the + operator is converted into a `StringBuilder` append operation if done inside loops or complex expressions to optimize performance.
8. How can you convert a String to an int in Java?
+ You can use the `Integer.parseInt()` or `Integer.valueOf()` methods to convert a string to an integer.
```
String str = "123";
int number = Integer.parseInt(str); // returns 123
```
9. What are some common String methods in Java?
+ `charAt(int index)`: Returns the character at the specified index.
+ `substring(int start, int end)`: Returns a new string that is a substring of this string.
+ `length()`: Returns the length of the string.
+ `indexOf(String str)`: Returns the index of the first occurrence of the specified substring.
+  `toLowerCase()`, `toUpperCase()`: Converts the string to lowercase or uppercase.
+ `trim()`: Removes leading and trailing whitespace.
+ `replace(CharSequence target, CharSequence replacement)`: Replaces all occurrences of the target sequence with the replacement sequence.
10. What is the difference between String.valueOf() and toString()?
+ `String.valueOf()`: Converts a variety of data types (e.g., int, char, boolean, etc.) to their string representation. If the argument is null, it returns the string `"null"`.
+ `toString()`: A method that returns the string representation of an object. If the object is null, it throws a ` NullPointerException`.
11. What is the role of String.format() in Java?
+ `String.format()` allows you to format strings using placeholders like `%s`, `%d`, etc. It is useful for creating formatted strings in a more readable way.
```
String name = "Alice";
int age = 30;
String formatted = String.format("Name: %s, Age: %d", name, age);  // "Name: Alice, Age: 30"
```
12. How would you reverse a string in Java?
+ You can reverse a string by converting it to a StringBuilder and using the reverse() method:
```
String str = "hello";
String reversed = new StringBuilder(str).reverse().toString();
```
13. Is String a primitive type or an object in Java?
+ String is an object in Java. Although it behaves like a primitive in some ways (e.g., String literals), it is actually a reference type backed by the String class.
14. What are some best practices when working with strings in Java?
+ `Avoid using + for concatenation in loops`: Instead, use StringBuilder for efficient string manipulation in loops.
+ `Use String.intern() cautiously`: Only when you need to save memory and ensure unique string references.
+ `Use equals() for comparison`: Avoid using == unless you are checking for reference equality.
15. How would you check if a string contains only digits?
  
+You can use a regular expression or the `Character.isDigit()` method to check if a string contains only digits.
```
String str = "12345";
boolean isNumeric = str.matches("\\d+");  // true if the string contains only digits
```
16. What is the difference between substring() and subSequence()?
+ `substring(int start, int end)` returns a new string that is a substring of the original string.
+ `subSequence(int start, int end)` returns a `CharSequence`, which is a more general interface implemented by String, StringBuffer, StringBuilder, etc.
17. How do you check if a string is empty or null?
+ You can use the following code to check if a string is empty or null:
```
if (str != null && !str.isEmpty()) {
    // String is not null and not empty
}
```
18. What is a `StringTokenizer`, and how is it different from `split()`?
+ StringTokenizer is a legacy class used to split a string into `tokens`. It is less flexible than split(), which supports regular expressions and is more commonly used today.
```
StringTokenizer tokenizer = new StringTokenizer("apple,orange,banana", ",");
while (tokenizer.hasMoreTokens()) {
    System.out.println(tokenizer.nextToken());
}
```
19. How do you compare two strings lexicographically in Java?
+ Use the compareTo() method to compare two strings lexicographically (i.e., based on dictionary order).
```
String str1 = "apple";
String str2 = "banana";
int result = str1.compareTo(str2);  // Negative if str1 comes before str2, positive if after
```
20. Why is the String class declared as final?
+ The String class is declared as final to ensure that it cannot be subclassed, which preserves its immutability and security features.
21. Can a String be subclassed in Java?
No, String cannot be subclassed because it is a final class.

####` Using equals()` Method (Content Comparison)
The equals() method compares the actual content of two strings.

```
String str1 = "Hello";
String str2 = "Hello";

if (str1.equals(str2)) {
    System.out.println("Strings are equal");
} else {
    System.out.println("Strings are not equal");
}
Case-Sensitive: The comparison considers case.
"Hello".equals("hello") → false
```
 ####`Using equalsIgnoreCase()` Method (Case-Insensitive Comparison)
The equalsIgnoreCase() method compares strings while ignoring case differences.

java
Copy code
```
String str1 = "Hello";
String str2 = "hello";

if (str1.equalsIgnoreCase(str2)) {
    System.out.println("Strings are equal (ignoring case)");
} else {
    System.out.println("Strings are not equal");
}
```
### `Using compareTo() Method (Lexicographical Order)`
The `compareTo()` method compares two strings lexicographically:

+Returns 0 if the strings are equal.
+Returns a negative value if the first string comes before the second.
+Returns a positive value if the first string comes after the second.

```
String str1 = "Apple";
String str2 = "Banana";

int result = str1.compareTo(str2);

if (result == 0) {
    System.out.println("Strings are equal");
} else if (result < 0) {
    System.out.println("String 1 comes before String 2");
} else {
    System.out.println("String 1 comes after String 2");
}
```
4. `Using == Operator` (Reference Comparison)
The == operator checks if two string references point to the same memory location. It does not compare the content of the strings.


```
String str1 = "Hello";
String str2 = new String("Hello");

if (str1 == str2) {
    System.out.println("References are the same");
} else {
    System.out.println("References are different");
}
```
### Not Recommended: Use equals() instead for content comparison.
Example Demonstration of All Methods:
```
public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "Hello";

        // Content comparison
        System.out.println("Using equals(): " + str1.equals(str2)); // false
        System.out.println("Using equals(): " + str1.equals(str3)); // true

        // Case-insensitive comparison
        System.out.println("Using equalsIgnoreCase(): " + str1.equalsIgnoreCase(str2)); // true

        // Lexicographical comparison
        System.out.println("Using compareTo(): " + str1.compareTo(str2)); // Negative because 'H' < 'h'

        // Reference comparison
        System.out.println("Using ==: " + (str1 == str3)); // true
        System.out.println("Using ==: " + (str1 == new String("Hello"))); // false
    }
}
```
 ## Key Notes:
+ `Use equals()` for content comparison.
+ `Use equalsIgnoreCase()` for case-insensitive comparison.
+ `Use compareTo()` for sorting or lexicographical comparison.
+ Avoid using `==` for string comparison unless you explicitly want to check references.


## stringbulder , buffer reder 

+ In Java, the `StringBuilder` class is used to create mutable `(modifiable) `strings. Unlike String, which is immutable, StringBuilder allows changes to the string without creating new objects, making it more memory-efficient for certain operations such as concatenation or modifications.

+ Key Features of StringBuilder:
+ `Mutable Strings:` You can modify the content of a StringBuilder without creating a new object.
+ `Efficient Concatenation:` Operations like appending and inserting are faster compared to using the + operator with strings.
+ `Useful Methods:+ StringBuilder provides methods for appending, inserting, replacing, deleting, reversing, etc.
Example Code: Basic Usage
```
public class StringBuilderExample {
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Append a string
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert a string at a specific position
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb);

        // Replace a part of the string
        sb.replace(6, 10, "Beautiful");
        System.out.println("After replace: " + sb);

        // Delete a part of the string
        sb.delete(6, 15);
        System.out.println("After delete: " + sb);

        // Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Get the length of the string
        System.out.println("Length: " + sb.length());

        // Get the capacity of the StringBuilder
        System.out.println("Capacity: " + sb.capacity());
    }
}
```
+ Explanation of Methods:
+ Method	                           Description
+ `append(String s)`	                Adds the specified string to the end of the current string.
+ `insert(int offset, String s)`           Inserts the specified string at the given index.
+ `replace(int start, int end, String s)`	Replaces the characters in the specified range with the given string.
+ `delete(int start, int end)`	        Removes the characters in the specified range.
+ `reverse()`	                        Reverses the characters in the string.
+ `length()`	                       Returns the length of the current string.
+ `capacity()`                      	Returns the current capacity (default capacity is 16, grows dynamically as needed).
+ `charAt(int index)`	                 Returns the character at the specified index.
+ `setCharAt(int index, char c)`           	Sets the character at the specified index to the given value.
+ `toString()`	                        Converts the StringBuilder object to a String.
####Input and Output:
```
StringBuilder sb = new StringBuilder("Programming");
sb.append(" in Java");
System.out.println(sb);
```
Output:
```
Programming in Java
```
+ Notes:
+ `Capacity vs Length:`

+ `Capacity:` The storage size of the StringBuilder (it grows as needed).
+ `Length:` The number of characters currently in the string.
+ `Thread-Safety:`StringBuilder is not thread-safe. For thread-safe operations, use StringBuffer.
  
Performance:
StringBuilder is faster than String when performing multiple modifications like concatenation in a loop.
Practical Use Case:
Efficient string concatenation in a loop:
```
public class EfficientConcat {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            sb.append(i).append(" ");
        }

        System.out.println("Numbers: " + sb.toString());
    }
}
```
Output:
```

Numbers: 1 2 3 4 5 
````


+ What is StringBuilder?
+ StringBuilder is a class used for creating and manipulating mutable strings in Java.
It is not thread-safe, meaning it is not synchronized and is best suited for single-threaded environments.
It is faster than StringBuffer because it does not incur the overhead of thread synchronization.
+What is StringBuffer?
StringBuffer is another class for creating and manipulating mutable strings.
It is thread-safe, meaning all methods are synchronized, and it is suitable for multi-threaded environments where multiple threads may access or modify the string.
Due to synchronization, StringBuffer is slower than StringBuilder.
+ Key Differences Between StringBuilder and StringBuffer

|Aspect|StringBuilder|StringBuffer|
|--------------------|----------------------|--------------|
|Thread-Safety	|Not thread-safe (unsynchronized).	|Thread-safe (synchronized).|
|Performance	|Faster because there is no synchronization overhead.	|Slower due to synchronization overhead.|
|Use Case	|Single-threaded environments.	|Multi-threaded environments.|
|Introduced In	|Java 1.5	|Java 1.0|
|Methods	|Similar to StringBuffer but non-synchronized.	|All methods are synchronized.|
Example Code Comparison
+ Using StringBuilder:
```
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        System.out.println("StringBuilder: " + sb);

        sb.reverse();
        System.out.println("Reversed: " + sb);
    }
}
```
+ Using StringBuffer:
```
Copy code
public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        System.out.println("StringBuffer: " + sb);

        sb.reverse();
        System.out.println("Reversed: " + sb);
    }
}
```
+ Performance Test
```
public class PerformanceTest {
    public static void main(String[] args) {
        // StringBuilder Test
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < 100000; i++) {
            sb.append(" World");
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + " ns");

        // StringBuffer Test
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer("Hello");
        for (int i = 0; i < 100000; i++) {
            sbf.append(" World");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) + " ns");
    }
}
```
+ When to Use Which?
+ `Use StringBuilder`:

When thread-safety is not required (e.g., single-threaded applications).
When performance is critical.

+ Use StringBuffer:

When thread-safety is required (e.g., multi-threaded applications).


## Bitwise oprators 

+ Bitwise operators in Java are used to perform bit-level operations on integers. These operators work directly with binary representations of numbers. Here's a detailed explanation of the bitwise operators:

#### Bitwise Operators
|Operator|	Name|	Description|
|--------|----------|--------------|
|&	|Bitwise AND|    	Performs a bitwise AND operation on two integers.|
|	|Bitwise OR|  perform bitwise OR opration on two integer|
| ^	|Bitwise XOR| 	      Performs a bitwise XOR (exclusive OR) operation on two integers|.
| ~	|Bitwise Complement|	Inverts all the bits of an integer (1's complement).|
| <<	|Left Shift|	    Shifts bits to the left, filling zeros from the right.|
| >>	|Right Shift|	     Shifts bits to the right, preserving the sign bit (sign-extended).|
| >>>	|Unsigned Right Shift|	Shifts bits to the right, filling zeros regardless of the sign.|
Examples
+ Bitwise `AND` `(&)`
```
int a = 5;   // 0101 in binary
int b = 3;   // 0011 in binary
int result = a & b;  // 0001 in binary (1 in decimal)
System.out.println(result);

// Output: 1
```
+ Bitwise `OR` `(|)`
```
int a = 5;   // 0101 in binary
int b = 3;   // 0011 in binary
int result = a | b;  // 0111 in binary (7 in decimal)
System.out.println(result);
 // Output: 7
```
+ Bitwise `XOR` `(^)`
```
int a = 5;   // 0101 in binary
int b = 3;   // 0011 in binary
int result = a ^ b;  // 0110 in binary (6 in decimal)
System.out.println(result);
 // Output: 6
```
+ Bitwise `Complement` `(~)`
```
int a = 5;   // 0101 in binary
int result = ~a;  // 1010 in binary (in 32-bit signed: -6)
System.out.println(result);
// Output: -6
```
+ `Left Shift (<<)`
```
int a = 5;   // 0101 in binary
int result = a << 2;  // 010100 in binary (20 in decimal)
System.out.println(result);
 // Output: 20
```
+ `Right Shift (>>)`
```
int a = 5;   // 0101 in binary
int result = a >> 1;  // 0010 in binary (2 in decimal)
System.out.println(result);
// Output: 2
```
+ `Unsigned Right Shift (>>>)`
```
int a = -5;  // 11111111111111111111111111111011 in binary
int result = a >>> 1;  // 01111111111111111111111111111101
System.out.println(result);
// Output: 2147483645
```
+ Common Use Cases
+ `Low-level programming:` Hardware interaction, encryption, or compression algorithms.
+ `Performance optimization:` Fast calculations, such as multiplying/dividing by powers of 2.
+ `Setting and checking flags:` Using bit masks to represent multiple states in a single variable.


## Bit Manupulation 

+ Bit manipulation refers to the act of performing operations directly on bits, which are the binary representation of numbers. It is an efficient technique often used in competitive programming, low-level system design, and optimization tasks. Here's a comprehensive guide to common bit manipulation techniques and their applications:

+ Bit Representation
Every integer in a computer is stored as a binary number:

` 0 or 1 `
For example:
```
Decimal 5 → Binary 0101
Decimal 10 → Binary 1010
```
+ Common Operations in Bit Manipulation
+ 1. Check if a Number is Odd or Even
+ `Logic:` If the last bit is 1, the number is odd; otherwise, it's even.
```
if ((n & 1) == 1) {
    System.out.println("Odd");
} else {
    System.out.println("Even");
}
```
+ 2. Get the i-th Bit
+Logic: Use a mask 1 << i to isolate the bit.
```
int n = 5;  // Binary: 0101
int i = 2;  
boolean bit = (n & (1 << i)) != 0;
System.out.println("The " + i + "-th bit is " + (bit ? "1" : "0"));  // Output: 1
```
+ 3. Set the i-th Bit
+ Logic: Use a mask 1 << i with the OR operation.
```
int n = 5;  // Binary: 0101
int i = 1;  
n = n | (1 << i);
System.out.println(n);  // Output: 7 (Binary: 0111)
```
+ 4. Clear the i-th Bit
+ Logic: Use a mask ~(1 << i) with the AND operation.
```
int n = 5;  // Binary: 0101
int i = 0;  
n = n & ~(1 << i);
System.out.println(n);  // Output: 4 (Binary: 0100)
```
+ 5. Toggle the i-th Bit
+ Logic: Use a mask 1 << i with the XOR operation.
```
int n = 5;  // Binary: 0101
int i = 2;  
n = n ^ (1 << i);
System.out.println(n);  // Output: 1 (Binary: 0001)
```
+ 6. Count the Number of Set Bits (Hamming Weight)
Logic: Repeatedly isolate and count the rightmost set bit.
```
int n = 5;  // Binary: 0101
int count = 0;
while (n > 0) {
    count += (n & 1);
    n >>= 1;
}
System.out.println(count);  // Output: 2
```
+ 7. Check if a Number is a Power of 2
Logic: A power of 2 has only one bit set.
```
if (n > 0 && (n & (n - 1)) == 0) {
    System.out.println("Power of 2");
} else {
    System.out.println("Not a Power of 2");
}
```
+ 8. Reverse Bits of a Number
```
int n = 5;  // Binary: 0101
int result = 0;
for (int i = 0; i < 32; i++) {
    result <<= 1;
    result |= (n & 1);
    n >>= 1;
}
System.out.println(result);
```

+ 9. Find the Only Non-Repeated Element
Logic: XOR all elements in an array. XOR cancels out duplicates.
```
int[] arr = {1, 2, 2, 3, 3};
int result = 0;
for (int num : arr) {
    result ^= num;
}
System.out.println(result);  // Output: 1
```
+ 10. Swap Two Numbers Without a Temporary Variable
```
int a = 5, b = 3;
a = a ^ b;
b = a ^ b;
a = a ^ b;
System.out.println("a = " + a + ", b = " + b);  // Output: a = 3, b = 5
```
#### Applications of Bit Manipulation
+ `Competitive Programming:` Fast operations for power-of-2 checks, unique elements, and more.
+ `Cryptography:` Encryption algorithms often use bitwise operations.
+ `Graphics Processing: `Manipulate color channels (e.g., RGBA values).
+ `Memory Optimization:`Store multiple boolean values in a single integer using bits.

## Recursion 

+ Recursion is a fundamental concept in programming where a function calls itself to solve smaller instances of a problem.
+ It's especially useful for problems that can be broken into smaller subproblems of the same type. Here's a breakdown of the basics:

+ Key Components of Recursion
+ `Base Case:`
The condition that stops the recursion.
Without a base case, the recursion will run indefinitely and lead to a stack overflow.
Example:
```
if (n == 0) return;
```
+ `Recursive Case:`

The part of the function where it calls itself with a smaller or simpler input.
This reduces the problem's complexity in each step, bringing it closer to the base case.
Example:
```
recursiveFunction(n - 1);
```
+ Structure of a Recursive Function
```
void recursiveFunction(parameters) {
    // Base Case
    if (condition to stop recursion) {
        return;
    }

    // Recursive Case
    recursiveFunction(modified parameters);
}
```
Examples

+ Example 1: Printing Numbers from 1 to N
```
void printNumbers(int n) {
    // Base Case
    if (n == 0) return;

    // Recursive Case
    printNumbers(n - 1);

    // Action after recursive call
    System.out.println(n);
}
```
```
Input:
printNumbers(5);
Output:

1
2
3
4
5
```
+ Example 2: Factorial of a Number
```
int factorial(int n) {
    // Base Case
    if (n == 0) return 1;

    // Recursive Case
    return n * factorial(n - 1);
}
```
```
Input:
System.out.println(factorial(5));
Output:
120
```
##### Advantages of Recursion
+ Simplifies code for problems involving repetitive tasks, like:
+ Traversing trees (binary trees, etc.).
+ Solving mathematical problems (factorials, Fibonacci series).
+ Breaking problems into smaller subproblems (divide-and-conquer).
##### Disadvantages of Recursion
+ `Performance:` Each recursive call consumes stack space.
Can lead to stack overflow if not implemented correctly.
+ `Debugging:`Can be harder to debug compared to iterative solutions.
+ When to Use Recursion
When the problem can naturally be divided into smaller, similar problems.
Examples:
+ Searching algorithms (e.g., binary search).
+ Sorting algorithms (e.g., quicksort, merge sort).
+ Tree and graph traversals.

```
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	static void printNum(int start, int end,int sum)
	{
		
		if(start == end ) {
		  sum += start;
		System.out.print(sum);
		return ;
		}

		   sum = sum + start;
        printNum(start + 1, end , sum);
		
	}

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int s = scn.nextInt();
		int e = scn.nextInt();

		printNum(s,e,0);
	}
}
```
```
input
1 5

output

15
```
explain
```
0+1 = 1
1+2 = 3
3=3 = 6
6+4 = 10
10+5 = 15
 
        
```

## ArrayList in Java
ArrayList is a resizable array implementation in Java that is part of the java.util package. It is dynamic, meaning it can grow or shrink as needed.

### 🔹 Key Features of ArrayList
+ ✅ `Dynamic resizing` – Automatically increases size when elements are added.
+ ✅ `Allows duplicates` – Unlike sets, ArrayList permits duplicate elements.
+ ✅ `Maintains insertion order` – Elements are stored in the order they were added.
+ ✅ `Allows random access` – Elements can be accessed in O(1) time using an index.
+ ✅ `Not thread-safe `– Multiple threads can modify it simultaneously without synchronization.

### 1️⃣ Creating an ArrayList
You need to `import java.util.ArrayList` before using it.
```
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();

        // Adding elements
        names.add("Prachi");
        names.add("Rahul");
        names.add("Priya");

        // Printing the ArrayList
        System.out.println(names);
    }
}
```
Output:
```
[Prachi, Rahul, Priya]
```
+ 🔹 `ArrayList<String> names = new ArrayList<>();`
Declares an ArrayList of Strings. You can also use other data types like `Integer`, `Double`, `Character`, etc.

### 2️⃣ Adding Elements
You can add elements using the `add()` method.
```
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(10);
numbers.add(20);
numbers.add(1, 15); // Adds 15 at index 1

System.out.println(numbers);
```
Output:
```
[10, 15, 20]
```
### 3️⃣ Accessing Elements
Elements can be accessed using `get(index).`
```
ArrayList<String> cities = new ArrayList<>();
cities.add("Mumbai");
cities.add("Delhi");
cities.add("Pune");

System.out.println(cities.get(1)); // Accessing index 1
```
Output:
```
Delhi
```
### 4️⃣ Updating Elements
Use `set(index, value)` to modify elements.
```
ArrayList<String> colors = new ArrayList<>();
colors.add("Red");
colors.add("Blue");

colors.set(1, "Green"); // Replacing "Blue" with "Green"

System.out.println(colors);
```
Output:
```
[Red, Green]
```
### 5️⃣ Removing Elements
Use `remove(index)` or` remove(object)`.
```
ArrayList<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Orange");

fruits.remove(1); // Removes "Banana"
System.out.println(fruits);

fruits.remove("Orange"); // Removes "Orange"
System.out.println(fruits);
```
Output:
```
[Apple, Orange]
[Apple]
```
### 6️⃣ Iterating Over an ArrayList
#### 🔸 Using a for-each loop
```
ArrayList<String> cars = new ArrayList<>();
cars.add("BMW");
cars.add("Tesla");
cars.add("Audi");

for (String car : cars) {
    System.out.println(car);
}
```
#### 🔸 Using a for loop
```
for (int i = 0; i < cars.size(); i++) {
    System.out.println(cars.get(i));
}
```
#### 🔸 Using an Iterator
```
import java.util.Iterator;

Iterator<String> it = cars.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
```
#### Iterator in Java
An Iterator in Java is an interface in the java.util package that allows you to traverse elements of a collection one by one without exposing the underlying implementation.

### 1. Why Use Iterator?
+ It removes elements while iterating.
+ It works independently of the collection type.
+ It is safer than using a for-each loop because it avoids `ConcurrentModificationException`.
2. Iterator Interface Methods
  
+ The Iterator interface has the following methods:

|Method|	Description|
|------------|--------------|
boolean hasNext()|	Returns true if the iteration has more elements.|
|E next()	|Returns the next element in the iteration.|
|void remove()	|Removes the last element returned by next().|
3. Example of Iterator
```
import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        // Create a list
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Get an iterator
        Iterator<String> iterator = names.iterator();

        // Iterate through the list
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);

            // Remove "Bob" while iterating
            if (name.equals("Bob")) {
                iterator.remove();
            }
        }

        System.out.println("List after iteration: " + names);
    }
}
```
Output:
```
Alice
Bob
Charlie
```
```
List after iteration: [Alice, Charlie]
```
#### 4. Fail-Fast vs. Fail-Safe Iterators
|Type	|Behavior|
|-----|----------|
|Fail-Fast|	Throws ConcurrentModificationException if the collection is modified while iterating. Example: ArrayList, HashMap (normal iterators).|
|Fail-Safe|	Allows modification while iterating by working on a copy of the collection. Example: ConcurrentHashMap, CopyOnWriteArrayList.|

#### 5. ListIterator (Bidirectional Iterator)
ListIterator is a special type of iterator for lists that allows traversal in both directions.
```
ListIterator<String> listIterator = names.listIterator();
while (listIterator.hasNext()) {
    System.out.println(listIterator.next());
}
```
#### 6. Alternative: Enhanced For Loop
If removal/modification is not required, you can use:
```
for (String name : names) {
    System.out.println(name);
}
```
Would you like a deeper dive into ListIterator or ConcurrentModificationException? 🚀
### 7️⃣ Checking Size
Use `size()` to find the number of elements.
```
ArrayList<Integer> list = new ArrayList<>();
list.add(1);
list.add(2);
list.add(3);

System.out.println("Size: " + list.size());
```
Output:
```
Size: 3
```
### 8️⃣ Checking if an Element Exists
Use `contains(element)`.
```
ArrayList<String> names = new ArrayList<>();
names.add("John");
names.add("Alice");

System.out.println(names.contains("John")); // true
System.out.println(names.contains("Emma")); // false
```
### 9️⃣ Sorting an ArrayList
Use `Collections.sort()` to sort elements.
```
import java.util.ArrayList;
import java.util.Collections;

ArrayList<Integer> nums = new ArrayList<>();
nums.add(50);
nums.add(10);
nums.add(30);

Collections.sort(nums);
System.out.println(nums);
```
Output:
```
[10, 30, 50]
```
### 🔟 Converting ArrayList to Array
Use `.toArray().`
```
ArrayList<String> names = new ArrayList<>();
names.add("A");
names.add("B");

String[] arr = names.toArray(new String[0]);

for (String s : arr) {
    System.out.println(s);
}
```
## Summary Table
|Method	|Description|
|-------|------------|
|add(value)|	Adds an element at the end|
|add(index, value)|	Inserts an element at a specific index|
|get(index)|	Retrieves an element|
|set(index, value)|	Updates an element|
|remove(index)|	Removes an element by index|
|remove(object)|	Removes an element by value|
|contains(value)|	Checks if an element exists|
|size()|	Returns the number of elements|
|sort(list)	|Sorts the ArrayList|
|toArray()	|Converts ArrayList to an array|

#### 🚀 Key Takeaways
+ ✔ ArrayList is dynamic, unlike arrays.
+ ✔ It maintains insertion order and allows duplicates.
+ ✔ Provides fast random access (O(1)), but removal is slower (O(n)).
+ ✔ Not thread-safe → Use Collections.synchronizedList() for multithreading

## Java Collection Framework (JCF)

The Java Collection Framework (JCF) provides a set of predefined classes and interfaces for efficiently storing, processing, and manipulating data in Java. It includes lists, sets, queues, maps, and more.

### 🔹 Why Use Collections?
+ `✅ Dynamic Size` – Unlike arrays, collections grow or shrink dynamically.
+ ` ✅ Efficiency` – Provides optimized searching, sorting, and manipulation operations.
+ ` ✅ Reusability` – Ready-to-use implementations reduce boilerplate code.
+ `✅ Thread Safety` – Supports synchronized collections for concurrent programming.

+ 🔹 Collection Framework Hierarchy
mathematica
Copy
Edit
```
                   Iterable (Interface)
                        │
              -------------------
              │                 │
         Collection           Map (Interface)
              │                 │
      -----------------      ----------
      │       │      │       │        │
    List     Set   Queue    HashMap   TreeMap
      │       │      │        │         │
 ArrayList HashSet PriorityQueue LinkedHashMap
 LinkedList TreeSet Deque      HashTable
 Vector
```
#### 1️⃣ Interfaces in Java Collection Framework
|Interface	|Description|
|--------------|------------|
|Collection	|Root interface for working with groups of objects.|
|List	|Ordered collection that allows duplicates.|
|Set	|Collection that does not allow duplicates.|
|Queue	|Follows FIFO (First In, First Out) order.|
|Deque	|Double-ended queue (supports insertion & removal at both ends).|
|Map	|Stores key-value pairs (keys are unique).|

#### 2️⃣ List Interface (Ordered, Allows Duplicates)
A List allows elements to be accessed by an index and permits duplicate values.

#####  🔸 Implementations of List:
+ ✅ `ArrayList` – Fast access (O(1)), slow insertion/deletion.
+ ✅` LinkedList` – Fast insertion/deletion (O(1)), slow access (O(n)).
+ ✅` Vector` – Synchronized version of ArrayList.

### Understanding ArrayList vs. LinkedList Performance
Both `ArrayList` and `LinkedList `are implementations of the List interface in Java, but they have different performance characteristics based on how they store and manage elements.

#### 1️⃣ ArrayList – Fast Access (O(1)), Slow Insertion/Deletion
 ##### ✅ Fast Random Access (O(1))

+ ArrayList is backed by a dynamic array.
+ It provides constant-time access to elements using an index (get(index)) because array elements are stored contiguously in memory.
##### ✅ Slow Insertion/Deletion (O(n))

+ Inserting or deleting an element in the middle requires shifting all subsequent elements.
+ `Best case`: Adding at the end (O(1), amortized)
+ `Worst case`: Inserting/deleting from the beginning (O(n), since all elements must shift).
Example: ArrayList Performance
```
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        // Adding elements (Fast O(1) if adding at end)
        list.add(10);
        list.add(20);
        list.add(30);
        
        // Accessing elements (O(1))
        System.out.println("Element at index 1: " + list.get(1)); // Fast
        
        // Removing element from the middle (O(n))
        list.remove(1);
        System.out.println("List after removal: " + list);
    }
}
```
+ ⏳ Time Complexity Recap for ArrayList:

|Operation	|Complexity|
|-----------|---------------|
|Access (get/set)|	O(1)|
|Insert at end	|O(1) (Amortized)|
|Insert in middle	|O(n) (Shifting required)|
|Delete from middle	|O(n) (Shifting required)|

#### 2️⃣ LinkedList – Fast Insertion/Deletion (O(1)), Slow Access (O(n))
##### ✅ Fast Insertion/Deletion (O(1))

+ LinkedList is a doubly linked list (each node stores a reference to the previous and next node).
+ Insertion/removal at the beginning/middle is fast because it just requires updating pointers—no shifting like ArrayList.
##### ✅ Slow Access (O(n))

+ Unlike ArrayList, LinkedList doesn’t have direct indexing (get(index) is slow).
+ To access an element, Java traverses the list from the start until it finds the index (O(n), worst case).
Example: LinkedList Performance
```
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        
        // Adding elements (Fast O(1))
        list.add(10);
        list.add(20);
        list.add(30);
        
        // Accessing elements (Slow O(n))
        System.out.println("Element at index 1: " + list.get(1)); // Slow
        
        // Removing element from the middle (Fast O(1))
        list.remove(1);
        System.out.println("List after removal: " + list);
    }
}
```
+ ⏳ Time Complexity Recap for LinkedList:

|Operation	|Complexity|
|---------------|------------|
|Access (get/set)|	O(n)|
|Insert at end	|O(1) (if tail reference is available)|
|Insert in middle	|O(1) (once position is found)|
|Delete from middle	|O(1) (once position is found)|

#### 3️⃣ When to Use Which?
|Use Case	|Best Choice	|Reason|
|-------------|----------------|---------|
|Fast random access	|✅ ArrayList	|O(1) indexing|
|Frequent insertions/deletions (except at the end)|	✅ LinkedList|	O(1) insert/delete at middle|
|Memory efficiency	|✅ ArrayList|	Less memory overhead (no extra pointers)|
|Iterating over elements	|✅ ArrayList	|Better cache locality (faster iteration)|

#### 4️⃣ Conclusion
+ If you need fast lookups, go for ArrayList (O(1) access time).
+ If you need frequent insertions/removals, go for LinkedList (O(1) for insertions/deletions).
+ If memory is a concern, ArrayList is more efficient as it doesn’t store extra node references.

Example: Using ArrayList
```
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println(list); // Output: [Apple, Banana, Mango]
    }
}
```
#### 3️⃣ Set Interface (Unique Elements, No Duplicates)
A Set does not allow duplicate elements.

#### 🔸 Implementations of Set:
+ ✅ `HashSet` – Unordered, allows null, fast O(1) access.
+ ✅ `LinkedHashSet` – Maintains insertion order.
+ ✅ `TreeSet` – Sorted set (ascending order).

Example: Using HashSet
```
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10); // Duplicate ignored

        System.out.println(set); // Output: [10, 20]
    }
}
```
#### 4️⃣ Queue Interface (FIFO - First In First Out)
A Queue follows FIFO (First In, First Out), used in task scheduling and buffering.

##### 🔸 Implementations of Queue:
+ ✅ `PriorityQueue `– Orders elements based on priority.
+ ✅` LinkedList (implements Queue) `– Normal FIFO order.

Example: Using PriorityQueue
```
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(30);
        queue.add(10);
        queue.add(20);

        System.out.println(queue.poll()); // Output: 10 (smallest removed first)
    }
}
```
#### 5️⃣ Deque Interface (Double-Ended Queue)
A Deque allows elements to be added or removed from both ends.

##### 🔸 Implementations of Deque:
+ ✅ `ArrayDeque` – Faster than LinkedList, no capacity restrictions.

Example: Using ArrayDeque
```
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.addFirst("Front");
        deque.addLast("Back");

        System.out.println(deque); // Output: [Front, Back]
    }
}
```
#### 6️⃣ Map Interface (Key-Value Pair)
+ A Map stores unique keys mapped to values.

##### 🔸 Implementations of Map:
+ ✅ `HashMap` – Unordered, allows one null key.
+ ✅ `LinkedHashMap` – Maintains insertion order.
+ ✅ `TreeMap` – Sorted keys.

Example: Using HashMap
```
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Charlie");

        System.out.println(map.get(2)); // Output: Bob
    }
}
```
## 7️⃣ Comparing List, Set, and Map
|Feature	|List (ArrayList, LinkedList)|	Set (HashSet, TreeSet)|	Map (HashMap, TreeMap)|
|-----------------|--------------------------|------------------------|------------------------|
|Duplicates Allowed?	|✅ Yes	|❌ No	|❌ Keys must be unique|
|Ordered?	|✅ Yes	|❌ No (except LinkedHashSet)|❌ No (except LinkedHashMap)|
|Allows Null?	|✅ Yes|	✅ Yes (only HashSet)|	✅ Yes (only HashMap key)|
|Sorting?	|❌ No	|✅ TreeSet sorts	|✅ TreeMap sorts keys|

### 8️⃣ Synchronized (Thread-Safe) Collections
By default, collections are not thread-safe. You can make them synchronized:
```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());
        Set<Integer> set = Collections.synchronizedSet(new HashSet<>());
        Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());
    }
}
```
### 9️⃣ Sorting Collections
Use `Collections.sort()` for sorting.
```
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(3);
        nums.add(8);

        Collections.sort(nums); // Ascending order
        System.out.println(nums); // Output: [3, 5, 8]
    }
}
```
### 🔟 Important Methods in Collections
|Method	|Description|
|----------|----------|
|add(value) |	Adds an element|
|remove(value)|	Removes an element|
|contains(value)|	Checks if element exists|
|size()	|Returns number of elements|
|clear()|	Removes all elements|
|sort(list)|	Sorts a List|
|synchronizedList(list)	|Makes a List thread-safe|

#### 🎯 Summary
+ ✔ `List` – Ordered, allows duplicates (ArrayList, LinkedList).
+ ✔ `Set` – Unique elements (HashSet, TreeSet).
+ ✔ `Queue `– Follows FIFO (PriorityQueue).
+ ✔ `Deque` – Insert/remove from both ends (ArrayDeque).
+ ✔ `Map` – Stores key-value pairs (HashMap, TreeMap).


## LinkedList in Java 
+ A LinkedList is a linear data structure where elements (nodes) are linked together using pointers. Unlike arrays, LinkedLists do not use contiguous memory locations; instead, each element contains a reference (or pointer) to the next element in the sequence.

1. Types of Linked Lists
### (a) Singly Linked List
Each node in a singly linked list contains:
+ `Data `(value stored in the node)
+ `Pointer` (next) to the next node in the list
+ Structure of a Node in a Singly Linked List:
```
[Data | Next] -> [Data | Next] -> [Data | Next] -> null
```
👉 The last node's next pointer is set to null.

(b) Doubly Linked List
Each node in a doubly linked list contains:

Data
Pointer to the next node
Pointer to the previous node
Structure of a Node in a Doubly Linked List:

```
null <- [Prev | Data | Next] <-> [Prev | Data | Next] <-> [Prev | Data | Next] -> null
```
+ 👉 Allows traversal in both directions.

## (c) Circular Linked List
+ The last node of the list points back to the first node instead of null.
+ Can be singly circular (next pointer points to the first node) or doubly circular (both next and previous pointers form a circular link).
Example:
```
[Data | Next] -> [Data | Next] -> [Data | Next] ┐
```
+ 👉 Useful for applications that require cyclic iteration, like scheduling tasks.

### 2. Implementation of LinkedList in Java
+ Using Java’s Built-in LinkedList Class
Java provides a LinkedList class in the `java.util package`, which implements both the `List` and `Deque` interfaces.

+ Basic Operations with LinkedList

```
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Creating a LinkedList of Strings
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("A");  // Add at the end
        list.addFirst("Start");  // Add at the beginning
        list.addLast("End");  // Add at the end

        // Adding at a specific position
        list.add(1, "B");

        // Displaying elements
        System.out.println("LinkedList: " + list);

        // Accessing elements
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // Removing elements
        list.remove("B");  // Remove specific element
        list.removeFirst();  // Remove first element
        list.removeLast();  // Remove last element

        // Iterating over the LinkedList
        System.out.println("LinkedList after deletions:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}
```
Output
```
LinkedList: [Start, B, A, End]

First Element: Start

Last Element: End

Element at index 2: A
```
+ LinkedList after deletions:
```
A
```
### 3. Custom Implementation of a Singly Linked List
+ To better understand how LinkedList works internally, let’s implement our own Singly Linked List in Java.
```
class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head; // Head of the linked list

    // Insert at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Delete a node by value
    public void delete(int key) {
        Node temp = head, prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next; // Head changes
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return; // Key not found
        prev.next = temp.next; // Unlink node
    }

    // Display the LinkedList
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insertAtBeginning(5);
        list.insert(30);
        list.display();

        list.delete(20);
        list.display();
    }
}
```
Output
```
5 -> 10 -> 20 -> 30 -> null
5 -> 10 -> 30 -> null
```
### 4. Advantages & Disadvantages of LinkedList
|Feature	|LinkedList	|Array|
|-------------|--------------|--------|
|Memory Usage	|Uses more memory due to extra pointers|	Less memory since no pointers|
|Insertion/Deletion|	Fast (O(1) at the beginning)	|Slow (O(n) for shifting elements)|
|Random Access|	Slow (O(n) traversal required)	|Fast (O(1) direct access)|
|Cache Efficiency|	Poor (scattered in memory)	|Better (stored contiguously)|
### When to Use a LinkedList?
+ ✅ When frequent `insertions/deletions` are required (e.g.,` implementing stacks, queues`).
+ ✅ When memory is not a concern.
+ ❌ Avoid using LinkedList when fast random access (like arr[i]) is needed.

### 5. Key Methods in Java’s LinkedList Class
| Method	|Description|
|---------------|-------------|
|add(E e)	|Adds element at the end|
|addFirst(E e)	|Adds element at the beginning|
|addLast(E e)	|Adds element at the end|
|remove()	|Removes the first element|
|removeFirst()	|Removes the first element|
|removeLast()	|Removes the last element|
|get(int index) |Retrieves the element at a given index|
|getFirst()	|Retrieves the first element|
|getLast()	|Retrieves the last element|
|size()	|Returns the size of the list|
### 6. Use Cases of LinkedList
+ 🔹 Implementing Stacks and Queues
+ 🔹 Undo/Redo Functionality in text editors
+ 🔹 Graph Representation (Adjacency List)
+ 🔹 Music Playlists (Next/Previous song navigation)
+ 🔹 Schedulers (Task Scheduling in OS)

### Conclusion
+ LinkedList is a dynamic data structure that supports efficient insertions/deletions.
+ Java provides a built-in LinkedList class that simplifies usage.
+ Custom implementations allow deeper understanding of the structure.
+ While LinkedList is useful in some cases, it is slower than arrays for random acces

```

public class Main{

	Node head;
	private int size;

	Main()
	{
		size = 0;
	}

	class Node{
		String data;
		Node next;

	    	Node(String data)
    	{
	    	this.data = data;
	    	this.next = null;

    	}
	}

	public void addFirst(String data)
	{
		Node newNode = new Node(data);
        
		size++;
		newNode.next = head;
        head = newNode;
	}

	public void addLast(String data )
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			return ;
		}
        size++;
		Node curr = head;
		while(curr.next != null)
		{
           curr = curr.next;
		}

		curr.next = newNode;

		

	}

	public void deleteFirst()
	{
		if(head == null)
		{
			System.out.print("List is Empty.");
		}
        
		size--;
	 	head = head.next; 
	}

	public void deleteLast()
	{
		if(head == null)
		{
			System.out.print("list is empty");
			return;
		}
          size--;
		if(head.next == null)
		{
			head = null;
			return ;
	    }

		Node secoundlast = head;
		Node lastNode = head.next;

		while(lastNode.next != null)
		{
			lastNode = lastNode.next ;
			secoundlast = secoundlast.next;
		}

		secoundlast.next  = null;

	}

	public void printList()
	{
		 if (head == null) {
            System.out.println("List is empty.");
            return;
        }

		Node curr = head;

		while(curr != null)
		{
			System.out.print(curr.data + "->");
			curr = curr.next;

		}

		System.out.print("NULL");

	}

	public int getSize()
	{
		return size;
	}


	public static void main(String args[])
	{
		Main list = new Main();

		list.addFirst("manoj");
		list.addFirst("chirag");
		list.addFirst("prachi");
		list.addFirst("pranjal");
		System.out.println("add first in list ");
		list.printList();
		
        System.out.println();
        System.out.println("add last in list ");
		list.addLast("sankhe");
		list.printList();
		
         System.out.println();
        System.out.println("delete first in list ");
        list.deleteFirst();
		list.printList();
		
         System.out.println();
        System.out.println("delete last in list ");
		list.deleteLast();
		list.printList();

		 System.out.println();
		System.out.print("print size:  " + list.getSize());

		
	


	}
} 
```
output 
```
add first in list 
pranjal->prachi->chirag->manoj->NULL
add last in list 
pranjal->prachi->chirag->manoj->sankhe->NULL
delete first in list 
prachi->chirag->manoj->sankhe->NULL
delete last in list 
prachi->chirag->manoj->NULL
print size:  3
```

```
import java.util.LinkedList;

public class Main {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("a ");
        list.addFirst("is ");
        list.addLast("list"); // Corrected addLast
        list.addFirst("this ");

        // Print the LinkedList elements
        for (String s : list) {
            System.out.print(s + "-> "); // Directly print 's' instead of list.get(s)
        }
        System.out.println("null"); // Indicating end of the list
    }
}
```

output
```
this -> is -> a -> list-> null

```
## Explanation of Methods Used
```
import java.util.LinkedList;

public class Main {
    public static void main(String args[]) {
        // Creating a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("One");        // Adds at the end
        list.addFirst("Zero");  // Adds at the beginning
        list.addLast("Two");    // Adds at the end
        list.add("Three");      // Adds at the end

        // Display the LinkedList
        System.out.println("LinkedList after additions: " + list);

        // Removing elements
        list.remove();          // Removes the first element (Zero)
        list.removeFirst();     // Removes first element (One)
        list.removeLast();      // Removes last element (Three)

        // Display after removals
        System.out.println("LinkedList after removals: " + list);

        // Accessing elements
        System.out.println("First Element: " + list.getFirst());  // Retrieves first element
        System.out.println("Last Element: " + list.getLast());    // Retrieves last element
        System.out.println("Element at index 0: " + list.get(0)); // Retrieves element at index 0

        // Checking the size of the LinkedList
        System.out.println("Size of LinkedList: " + list.size());
    }
}
```
output 
```
LinkedList after additions: [Zero, One, Two, Three]
LinkedList after removals: [Two]
First Element: Two
Last Element: Two
Element at index 0: Two
Size of LinkedList: 1

```

### reverse linklist using The Iterative
```

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Insert at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Corrected Iterative Reverse Method
    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = null;
        Node currNode = head;
        Node nextNode;

        while (currNode != null) {
            nextNode = currNode.next; // Store next node
            currNode.next = prevNode; // Reverse the link
            prevNode = currNode;      // Move prev forward
            currNode = nextNode;      // Move current forward
        }

        head = prevNode; // Update head to new first node
    }

    // Display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Original LinkedList:");
        list.display();

        list.reverseIterate(); // Call the corrected reversal method

        System.out.println("Reversed LinkedList:");
        list.display();
    }
}

```
output 
```
5 → 4 → 3 → 2 → 1 → null
```


### reverse linklist using recursion 

```
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Insert at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Corrected Iterative Reverse Method
    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = null;
        Node currNode = head;
        Node nextNode;

        while (currNode != null) {
            nextNode = currNode.next; // Store next node
            currNode.next = prevNode; // Reverse the link
            prevNode = currNode;      // Move prev forward
            currNode = nextNode;      // Move current forward
        }

        head = prevNode; // Update head to new first node
    }

    // Display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Original LinkedList:");
        list.display();

        list.reverseIterate(); // Call the corrected reversal method

        System.out.println("Reversed LinkedList:");
        list.display();
    }
}

```
output 
```
Original LinkedList:
1 -> 2 -> 3 -> 4 -> 5 -> null
Reversed LinkedList:
5 -> 4 -> 3 -> 2 -> 1 -> null

```

## stack 
### using linklist of stack
```
public class StackClass {
    
    // Making Node a static nested class so it can be used inside Stack
    static class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    static class Stack {
        private Node head;
        
        public boolean isEmpty() {
            return head == null;
        }
        
        public void push(int data) {
            Node newNode = new Node(data); // Now it works because Node is static
            newNode.next = head;
            head = newNode;
        }
        
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }
    }
    
    public static void main(String[] args) {
        Stack s = new Stack();
        
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        System.out.println("Top element: " + s.peek()); // Expected: 4
        
        System.out.println("Popped: " + s.pop()); // Expected: 4
        System.out.println("Top element after pop: " + s.peek()); // Expected: 3
    }
}

```
#### 1️⃣ What is a Stack?
+ A stack is a `Last In, First Out` (LIFO) data structure, meaning:

+ The last element added is the first one to be removed.
+ Supports two main operations:
+ `push(x)`: Inserts x at the top of the stack.
+ `pop()`: Removes and returns the top element.
+ Example of a Stack Operation
```
push(1) → Stack: [1]
push(2) → Stack: [2, 1]
push(3) → Stack: [3, 2, 1]
pop()   → Returns 3, Stack: [2, 1]
```
##### 2️⃣ Code Breakdown
+ 📌 `Class Node `(for Linked List Representation)
```
static class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```
+ Node represents each element of the stack.
+ It contains:
+ `data`: Stores the integer value.
+ `next`: Points to the next node in the stack.
+ 📌` Class Stack` (Stack Implementation Using Linked List)
```
static class Stack {
    private Node head;
```
+ head: Represents the top of the stack.
+ Initially, head = null (empty stack).
+ 📌` isEmpty() `Method
```
public boolean isEmpty() {
    return head == null;
}
```
+ Returns true if the stack is empty (head == null).
+ 📌` push(int data)` Method
```
public void push(int data) {
    Node newNode = new Node(data); // Create a new node
    newNode.next = head; // Point the new node to the current top
    head = newNode; // Update head to the new node
}
```
+  How `push()` Works
+ Creates a new Node with data.
+ The new node's next points to the current head.
+ Updates head to the new node.
+ ✅ Example (push(1), push(2), push(3))
```
Before push(1): Stack is empty
push(1) → head → [1] → null
push(2) → head → [2] → [1] → null
push(3) → head → [3] → [2] → [1] → null
```
+ 📌 `pop() `Method
```
public int pop() {
    if (isEmpty()) {
        System.out.println("Stack is empty");
        return -1;
    }
    int top = head.data; // Store top value
    head = head.next; // Move head to next node
    return top; // Return popped value
}
```
####  How pop() Works
+ If stack is empty, prints "Stack is empty" and returns -1.
+ Stores head.data (current top value).
+ Moves head to the next node (removing the top).
+ Returns the popped value.
✅ Example (pop() after push(3,2,1))
```
Stack: [3] → [2] → [1] → null
pop() → returns 3
New Stack: [2] → [1] → null
```

+ 📌 `peek() `Method
```
public int peek() {
    if (isEmpty()) {
        System.out.println("Stack is empty");
        return -1;
    }
    return head.data;
}
```
+ Returns top element without removing it.
+ If stack is empty, prints "Stack is empty" and returns -1.
✅ Example
```
Stack: [3] → [2] → [1] → null
peek() → returns 3
Stack remains unchanged
```
+ 3️⃣ `main()` Method – Testing the Stack
```
public static void main(String[] args) {
    Stack s = new Stack();

    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    
    System.out.println("Top element: " + s.peek()); // Expected: 4
    
    System.out.println("Popped: " + s.pop()); // Expected: 4
    System.out.println("Top element after pop: " + s.peek()); // Expected: 3
}
```
Execution Steps
```
push(1) → Stack: [1]
push(2) → Stack: [2, 1]
push(3) → Stack: [3, 2, 1]
push(4) → Stack: [4, 3, 2, 1]

peek()  → Returns 4
pop()   → Removes 4, Returns 4
peek()  → Returns 3
```
✅ Final Output
```

Top element: 4
Popped: 4
Top element after pop: 3
```
#### 4️⃣ Complexity Analysis
|Operation	|Time Complexity|	Explanation|
|push()|	O(1)	|Adds new element at head|
|pop()	|O(1)	|Removes head, moves pointer|
|peek()|	O(1)	|Accesses head’s data|
|isEmpty()	|O(1)	|Simple null check|
#### 5️⃣ Key Takeaways
+ 1️⃣ Stack is implemented using a singly linked list (dynamic size, no array resizing issues).
+ 2️⃣ `push()`,` pop()`, and `peek()` run in O(1) time.
+ 3️⃣ `Drawback`: More memory usage compared to array-based stacks (extra pointer storage).

### suing arrayList stack
```
import java.util.ArrayList;

public class StackClass {
    
    // Making Stack a static nested class
    static class Stack {
        private ArrayList<Integer> list = new ArrayList<>();
        
        public boolean isEmpty() {
            return list.isEmpty();
        }
        
        public void push(int data) {
            list.add(data);
        }
        
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }
        
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            
            return list.get(list.size() - 1);
        }
    }
    
    public static void main(String[] args) {
        Stack s = new Stack();
        
        s.push(1);
        s.push(2);
        s.push(4);
        s.push(5);
        
        System.out.println("Popped: " + s.pop());  // Expected: 5
        System.out.println("Top element: " + s.peek());  // Expected: 4
    }
}

```

### push at bottom of stack
```
import java.util.Stack;

public class StackClass {
    
    public static void pushAtBottom(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        
        s.push(1);
        s.push(2);
        s.push(4);
        s.push(5);
        
        pushAtBottom(8, s);
        
        while (!s.isEmpty()) {
            System.out.print(s.peek() + " ");  // Expected output: 8 1 2 4 5
            s.pop();
        }
    }
}

```

## reverse a stack 
```
import java.util.Stack;

public class StackClass {
    
    public static void pushAtBottom(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }
    
    static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return;
        }
        
        int top = s.pop();
        reverse(s);
        pushAtBottom(8, s);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        
        s.push(1);
        s.push(2);
        s.push(4);
        s.push(5);
        
        
        
        while (!s.isEmpty()) {
            System.out.print(s.peek() + " ");  // Expected output: 5 4 2 1
            s.pop();
        }
    }
}

```
## Queue

###  Queue using array

```
public class QueueY
{
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;

        // Queue constructor
        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        // Enqueue (add)
        public static void add(int data) {
            if (rear == size - 1) { // Check if queue is full
                System.out.println("Queue is full");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        // Dequeue (remove)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;

            return front;
        }

        // Peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

```

### circular queue using array 
```
public class QueueY {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        // Queue constructor
        Queue(int n) {
            arr = new int[n];
            size = n;  // Fixed 'size' assignment
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Enqueue (add)
        public static void add(int data) {
            if (isFull()) { // Check if queue is full
                System.out.println("Queue is full");
                return;
            }

            // First element insertion
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;  // Circular increment
            arr[rear] = data;
        }

        // Dequeue (remove)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int result = arr[front];

            // If only one element is left
            if (rear == front) {
                rear = -1;
                front = -1;
            } else {
                front = (front + 1) % size;  // Circular increment
            }

            return result;
        }

        // Peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        q.remove();
        q.add(8);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

```
output 
```
2
3
4
5
8
```
### Queue using LinKlist 
```
public class QueueY {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node tail = null;
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        // Enqueue (add)
        public static void add(int data) {
            Node newNode = new Node(data);

            if (tail == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;  // Fix: Properly updating the tail
        }

        // Dequeue (remove)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = head.data;
            
            if (head == tail) {
                head = tail = null;  // Fix: Set both to null when last element is removed
            } else {
                head = head.next;
            }

            return front;
        }

        // Peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        q.remove();
        q.add(8);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

```
output
```
2
3
4
5
8
```

### Queue using collection fromwork 
```
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // Enqueue (add elements)
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        // Dequeue (remove elements)
        System.out.println("Front element: " + q.peek()); // Peek at front
        q.remove(); // Removes 1
        q.add(8); // Add 8 to queue

        // Print queue elements
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

```

### ✅ Queue Implementation using `ArrayDeque` (Faster)
If you don't need null elements, `ArrayDeque is a better alternative to LinkedList`
```
import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        // Enqueue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        // Dequeue
        System.out.println("Front element: " + q.peek()); // Peek at front
        q.remove(); // Removes 1
        q.add(8); // Add 8 to queue

        // Print queue elements
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
```
+ ✅ ArrayDeque is faster than LinkedList because it avoids extra node allocations. 🚀

+ Would you like an implementation of a priority queue as well? 😊

##

+ Let's break down this statement:
```
Queue<Integer> q = new ArrayDeque<>();
```
+ 🔹 Identifying Class, Object, and Interface
|Component	|Type	|Description|
|-------------|----------|-----------|
|Queue<Integer>|Interface|Queue is an interface from Java's Collection Framework. It defines queue behaviors (like add(), remove(), peek()), but it does not provide implementations.|
|ArrayDeque<>()	|Class |ArrayDeque is a concrete class that implements the Queue interface. It provides the actual implementation of queue operations.|
|q	|Object (Reference Variable)|q is an object reference variable that points to an instance of ArrayDeque. It allows us to use queue methods through polymorphism.|
+ 🔹 Explanation
+ `Interface (Queue<Integer>)`
+ Queue is an interface, meaning it only provides method signatures but no implementation.
+ We cannot instantiate Queue directly (i.e., new Queue<>() is not allowed).
+ `Class (ArrayDeque<>)`
 +  ArrayDeque is a concrete class that provides an actual implementation of the Queue interface.
+ It allows dynamic resizing and efficient insertions/removals from both ends.
+ `Object (q)`

+ The variable q is a reference of type Queue<Integer>, but it stores an object of ArrayDeque<Integer>.
+ This is an example of polymorphism—we use an interface type (Queue<Integer>) to hold a reference to its implementing class (ArrayDeque<Integer>).
### 🔹 Polymorphism in Action
```
import java.util.Queue;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>(); // Interface reference, class object

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q.remove()); // Removes 10
        System.out.println(q.peek());   // Shows 20
    }
}
```
🔹 Output:
```
10
20
```
✅ This follows polymorphism, meaning we can later change q to reference any other class implementing Queue, like LinkedList or PriorityQueue, without changing the rest of the code.
#### ArrayList and ArrayDeque 
+ Both `ArrayList` and ArrayDeque` are part of Java's Collection Framework, but they serve different purposes.

+ 🔹 Key Differences Between ArrayList and ArrayDeque
|Feature	| ArrayList	| ArrayDeque|
|-------------|----------------------|--------------|
|Data Structure      |Dynamic array (Resizable array-based list)     |Double-ended queue (Deque) (Resizable array-based queue)|
|Access Type          | 	Random access (O(1) time for get(index))|   FIFO (First-In-First-Out) or LIFO (Last-In-First-Out)|
|Insertion/Deletion    |	Slow at the start/middle (O(n)) but fast at the end (O(1))|	Fast insertions/removals at both ends (O(1))|
|Access Time Complexity|	O(1) for get(index), O(n) for remove(index)  |	O(1) for add/remove from front or back|
|Best Used For        |	Storing and accessing elements by index	|Queue operations (adding/removing from both ends)|
|Implements	|List interface	 |  Deque and Queue interfaces|
|Allows null?|	✅ Yes|	❌ No|
|Thread Safety	|❌ Not thread-safe (Use Collections.synchronizedList if needed)	|❌ Not thread-safe (Use ConcurrentLinkedDeque for thread safety)|
|Example Use Cases	|Dynamic arrays, searching, sorting, and indexed access|	Queues, stacks, and efficient element insertion/removal|

### 🔹 When to Use What?
+ Use `ArrayList` when you need fast random access (e.g., `list.get(index`)).
+ Use `ArrayDeque` when you need fast insertions/removals at both ends (e.g.,` queue.poll() `or` stack.push()`).
### 🔹 Example: ArrayList (Fast Random Access)
```
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        
        System.out.println(list.get(1)); // Fast O(1) random access
        list.remove(1); // Slow O(n) removal from middle
    }
}
```
+ 🔹 Best for: Searching, Sorting, Indexed Access.

+ 🔹 Example: ArrayDeque (Fast Insertions/Deletions)
```
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(10);
        deque.addLast(20);
        deque.addLast(30);
        
        System.out.println(deque.pollFirst()); // Fast O(1) removal from front
        System.out.println(deque.pollLast());  // Fast O(1) removal from back
    }
}
```
+ 🔹 Best for: Queues, Stacks, Efficient Insertions/Removals.

+ 🔹 Final Verdict
If you frequently access elements by index, choose ArrayList.
If you frequently add/remove elements from both ends, choose ArrayDeque.

## BinaryTree

+ A Binary Tree is a hierarchical data structure where each node has at most two children: a left child and a right child. It is widely used in searching, sorting, and hierarchical data representation.

#### Types of Binary Trees:
+ `Full Binary Tree` → Every node has `0 `or` 2` children.
+ `Complete Binary Tree` → All levels are completely filled except possibly the last.
+ `Perfect Binary Tree` → All internal nodes have `two children`, and all `leaf nodes are at the same level`.
+ `Balanced Binary Tree` → The height difference between the left and right subtrees is at most 1.
+ `Degenerate (Skewed) Binary Tree `→ Each parent node has only one child.
### Basic Operations in a Binary Tree:
+ ✅ `Insertion`
+ ✅ `Deletion`
+ ✅ `Traversal (Inorder, Preorder, Postorder)`
+ ✅ `Searching`
+ ✅ `Finding Height of Tree`

### Binary Tree Implementation in Java

```
public class BinaryTree {
    
    static class Node {
        int data;
        Node left;
        Node right;
        
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class TreeBuilder {
        public static Node buildTree(int nodes[], int[] idx) {
            if (idx[0] >= nodes.length || nodes[idx[0]] == -1) {
                idx[0]++; // Move to the next index
                return null;
            }
            Node newNode = new Node(nodes[idx[0]]);
            idx[0]++; // Move to the next index
            newNode.left = buildTree(nodes, idx);
            newNode.right = buildTree(nodes, idx);

            return newNode;
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        int[] idx = {0}; // Use an array to track the index

        Node root = TreeBuilder.buildTree(nodes, idx);
        System.out.println("Root Node: " + root.data);
    }
}

```
output
```
Root Node: 1

```
#### Understanding the Binary Tree Construction
+ The given array represents a `preorder traversal` `(Root → Left → Right)` of a binary tree, where:

+ Each integer represents a node.
+ `-1` represents a null node (i.e., no child).
Example Input Array
```
int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
```
+ This array represents the following binary tree:
```
        1
       / \
      2   3
     / \    \
    4   5    6
```
#### Step-by-Step Execution
#### Initialization
 + We start at 1idx = 0`, which means we begin constructing the tree from nodes[0] = 1.
#### Recursive Calls
1. Create Root `Node (1)`

+  `idx = 0;`
+ `nodes[0]` = 1 → Create a node with data = 1.
+ Move to `idx = 1` to build the left subtree.
2. Create Left `Child (2)`

+ `idx = 1`
+ `nodes[1] = 2 `→ Create a node with data = 2.
+ Move to `idx = 2` to build the left subtree.
3. Create `Left Child `of 2 (4)

+ idx = 2
+ nodes[2] = 4 → Create a node with data = 4.
+ Move to idx = 3 to build the left subtree.
4. Null `Left Child` of 4

+ idx = 3
+ nodes[3] = -1 → Return null (4 has no left child).
+ Move to idx = 4 to build the right subtree.
5. Null Right Child of 4

+ idx = 4
+ nodes[4] = -1 → Return null (4 has no right child).
+ Return node (4) to its parent (2).
+ Move to idx = 5 to build the right subtree of 2.
6. Create Right Child of 2 (5)

+ idx = 5
+ nodes[5] = 5 → Create a node with data = 5.
+ Move to idx = 6 to build the left subtree.
7. Null Left Child of 5

+ idx = 6
+ nodes[6] = -1 → Return null.
+ Move to idx = 7 to build the right subtree.
8. Null Right Child of 5

+ idx = 7
+ nodes[7] = -1 → Return null.
+ Return node (5) to its parent (2).
+ Return node (2) to its parent (1).
+ Move to idx = 8 to build the right subtree of 1.
9. Create Right Child of 1 (3)

+ idx = 8
+ nodes[8] = 3 → Create a node with data = 3.
+ Move to idx = 9 to build the left subtree.
10. Null Left Child of 3

+ idx = 9
+ nodes[9] = -1 → Return null.
+ Move to idx = 10 to build the right subtree.
11. Create Right Child of 3 (6)

+ idx = 10
+ nodes[10] = 6 → Create a node with data = 6.
+ Move to idx = 11 to build the left subtree.
12. Null Left Child of 6

+ idx = 11
+ nodes[11] = -1 → Return null.
+ Move to idx = 12 to build the right subtree.
13. Null Right Child of 6

+ idx = 12
+ nodes[12] = -1 → Return null.
+ Return node (6) to its parent (3).
+ Return node (3) to its parent (1).
+ Tree construction is complete.
+ Final Tree Structure
```
        1
       / \
      2   3
     / \    \
    4   5    6
```
### Why We Used idx[] Instead of Static Variable?
 + The `idx[] `array allows us to track position across recursive calls.
+ Using a static variable is risky because if we call buildTree() again in the same program execution, it might retain the old index value, leading to incorrect behavior.
### Common Interview Questions on Binary Trees
+ ✔ Find the height of a binary tree
+ ✔ Count the number of nodes
+ ✔ Check if a tree is balanced
+ ✔ Find the lowest common ancestor (LCA)
+ ✔ Check if two trees are identical

####  print the binary tree, we need to implement tree traversal methods. The most common tree traversal methods are:

+ `Preorder Traversal` (Root → Left → Right)
+ `Inorder Traversal` (Left → Root → Right)
+  `Postorder Traversal` (Left → Right → Root)
+ `Level Order Traversal `(Breadth-First Search)
Modified Code with Tree Printing
```
import java.util.*;

public class BinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;
        
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class TreeBuilder {
        static int idx = -1; 
        
        public static Node buildTree(int nodes[]) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }
        
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            
            return newNode;
        }
    }

    // Preorder Traversal: Root → Left → Right
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Inorder Traversal: Left → Root → Right
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Postorder Traversal: Left → Right → Root
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // Level Order Traversal (BFS)
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        Node root = TreeBuilder.buildTree(nodes);
        
        System.out.println("Preorder Traversal:");
        preorder(root);
        
        System.out.println("\nInorder Traversal:");
        inorder(root);
        
        System.out.println("\nPostorder Traversal:");
        postorder(root);
        
        System.out.println("\nLevel Order Traversal:");
        levelOrder(root);
    }
}
```
Tree Structure
The input array represents the tree:

```
        1
       / \
      2   3
     / \    \
    4   5    6
```
Expected Output
```
Preorder Traversal:
1 2 4 5 3 6 

Inorder Traversal:
4 2 5 1 3 6 

Postorder Traversal:
4 5 2 6 3 1 

Level Order Traversal:
1 2 3 4 5 6
```
#### Explanation of Traversals
|Traversal	|Order	|Output for Given Tree|
|---------------|--------|-------------------|
|Preorder	|Root → Left → Right	|1 2 4 5 3 6|
|Inorder	|Left → Root → Right	|4 2 5 1 3 6|
|Postorder	|Left → Right → Root	|4 5 2 6 3 1|
|Level Order	|BFS (Top to Bottom, Left to Right)|	1 2 3 4 5 6|


#### 2. Step-by-Step Breakdown of levelOrder(Node root)
### Step 1: Base Case (Handling an Empty Tree)
```
if (root == null) {
    return;
}
```
+ If the tree is `empty`, there is nothing to traverse, so we simply return.
### Step 2: Create a Queue to Process Nodes
```
Queue<Node> queue = new LinkedList<>();
queue.add(root);
```
+ We use a `queue (FIFO - First In, First Out) `to store nodes.
+ First, we add the root node to the queue.
### Step 3: Process Nodes Level by Level
```
while (!queue.isEmpty()) {
```
+ The loop runs until the queue is empty, meaning all nodes have been processed.
### Step 4: Remove the Front Node from Queue & Print It
```
Node current = queue.poll();
System.out.print(current.data + " ");
```
+ `poll() ``removes` the first node from the queue (FIFO).
+ Print its data.
### Step 5: Add Left & Right Children (if exist)

+ if (current.left != null) queue.add(current.left);
+ if (current.right != null) queue.add(current.right);
+ If the left child exists, we add it to the queue.
+ If the right child exists, we add it to the queue.
+ This ensures that nodes are processed in level order.
### 3. How Does It Work for This Tree?
```
        1
       / \
      2   3
     / \    \
    4   5    6
```
### Step-by-Step Execution
|Step|	Queue (Front → Back)|	Output (Printed)|	Action Performed|
|-------------|--------------|--------------------------|---------------|
|Start| 1|-|	Root node is added|
|Poll1| 2, 3	|1	|Add left 2, right 3
|Poll2|	3, 4, 5|1 2|Add left 4, right 5|
|Poll3|	4, 5, 6	|1 2 3	|Add right 6 (No left child)|
|Poll4|	5, 6	|1 2 3 4|	No children, move on|
|Poll5|	6	|1 2 3 4 5	|No children, move on|
|Poll6|	Empty	|1 2 3 4 5 6	|No children, loop exits|
### 4. Final Output
```
1
2 3
4 5 6
```
+ ✅ Correctly prints nodes level by level!

#### 5. Why Use a Queue?
+ A queue follows `FIFO (First In, First Out)`, ensuring that:

+ The root is processed first.
+ Then, its children are processed before their children.
+ This guarantees level-wise traversal.
#### 6. Time & Space Complexity
+ `Time Complexity: O(N)` (Each node is added and removed once)
+ `Space Complexity: O(N)` (In the worst case, the queue holds all leaf nodes)

#### 7. Alternative: Printing Each Level on a New Line
+ If you want to print each level separately, modify the method:
```
public static void levelOrderNewLine(Node root) {
    if (root == null) return;

    Queue<Node> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
        int size = queue.size(); // Number of nodes at the current level

        for (int i = 0; i < size; i++) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        System.out.println(); // New line after each level
    }
}
```
Output:

```
1
2 3
4 5 6
```
+ Now, each level is printed on a new line!

## Understanding sumOfNodes(Node root) Method
This method calculates the sum of all nodes' values in a binary tree using recursion.

1. Breakdown of the Code
```
public static int sumOfNodes(Node root) {
    if (root == null) {
        return 0;  // Base case: If the tree is empty, return 0
    }
    
    int leftSum = sumOfNodes(root.left);   // Sum of left subtree
    int rightSum = sumOfNodes(root.right); // Sum of right subtree
    
    return leftSum + rightSum + root.data;  // Total sum = Left Subtree + Right Subtree + Current Node's Data
}
```
2. How It Works
+ Recursively traverses the entire tree.
+ For each node, it calculates:
+ Sum of all nodes in the left subtree (leftSum).
+ Sum of all nodes in the right subtree (rightSum).
+ Adds the current node's value (root.data).
+ If the tree is empty (root == null), return 0.
3. Example Execution
+ Tree Structure
```
        1
       / \
      2   3
     / \    \
    4   5    6
```
Each node contains a numeric value, and the goal is to sum all values.

### Recursive Calls Breakdown
|Call	|Subtree Sum Calculation|
|--------|-----------------------|
|sumOfNodes(1)	|sumOfNodes(2) + sumOfNodes(3) + 1|
|sumOfNodes(2)	|sumOfNodes(4) + sumOfNodes(5) + 2|
|sumOfNodes(3)	|sumOfNodes(null) + sumOfNodes(6) + 3|
|sumOfNodes(4)	|sumOfNodes(null) + sumOfNodes(null) + 4 = 4|
|sumOfNodes(5)|	sumOfNodes(null) + sumOfNodes(null) + 5 = 5|
|sumOfNodes(6)|	sumOfNodes(null) + sumOfNodes(null) + 6 = 6|
#### Calculating Final Result
```
sumOfNodes(4) = 4
sumOfNodes(5) = 5
sumOfNodes(2) = 4 + 5 + 2 = 11
sumOfNodes(6) = 6
sumOfNodes(3) = 0 + 6 + 3 = 9
sumOfNodes(1) = 11 + 9 + 1 = 21
✅ Total Sum = 21
```

4. Output
```
System.out.println("Sum of Nodes: " + sumOfNodes(root));
```
Output:

```
Sum of Nodes: 21
```
#### 5. Time & Space Complexity
+ `Time Complexity: O(N) `(Visits each node once)
+ `Space Complexity: O(H)` (Recursive calls stack up to tree height H)

## Understanding treeHeight(Node root) Method
This method calculates the height (or depth) of a binary tree using recursion.

##### 1. What is the Height of a Tree?
+ Height of a tree is the number of edges in the longest path from the root to a leaf node.
+ Alternatively, it can be defined as the number of nodes in the longest path from root to leaf minus one.

```
  public static int treeHeight(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        
        int leftHeight = treeHeight(root.left);
        int rightHeight = treeHeight(root.right);
        
        int myheight = Math.max(leftHeight , rightHeight) + 1;
        
        return myheight;
    }
```

#### Recursive Calls Breakdown
|Call	|Subtree Height Calculation|
|-------|--------------------------|
|treeHeight(1)|	max(treeHeight(2), treeHeight(3)) + 1|
|treeHeight(2)|	max(treeHeight(4), treeHeight(5)) + 1|
|treeHeight(3)|	max(treeHeight(null), treeHeight(6)) + 1|
|treeHeight(4)|	max(treeHeight(null), treeHeight(null)) + 1 = 1|
|treeHeight(5)|	max(treeHeight(null), treeHeight(null)) + 1 = 1|
|treeHeight(6)|	max(treeHeight(null), treeHeight(null)) + 1 = 1|

### Calculating Final Height
```
treeHeight(4) = 1
treeHeight(5) = 1
treeHeight(2) = max(1, 1) + 1 = 2
treeHeight(6) = 1
treeHeight(3) = max(0, 1) + 1 = 2
treeHeight(1) = max(2, 2) + 1 = 3
✅ Final Height = 3 (Based on nodes)
```

4. Output
```
System.out.println("Tree Height: " + treeHeight(root));
```
Output:
```
Tree Height: 3
```
### 5. Time & Space Complexity
+ `Time Complexity: O(N)` (Each node is visited once)
+ `Space Complexity: O(H)` (Recursive call stack depth equals the height H)
#### 6. Summary
+ ✅ Uses recursion to compute height
+ ✅ `Base case`: If root == null, return 0
+ ✅` Formula:` Math.max(leftHeight, rightHeight) + 1
+ ✅ Efficient: Works in `O(N)` time

## diameter

#### 1. Understanding the Diameter of a Tree
+ The diameter of a binary tree is the longest path between any two nodes.
+ This path may or may not pass through the root.
#### Formula for Diameter
For each node, the diameter is calculated as:
```
diameter = left subtree height + right subtree height + 1 ;
```
+ `diameter`=`left subtree height`+`right subtree height`+`1`
+ We also compute the diameter of the left and right subtrees.
+ The final diameter is the maximum of these three values.
##### 2. Why is the Brute Force Approach Inefficient?
+ The naive recursive approach separately calls treeHeight(root.left) and treeHeight(root.right), leading to repeated calculations.
+ This results in an O(n²) time complexity, which is inefficient for large trees.
##### 3. Optimized Approach (O(n) Solution)
We solve this problem in a single traversal by returning both height and diameter together using a helper class.

```
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

class TreeDiameter {
    static class TreeInfo {
        int height;
        int diameter;
        TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static int diameter(TreeNode root) {
        return diameterHelper(root).diameter;
    }

    private static TreeInfo diameterHelper(TreeNode root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo left = diameterHelper(root.left);
        TreeInfo right = diameterHelper(root.right);

        int currentHeight = Math.max(left.height, right.height) + 1;
        int currentDiameter = left.height + right.height + 1;
        int maxDiameter = Math.max(currentDiameter, Math.max(left.diameter, right.diameter));

        return new TreeInfo(currentHeight, maxDiameter);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Diameter of the tree: " + diameter(root)); // Output: 4
    }
}

```

### optimize apporoch 

```

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

class TreeDiameter {
    static class Treeinfo {
        int height;
        int diameter;

        Treeinfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static Treeinfo diameter2(TreeNode root) {
        if (root == null) {
            return new Treeinfo(0, 0);
        }

        Treeinfo left = diameter2(root.left);
        Treeinfo right = diameter2(root.right);

        int myHeight = Math.max(left.height, right.height) + 1;

        int diam1 = left.diameter;
        int diam2 = right.diameter;
        int diam3 = left.height + right.height + 1;

        int myDiam = Math.max(diam3, Math.max(diam1, diam2));

        return new Treeinfo(myHeight, myDiam);
    }

    public static int diameter(TreeNode root) {
        return diameter2(root).diameter;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Diameter of the tree: " + diameter(root)); // Output: 4
    }
}
```

### 7. Example Walkthrough
Consider this tree:
```
       1
      / \
     2   3
    / \
   4   5
```
### Step-by-Step Calculation
+ Compute TreeInfo for Node 4 → height = 1, diameter = 1
+ Compute TreeInfo for Node 5 → height = 1, diameter = 1
+ Compute TreeInfo for Node 2:
+ height = max(1,1) + 1 = 2
+ diameter = 1 + 1 + 1 = 3
+ Compute TreeInfo for Node 3 → height = 1, diameter = 1
+ Compute TreeInfo for Node 1:
+ height = max(2,1) + 1 = 3
+ diameter = 2 + 1 + 1 = 4
+ Final Diameter = 4 ✅

### 8. Why is This Approach Better?
|Approach	|Time Complexity	|Space Complexity|	Reason|
|--------------|----------------------|------------------|------------|
|Brute Force|	O(n²)	|O(h)	|Recomputes height multiple times|
|Optimized (Single Traversal)|	O(n)	|O(h)	|Computes height & diameter together|

## Conclusion
+ ✅ We optimized the diameter of a binary tree using a single traversal approach, reducing time complexity to O(n).
+ ✅ We used a helper class (TreeInfo) to store height and diameter together to avoid redundant computations.
+ ✅ This is the most efficient and clean way to solve the problem in Java. 🚀

Let me know if you have any doubts! 😊



## Binary Search Tree (BST) in Java

+ A `Binary Search Tree (BST)` is a binary tree where:

+ The left child contains `only nodes with values less than the parent node.`
+ The right child contains `only nodes with values greater than the parent node.`
+ The left and right subtrees must also be `BSTs` (recursive property).
### 1. BST Node Structure
Each node in a BST contains:

+ An integer value
+ Left child
+ Right child
##### Java Code for BST Node
```
class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}
```
#### 2. BST Operations
##### (a) Insert a Node
+ If the root is `null`, create a new node.
+ If `val < root.val`, insert in the `left subtree`.
+ If `val > root.val,` insert in the `right subtree`.
```
public TreeNode insert(TreeNode root, int val) {
    if (root == null) {
        return new TreeNode(val);
    }
    if (val < root.val) {
        root.left = insert(root.left, val);
    } else if (val > root.val) {
        root.right = insert(root.right, val);
    }
    return root;
}
```
#### (b) Search for a Node
+ If `root == null` → Not found.
+ If `val == root.val` → Found.
+ If `val < root.val` → Search in left subtree.
+ If `val > root.val` → Search in right subtree.
```
public boolean search(TreeNode root, int val) {
    if (root == null) {
        return false;
    }
    if (root.val == val) {
        return true;
    }
    return (val < root.val) ? search(root.left, val) : search(root.right, val);
}
```
#### (c) Find Minimum and Maximum Value
```
public int findMin(TreeNode root) {
    while (root.left != null) {
        root = root.left;
    }
    return root.val;
}

public int findMax(TreeNode root) {
    while (root.right != null) {
        root = root.right;
    }
    return root.val;
}
```
#### (d) Delete a Node
##### Three Cases:
1. `Node has no children `→ Simply remove it.
2. `Node has one child `→ Replace it with its child.
3. `Node has two children` → Replace with `inorder successor (smallest node in the right subtree).`
```
public TreeNode delete(TreeNode root, int val) {
    if (root == null) {
        return null;
    }

    if (val < root.val) {
        root.left = delete(root.left, val);
    } else if (val > root.val) {
        root.right = delete(root.right, val);
    } else {
        // Case 1: No child or one child
        if (root.left == null) {
            return root.right;
        } else if (root.right == null) {
            return root.left;
        }

        // Case 2: Two children → Replace with inorder successor
        root.val = findMin(root.right);
        root.right = delete(root.right, root.val);
    }
    return root;
}
```
#### (e) Traversals in BST
##### 1. Inorder Traversal (Left → Root → Right)
+ Prints nodes in `ascending order` for BST.
```
public void inorder(TreeNode root) {
    if (root != null) {
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
}
```
##### 2. Preorder Traversal (Root → Left → Right)
```
public void preorder(TreeNode root) {
    if (root != null) {
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
}
```
##### 3. Postorder Traversal (Left → Right → Root)
```
public void postorder(TreeNode root) {
    if (root != null) {
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }
}
```
#### 3. Complete Java BST Program
```
class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class BST {
    public TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else if (val > root.val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public boolean search(TreeNode root, int val) {
        if (root == null) {
            return false;
        }
        if (root.val == val) {
            return true;
        }
        return (val < root.val) ? search(root.left, val) : search(root.right, val);
    }

    public int findMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.val;
    }

    public int findMax(TreeNode root) {
        while (root.right != null) {
            root = root.right;
        }
        return root.val;
    }

    public TreeNode delete(TreeNode root, int val) {
        if (root == null) {
            return null;
        }

        if (val < root.val) {
            root.left = delete(root.left, val);
        } else if (val > root.val) {
            root.right = delete(root.right, val);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.val = findMin(root.right);
            root.right = delete(root.right, root.val);
        }
        return root;
    }

    public void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();
        TreeNode root = null;

        int[] values = { 50, 30, 70, 20, 40, 60, 80 };
        for (int val : values) {
            root = tree.insert(root, val);
        }

        System.out.println("Inorder Traversal:");
        tree.inorder(root);
        System.out.println();

        System.out.println("Search 40: " + tree.search(root, 40));
        System.out.println("Search 100: " + tree.search(root, 100));

        System.out.println("Min Value: " + tree.findMin(root));
        System.out.println("Max Value: " + tree.findMax(root));

        System.out.println("Deleting 40...");
        root = tree.delete(root, 40);

        System.out.println("Inorder Traversal After Deletion:");
        tree.inorder(root);
    }
}
```
#### 4. Sample Output
```
Inorder Traversal:
20 30 40 50 60 70 80 

Search 40: true
Search 100: false

Min Value: 20
Max Value: 80

Deleting 40...
Inorder Traversal After Deletion:
20 30 50 60 70 80
```
### 5. Time Complexity Analysis
|Operation	|Best Case (Balanced BST)	|Worst Case (Skewed BST)|
|---------------|-----------------------------|-------------------------|
|Insertion	|O(log n)|	O(n)|
|Search	|O(log n)|	O(n)|
|Deletion	|O(log n)	|O(n)|

#### Key Takeaways
+ ✅ BST is useful for fast searching, insertion, and deletion (O(log n) on average).
+ ✅ Inorder traversal always returns elements in sorted order.
+ ✅ Balancing a BST (e.g., AVL Tree, Red-Black Tree) improves performance.


## Understanding BST (Binary Search Tree) Implementation in Java
+ A `Binary Search Tree (BST)` is a `binary tree` in which:

+ The `left child `of a node contains only nodes with values `less than `the parent node.
+ The `right child `of a node contains only nodes with values `greater than ` the parent node.
+ No duplicate values (in our implementation).
### Step-by-Step Breakdown of the Code
#### 1. Creating a Node Class
Each node in the BST contains:

+ `data:` The value stored in the node.
+ `left:` A reference to the left child node.
+ `right:` A reference to the right child node.
```
static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) { // Constructor to initialize the node with data
        this.data = data;
    }
}
```
#### 2. Inserting a Node in BST
The `insert() `function inserts a new value into the BST while maintaining the BST properties.

##### Insertion Logic
+ If `root == null,` create a new node and return it.
+ If `val < root.data,` insert it into the left subtree.
+ If `val > root.data,` insert it into the right subtree.
+ If `val == root.data`, we `ignore duplicates` in our implementation.
```
public static Node insert(Node root, int val) {
    if (root == null) {
        return new Node(val); // Create a new node if tree is empty
    }

    if (val < root.data) { 
        root.left = insert(root.left, val); // Insert in left subtree
    } else if (val > root.data) { 
        root.right = insert(root.right, val); // Insert in right subtree
    }
    
    return root; // Return the updated root
}
```
#### 3. Inorder Traversal
The `inorder()` function prints the BST elements in sorted order.

#### Inorder Traversal Logic
First, visit the `left subtree`.
Then, print the `current node`.
Finally, visit the `right subtree`.
```
public static void inorder(Node root) {
    if (root == null) {
        return;
    }

    inorder(root.left); // Traverse left
    System.out.print(root.data + " "); // Print current node
    inorder(root.right); // Traverse right
}
```
## 4. Main Function (Creating and Traversing the BST)
+ We insert multiple values into the BST.
+ Then, we perform `inorder traversal `to print the values in sorted order.
```
public static void main(String[] args) {
    int values[] = {5, 1, 3, 4, 5, 7}; // Input array
    Node root = null;

    for (int value : values) {
        root = insert(root, value); // Insert values into BST
    }

    System.out.print("Inorder Traversal: ");
    inorder(root); // Print BST elements in sorted order
}
```
### Example Execution with Step-by-Step Insertion
+ Given Input Array: `{5, 1, 3, 4, 5, 7}`
#####  Step 1: Insert 5
```
   5
```
##### Step 2: Insert 1 (Since 1 < 5, it goes to the left of 5)
```
   5
  /
 1
```
##### Step 3: Insert 3 (Since 3 < 5, move left → 3 > 1, so insert in the right of 1)
```
   5
  /
 1
  \
   3
```
##### Step 4: Insert 4 (Since 4 < 5, move left → 4 > 1, move right → 4 > 3, insert in right of 3)
```
   5
  /
 1
  \
   3
    \
     4
```
##### Step 5: Insert 5 (Duplicate value, ignored)
##### Step 6: Insert 7 (Since 7 > 5, insert in the right of 5)
```
   5
  / \
 1   7
  \
   3
    \
     4
```
### Final BST Structure
```
       5
      / \
     1   7
      \
       3
        \
         4
```
#### 5. Performing Inorder Traversal
+ Inorder traversal (Left → Root → Right) prints values in sorted order:
```
1 3 4 5 7
```
#### Final Output
```
Inorder Traversal: 1 3 4 5 7
```
### Summary
+ ✔ `Binary Search Tree (BST)` is used for efficient insertion, deletion, and searching.
+ ✔ `Inserting elements` follows the BST property (left < root < right).
+ ✔ `Duplicates are ignored` in our implementation.
+ ✔ `Inorder traversal` prints values in ascending order.



### Search in BST 

```
 public static boolean search(Node root , int key)
   {
       if(root == null)
       {
           return false;
       }
       
       if(root.data > key)
       {
        //   left subtree
          return search(root.left , key);
       }
       else if(root.data == key)
       {
           return true;
       }
       else 
       {
        //   right subtree
        return search(root.right, key);
       }
   }
	public static void main(String[] args) {
	
	int values[] = {8,5,3,1,4,6,10,11,14};
	Node root = null;
	
	
	for(int i = 0 ;i<values.length;i++)
	{
	    root = insert(root,values[i]);
	}
	
	 System.out.println("\nInorder Traversal: ");
        inorder(root);
        
        
       if(search(root , 7))
       {
           System.out.println("\nkey found.");
       }
       else{
           System.out.println( "key not found.");
            
       }
        
	
	}
    
}
```
## delete Node 

```
   public static Node delete(Node root, int val)
   {
       if(root == null) return null; // Edge case: empty tree

       if(root.data > val) {
           root.left = delete(root.left , val); // ✅ Corrected
       }
       else if(root.data < val) {
           root.right = delete(root.right , val); // ✅ Corrected
       }
       else {
           // Node found

           // Case 1: No child
           if(root.left == null && root.right == null) {
               return null;
           }

           // Case 2: One child (right or left)
           if(root.left == null) {
               return root.right;
           }
           else if(root.right == null) {
               return root.left;
           }

           // Case 3: Two children
           Node IS = inordersuccessor(root.right); // ✅ Fixed function call
           root.data = IS.data; // Replace with inorder successor
           root.right = delete(root.right , IS.data); // Delete inorder successor
       }
       
       return root;
   }
   
   // ✅ Fixed function name (typo) and assignment
   public static Node inordersuccessor(Node root)
   {
       while(root.left != null) {
           root = root.left; // ✅ Fixed assignment
       }
       return root;
   }
```
```
Inorder Traversal: 
1 3 4 5 6 8 10 11 14 

Key not found.

After deleting 10:
1 3 4 5 6 8 11 14

```

## print in range 

### Step-by-Step Execution:
+ Start at 8 (within range) → Print 8 → Search left & right.
+ Move to 5 (less than 6) → Search right only.
+ Move to 6 (within range) → Print 6 → Search right.
+ Move to 10 (within range) → Print 10 → Search left & right.
+ Move to 11 (greater than 10, so stop searching).
```
public static void printrange(Node root , int x , int y)
{
    if(root == null)
    {
        return;
    }

    // If root's data is greater than x, search in the left subtree
    if(root.data > x)
    {
        printrange(root.left, x, y);
    }

    // If root's data is within the range, print it
    if(root.data >= x && root.data <= y)
    {
        System.out.print(root.data + " ");  // ✅ Correctly printing values in range
    }

    // If root's data is less than y, search in the right subtree
    if(root.data < y)
    {
        printrange(root.right, x, y);
    }
}

```
Example Execution
Given BST:
```
        8
       / \
      5   10
     / \    \
    3   6    11
   / \        \
  1   4       14
```
Input:
```
printrange(root, 6, 10);
```

Correct Output:
```
6 8 10
```

## root to leaf path 
```
 public static void printpath(ArrayList<Integer> path)
   {
       for(int i = 0 ;i<path.size();i++)
       {
           System.out.print(path.get(i)+" -> ");
       }
       System.out.println();
   }
   
   public static void printroot2leaf(Node root , ArrayList<Integer> path )
   {
      if(root == null)
      {
          return ;
      }
      
      path.add(root.data);
      
    //   leaf 
    
    if(root.left == null && root.right == null)
    {
        printpath(path);
    }
    else{  // non leaf 
         
         printroot2leaf(root.left,path);
         printroot2leaf(root.right, path);
    }
    path.remove(path.size()-1);
   }

```

output 
```
 print root to path 8 -> 5 -> 3 -> 1 -> 
8 -> 5 -> 3 -> 4 -> 
8 -> 5 -> 6 -> 
8 -> 10 -> 14 -> 
```
## all concept in one code 

```
import java.util.*;
public class BST
{
   static class Node {
       int data;
       Node left;
       Node right;
       
       Node(int data) {
           this.data = data;
       }
   }
   
   public static Node insert(Node root , int val)
   {
       if(root == null) {
           return new Node(val);
       }
       
       if(root.data > val) {
           root.left = insert(root.left , val);
       }
       else if(root.data < val) {
           root.right = insert(root.right , val);
       }
       
       return root;
   }
   
   public static void inorder(Node root)
   {
       if(root == null) {
           return;
       }
       
       inorder(root.left);
       System.out.print(root.data + " ");
       inorder(root.right);
   }
   
   public static Node delete(Node root, int val)
   {
       if(root == null) return null; // Edge case: empty tree

       if(root.data > val) {
           root.left = delete(root.left , val); // ✅ Corrected
       }
       else if(root.data < val) {
           root.right = delete(root.right , val); // ✅ Corrected
       }
       else {
           // Node found

           // Case 1: No child
           if(root.left == null && root.right == null) {
               return null;
           }

           // Case 2: One child (right or left)
           if(root.left == null) {
               return root.right;
           }
           else if(root.right == null) {
               return root.left;
           }

           // Case 3: Two children
           Node IS = inordersuccessor(root.right); // ✅ Fixed function call
           root.data = IS.data; // Replace with inorder successor
           root.right = delete(root.right , IS.data); // Delete inorder successor
       }
       
       return root;
   }
   
   // ✅ Fixed function name (typo) and assignment
   public static Node inordersuccessor(Node root)
   {
       while(root.left != null) {
           root = root.left; // ✅ Fixed assignment
       }
       return root;
   }
   
   public static boolean search(Node root , int key)
   {
       if(root == null) {
           return false;
       }
       
       if(root.data > key) {
           return search(root.left , key);
       }
       else if(root.data == key) {
           return true;
       }
       else {
           return search(root.right, key);
       }
   }
   
   
   //------------------- print range--------------------- 
   
   
   
   public static void printrange(Node root , int x , int y)
   {
       if(root == null)
       {
           return ;
       }
       
        // If root's data is greater than x, search in the left subtree
    if(root.data > x)
    {
        printrange(root.left, x, y);
    }

    // If root's data is within the range, print it
    if(root.data >= x && root.data <= y)
    {
        System.out.print(root.data + " ");  // ✅ Correctly printing values in range
    }

    // If root's data is less than y, search in the right subtree
    if(root.data < y)
    {
        printrange(root.right, x, y);
    }
   }
//   --------------------------------------------------------------------------
   // root to leaf paths 
   public static void printpath(ArrayList<Integer> path)
   {
       for(int i = 0 ;i<path.size();i++)
       {
           System.out.print(path.get(i)+" -> ");
       }
       System.out.println();
   }
   
   public static void printroot2leaf(Node root , ArrayList<Integer> path )
   {
      if(root == null)
      {
          return ;
      }
      
      path.add(root.data);
      
    //   leaf 
    
    if(root.left == null && root.right == null)
    {
        printpath(path);
    }
    else{  // non leaf 
         
         printroot2leaf(root.left,path);
         printroot2leaf(root.right, path);
    }
    path.remove(path.size()-1);
   }

   public static void main(String[] args) {
       int values[] = {8,5,3,1,4,6,10,11,14};
       Node root = null;
       
       for(int value : values) {
           root = insert(root, value);
       }
       
       System.out.println("\nInorder Traversal: ");
       inorder(root);

       // Search example
       if(search(root , 7)) {
           System.out.println("\nKey found.");
       }
       else {
           System.out.println("\nKey not found.");
       }

       // Deleting a node
       root = delete(root, 11);
       System.out.println("\nAfter deleting 10:");
       inorder(root);
       
       
    //    print in range 
    System.out.println("\n print in range:");
       printrange(root , 6 , 10);
       
       
       // print root to leaf paths 
       System.out.print("\n print root to path ");
       printroot2leaf(root,new ArrayList<>());
       
       
   }
   
}

```

output 
```


Inorder Traversal: 
1 3 4 5 6 8 10 11 14 
Key not found.

After deleting 10:
1 3 4 5 6 8 10 14 
 print in range:
6 8 10 
 print root to path 8 -> 5 -> 3 -> 1 -> 
8 -> 5 -> 3 -> 4 -> 
8 -> 5 -> 6 -> 
8 -> 10 -> 14 -> 
```
