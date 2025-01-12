
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
