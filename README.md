# LearningJavaProject

A project for learning Java.

This is a project to help get an understanding of some of the basic functionality of Java programming. It provides a handy way
to complete the exercises in LearningJava.txt.

## Installing Java

If you need to install Java, it's available from https://adoptopenjdk.net

You will want to install at least version 14. 

If you have admin access to your computer, use the installer. If you don't (for example, on a school laptop), download the .zip file for Windows here: https://adoptopenjdk.net/releases.html?variant=openjdk14&jvmVariant=hotspot

## Installing Visual Studio Code

If you need to install VS Code, get it here: https://code.visualstudio.com/

## Some vocabulary:

- **comment**: In your program, you may want to put notes to yourself or to other developers. Java lets you
	to this in two ways, either by making two / characters to indicate that everything after the `//`'s is
	just a comment and should be ***ignored by the computer***, or by surrounding your comment with `/*` and `*/`.
	
	Examples:
```java
		// This is a comment
		/* This is also a comment*/
		/*
			This comment
			goes across many lines
			Until I get to the end sequence.
		*/
```

- **character**: something you can print out, like a letter. When you type, you are entering characters into some program.
	In a Java program, when you want to talk about a particular character, you put it in single quotes, like this:

```java
		'a' 
		'9'
		' ' // (the space character)
		'\n' // (This character is called "newline", and you spell it with a \ and an n. This is an example of a "control sequence".)
```

    Notice the comments above. This is an example of using comments to explain code.

- **string**: a sequence of characters. In a Java program, strings are put in double quotes, like this:

```java
	"This is a string"
```

- **print**: When we want to have some information displayed on the Console, we call that "printing". In Java, you can print the message `This is a message` like this:

```java
    System.out.println("This is a message");
```
	
- `int`: an integer. This is a number with no decimal or fractional part. In Java, an `int` can store
	any number from -2,147,483,648 up to 2,147,483,647, inclusive.
	
- **variable**: a named place to store a value of a particular type. You can put any integer into
	an `int` variable, and any string into a `String` variable. Similarly for other types
	of values. Examples:

```java
	int x; // "Declaring" a variable. This tells Java to create a chunk of memory big enough to
			// store an integer (32 bits, which is 4 bytes), and to give that chunk of memory
            // the name "x".
            
    int x = 123; // When you declare a variable, you can also give it an initial value. This is usually a good idea.
			
    x = 42; // Now I've stored the integer 42 into the location x.
    
	x = x + 1; // Now x has the value 43, because this line reads the current value of x, adds 1 to it,
                // and then stores the result back into x.
                
    x += 1;  // This is a shorter way of writing "x = x + 1"
    
    x++;  // This is an even shorter way, where we don't even say 1
    
    String str = "Hello World";
```

- **comparison**: There are lots of ways of comparing values in Java

```java
	x == y   // Is x equal to y?
	x != y   // Is x not equal to y?
	x > y    // Is x greater than y?
	x < y    // Is x less than y?
	x >= y   // Is x greater than or equal to y?
	x <= y   // Is x less than or equal to y?
```

- **block**: a sequence of lines of code, usually inside a pair of braces like this:

```java
	{
		// do something
		// do something else
		// etc.
	}
```

- **method** (or **function**): code that actually does something. (More on this later.)

- **class**: In Java, all code is organized into "classes", so initially you can think of a class as
    a container to put "methods" and variables.

---------------------

## Now on to the problems. 

You will need to download a copy of this project to your machine. I recommend using the `Code`
button at the top of the page, and selecting `Open with GitHub Desktop` to get a live
version of this code on your machine.

Once you have this downloaded, open the downloaded folder in Visual Studio Code. There will be
an expandable file list displayed, and you should open the folders to find the
file `src\main\java\learningjava\App.java`. This file is where you will work on writing
your own Java code to complete the tasks below.

Once you have this file open, you will see that there is a method called `main`. And
right above that method, if you have successfully installed Java, you will see
the words `Run|Debug`. These words are links to run your program and print out
the results in the `Terminal` view at the bottom of the window.

Try clicking `Run` and see what the program prints out before you have
completed any of the tasks below.

-------------------

## Programming Tasks

1. Hello World

    Change the method `problem1` to print out "Hello Word" when it is called by `main`.

    ***Hint:*** System.out.println is a method that prints out a string on a single line.

-------------------
2. Counting

    Change the method `problem2` to print out the numbers from 1 to 10, each on a separate line.

    ***Hint:*** Use a `while` loop. This is a way to repeat a block of code for as long as the
    "test" (which is the expression in parentheses after the `while`) is true. For example, the
    following code adds together the numbers from 1 to 100, storing the result in `sum`

```java
    int number = 1;
    int sum = 0;

    // The test in this while statement will be true as long as number is less than or equal to 100.
    while (number <= 100) {
	    sum += number;
	    number++;
    }
```

A closely related statement is `for`. It's really common to add 1 to a variable for each time through
the block of code, which is what happens to `number` in the example above. (This is called "incrementing"
the variable.) Since it's so common, there is a special way of writing it, using a `for` loop.

```java
    int sum = 0;
    for (int number = 1; number <= 100; number++) {
	    sum += number;
    }
```

***Hint:*** In Java, an easy way to turn any variable into a string that you can print is to append it to the end
of an empty string, like this:

```java	
	int number = 42;
	String numberString = "" + number;
```

-------------------

3. More complex counting

    Change the method `problem3` to print the numbers from 1 to 100, with ten numbers on each line, like this:

```
1 2 3 4 5 6 7 8 9 10
11 12 13 14 15 16 17 18 19 20
21 22 23 24 25 26 27 28 29 30
...
```

***Hint:*** `System.out.print` is a method that prints a string without moving to a new line, and
`System.out.println` is a method that prints a newline after whatever string you pass to it.
You can also create a newline with the `\n` character sequence like this: `System.out.print("\n");`

***Hint:*** You can put anything inside a loop. Including another loop. For example, you can do something like:

```java
	for (int row = 0; row < 3; row++) {
		for (int column = 0; column < 3; column++) {
			System.out.println("Row = " + row + ", Column = " + column);
		}
	}
```

-------------------

4. My first method

Change the method `power` (which is right before the `problem4` method) to computes x to the y power.

When you're writing an essay, you don't put everything into one paragraph. Similarly,
when you're programming, you don't put everything into the `main` method. Instead, you
write a number of smaller methods to split up the work, so the `main` method can be a sequence
of calls to other methods.

```java
public static void main(String[] args) {
	doFirstThing();
	doSecondThing();
	doThirdThing();
}
```

But breaking up big methods into a collection of smaller ones isn't the real power of writing
new methods. The real power is when a methods has "parameters", that let you tell the method
the value to use in for a variable, and the method also has a `return`, which lets the method
tell its caller the result of the function.

For example, this is a function to compute the square of a number:

```java
static int square(int x) {
	return x * x;
}
```

In the function `square`, the parameter is an `int` named `x`, and the function `square` returns an `int`.
(And the value that it returned is the value of `x` times `x`.)

Methods are "called" from other methods. The only exception is `main`, which is called by the operating system
when you start your program.

Call this method from `main` with several different combinations of x and y, and print out the result, like:
2 to the power of 3 is 8
3 to the power of 4 is 81
10 to the power of 5 is 100000
...

***Hint:*** In Java, an easy way to build strings is by using + to append them, like this:
	String name = "Pikachu";
	int age = 3;
	String message = name + " is " + age + " years old.";
	
-------------------
 
5. Power table

Change the method `problem5` to print out a table of x to the power of y. In this table, `x` counts the numbers
as you go from left to right in the table, and `y` counts the numbers as you go from top to bottom
in the table. Each number in the table is calculated using the `power` method that you wrote for problem 4.

The result should look like this:

```
1 1 1 1 1 1 1 1 1 1
2 4 8 16 32 64 128 256 512 1024
3 9 27 81 273 729 2187 6561 19683 59049
4 16 64 256 1024 4096 16384 65536 262144 1048576
5 25 125 625 3125 15625 78125 390625 1953125 9765625
```

-------------------

6. Booleans and if statements

`int` is a data type that can hold any integer (within limits). But in programming, it's very, very common
to want to talk about values that can only be either true or false. Is the light on? Is the robot moving?
Is the number zero? Is the password correct? For cases like that, there is a special data type called `boolean`.
(The name is from George Boole, who invented a type of logic about combining variables that can be
true or false. We call this kind of logic "Boolean logic" or "Boolean algebra".) 

Use it like this:

```java
boolean isSomethingWrong = false; // you can set booleans directly to true or false
boolean isNegative = (n < 0); // built-in comparison operators produce booleans.

boolean isStatusOk() {
	// you can return booleans, just like ints
	return !isSomethingWrong; // The ! is a boolean operator
}
```

Since boolean logic is so important in programming, here's a list of the boolean operators you're likely to encounter:

`!` is "not". It converts `true` to `false`, and `false` to `true`.
`&&` is "and". `a && b` is `true` if both `a` and `b` are `true`, and `false` otherwise.
`||` is "or". `a || b` is `true` if `a` is `true`, or if `b` is `true`, or both are `true`.

Some places where you might encounter booleans are in `while` and `for` loops (as we saw in exercise 2), and in
`if` statements.

An `if` statement looks like a whil loop:

```java
if (n < 100) {
	// do something
}
```

The difference is that `while` loops will repeat over and over, until the boolean condition in parentheses after the word "while"
evaluates to false. `if` statements are only evaluated once. If the condition is true, then you execute the block following. If not, you don't.

It's also possible to extend an `if` statement, to tell it what to do in case the condition is false:

```java
if (n < 100) {
	// do something
}
else {
	// n was not less than 100. Do something else.
}
```

And you can go even further, using `else if` after the intial `if`: 

```java
if (n < 100) {
	// something
}
else if (n > 200) {
	// something else
}
else if (n == 147) {
	// yet another thing.
}
else {
	// if nothing else in the sequence was true
}
```

The way this works is:
- First the condition in the `if` clause is checked. If that's true, then do whatever is inside
	the block connected to the `if`. And then skip all of the following `else` and `else if` clauses.

- Next look at the first `else if` clause. If the condition in it is true, then do
	what is in the block, and skip all the following `else` and `else if` clauses
	
- Then look at the next `else if`, using the same rule. (And so on.)

- Finally, if none of the `if` and `else if` conditions were true, do whatever the `else`
	clause says. (If there is an `else`.)
	

Question: What does this program print out?

```java
int number = 42;

if (number > 0) {
	System.out.println("A");
}

if (number < 0) {
	System.out.println("B");
}
else if (number > 5) {
	System.out.println("C");
}
else if (number > 10) {
	System.out.println("D");
}
else {
	System.out.println("E");
}
```


7. Arrays

If you have a number of values to store, you might create a lot of variables. For example, if you want to record a series of
distance measurements, you might have a lot of variables like:

```java
int distance0;
int distance1;
int distance2;
int distance3;
// ...
```

But you can do this more easily, and more flexibly, by using an "array". An array lets you
say that you want a certain number of places to store values of a given type.

```java
int[] distances = new int[5]; // 5 is the "size" of the array.
```

Then you can use particular locations in the array ("elements" of the array) as variables of the
element type. You specify an element of the array by giving its "index", which is the number that
tells you which position in the array you want. 

NOTE: The first element in the array is at index 0, and the last element is at index (size - 1) !!!!

```java
distances[0] = 42;
```

Why is this useful? Because sometimes you don't know how many elements you want to have. Also,
it makes programming easier if you can use a number to indicate which variable you're talking
about. Also, an array is itself a variable, of type "array of whatever", which means that you
can have variables and parameters that are arrays. So you might create a method like this:

```java
static void printMessage(int number, String[] colors) {
	System.out.println("Color #" + number + " is " + colors[number]);
}
```

And then you might use that method like this:

```java
String[] colors = new String[4];
colors[0] = "red";
colors[1] = "blue";
colors[2] = "green";
colors[3] = "magenta";

int userSelectedColor = 2;

printMessage(userSelectedColor, colors);
```

***Task:*** Write a method that returns an array containing all of the integers from
	0 to a value n that is specified by the caller. It should look something like
	this:
	
```java
static int[] numbersUpToN(int n) {
	int[] integers = new int[n+1]; // Can you see why we need n+1 elements?
	
	// Fill in the "integers" array with the correct values
	// Hint: Use a for loop.
		
	return integers;
}
```

--------------------------------------------------------------------------


8. let's use arrays to solve a problem!

Do you remember prime numbers from math class? The oldest way of finding prime numbers is called
"The Sieve of Eratosthenes". This is something you can do on paper, by writing down the numbers
from 0 to 100. Then you start "sieving" the numbers. 

Skip over 0 and 1, since they're not prime by 
definition. Put your finger on the number 2, and then cross off all the numbers after 2 that
you reach by stepping forward 2 numbers at a stride. (4, 6, 8, 10, ...). Then move your finger
to the next number that hasn't been crossed off yet (3), and cross off all the numbers after
3 that you reach by stepping forward 3 numbers at a stride (6, 9, 12, 15, ...) It's OK to
cross off numbers again. Continue this by moving your finger to the next un-crossed-off number,
count forward the number of spaces given by the number under your finger, cross off, count forward
the same number, etc., until you reach the end of the list. And then move your finger forward and repeat.

Implement the Sieve of Eratosthenes as a method like this:

```java
static int[] findPrimesLessThanN(int n)
{
	// We're using possiblePrimes to keep track of which numbers we've
	// eliminates as possibly being prime. This is like crossing them off a
	// sheet of paper. Here, we're making use of the array index to indicate what
	// the number is, so the only information about the number we have to store
	// is whether or not we've crossed it off our list.

	boolean[] possiblePrimes = new boolean[n];
	// First: set all the elements of possiblePrimes to true.

	// Second: set possiblePrimes[0] and possiblePrimes[1] to false, since we know
	// by definition that 0 and 1 are not prime.
	
	// Third: Make a for loop. Have a variable currentPossible that starts at 2, and have the
	// loop continue for as long as currentPossible < n, and increment by 1.
	
	// Fourth: INSIDE the for loop mentioned above, make another for loop. This one should have
	// a variable currentMultiple that starts at (currentPossible + currentPossible), and continues
	// for as long as currentMultiple < n, and increment by currentPossible.
	
	// Fifth, INSIDE this inner for loop, set possiblePrimes[currentMultiple] to false
	
	
	// Sixth: OK, this is outside of both for loops. Now you need to count how many elements in possiblePrimes
	// are true. This is going to be the number of elements to return as primes.
	
	// Seventh: Create an array of ints big enough to fit all the primes
	
	// Eighth: Create a variable currentPrimeIndex = 0

	// Ninth: Using a for loop with index i, go through the array of possiblePrimes. 
	// Every time you find a true value, set primes[currentPrimeIndex] = i.
	// Then increment currentPrimeIndex
	
	// Tenth: Return primes.
	// 
}
```

9. Classes

All code in Java is in the form of classes. All the examples you've worked on so far in the App.java file
have been method in the class `App`. Now we're going to work with some new classes and use them to make some unit tests pass.

A class is two things. First, it is a recipe for creating instances (which are also called "objects").
When you want to make an instance of a class, you use the "new" operator to "instantiate" the class.
For example, there is a class in Java called "Object". If I want to create an instance of this class,
I can do it like this:

Object obj;
obj = new Object();

The first line of code says that there is a variable named "obj" that can contain instances of the class "Object".
The second line creates a new instance of Object and assigns it to the variable obj.

Now, Object is an important class in Java, but it's not very interesting for our example. Let's create an
example class called "ClickCounter". Instances of the class ClickCounter will have a method called "click" a
method called "getCount". getCount will return the number of times click has been called on that particular
instance of ClickCounter. Here is the code:

```java
class ClickCounter {
	private int count = 0;

	public void click() {
		count++; // add 1 to count
	}

	public int getCount() {
		return count;
	}
}
```

Now we can create any number of instances of ClickCounter, and each one will keep track of how many
times its click has been called. Look in the file ClickCounterTest.java (located in the
directory learningjava/src/test/java/com/bitsforabetterworld/learningjava) at the test method 
"TestEachClickCounterCountsIndependently" to see a demonstration of this.

In addition to member variables and methods, which are attached to an individual instance of the 
class, Java classes can have "class variables" (also called "static variables") and "class methods"
(also called "static methods"), which are shared by every instance of the class. In the same file,
there is another class called StaticClickCounter, which is the same as ClickCounter, except
that its "count" variable has the word "static" in front of it. This makes count a class variable,
so all instances of StaticClickCounter share the same count. See how this makes counting
different by looking at TestStaticClickCounterOnlyHasOneCount. This test does the same steps as
TestEachClickCounterCountsIndependently, but the result is different: both ca and cb report
10 clicks, instead of 3 for ca and 7 for cb.

Now, for an exercise:

In the file CalculatorTest.java, there is a class Calculator, which has methods add, subtract,
multiply, and getValue. Make this class implement these methods so the tests in CalculatorTest.java
all pass.

