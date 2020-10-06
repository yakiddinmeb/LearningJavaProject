package learningjava;

public class App {
    // main() is the central function of a currentMultipleava program. This function
    // will run all of the code that you write to solve the problems
    // in functions problem1, problem2, etc.
    public static void main(String[] args) {
        System.out.println("Problem 1");
        problem1();
        System.out.println("Problem 2");
        problem2();
        System.out.println("Problem 3");
        problem3();
        System.out.println("Problem 4");
        problem4();
        System.out.println("Problem 5");
        problem5();
        System.out.println("Problem 6");
        problem6();
        System.out.println("Problem 7");
        problem7();
        System.out.println("Problem 8");
        problem8();
    }

    /*
     * 1. Hello World Write a method that prints out "Hello World", and make it run.
     */
    static void problem1() {
        System.out.println("Hello World");
        
    }

    /*
     * 2. Counting Write a method that prints the numbers from 1 to 10, each on a
     * separate line.
     */
    static void problem2() {
        int x = 1;
        while (x <= 10){
            System.out.println(x++);
        }
        
        // Fill in your answer here.

    }

    /*
     * 3. More complex counting
     * 
     * Write a program that prints the numbers from 1 to 100, with ten numbers on
     * each line, like this:
     * 1 2 3 4 5 6 7 8 9 10
     * 11 12 13 14 15 16 17 18 19 20
     * 21 22 23 24 25 26 27 28 29 30
     * ...
     * 91 92 93 94 95 96 97 98 99 100
     */
    static void problem3() {
        int x = 1;
        while (x<=100){
            if (x % 10 == 0) {
                System.out.print(x + "\n");

            } else {
                System.out.print(x + " ");
            }
            x++;
        }

    }
        
        
            
            
         



    /*
     * 4. Write a "power" method. This method computes x to the y power.
     */
    static double power(int x, int y) {
        double result = Math.pow(x, y); // Think about why you want to have 1 and not 0 to start

        

        return result;
    }

    static void problem4() {
        System.out.println("2 to the 8th power is: " + power(2, 8));
        System.out.println("3 to the 4th power is: " + power(3, 4));
        System.out.println("5 to the 3rd power is: " + power(5, 3));
        System.out.println("2 to the 16th power is: " + power(2, 16));
    }

    /*
     * 5. Power table method to print out a table of x to the
     * power of y. In this table, "x" counts the numbers as you go from left to
     * right in the table, and "y" counts the numbers as you go from top to bottom
     * in the table. Each number in the table is calculated using the "power" method
     * that you wrote for problem 4.
     * 
     * The result should look like this:
     * 
     * 1 1 1 1 1 1 1 1 1 1
     * 2 4 8 16 32 64 128 256 512 1024
     * 3 9 27 81 273 729 2187 6561 19683 59049
     * 4 16 64 256 1024 4096 16384 65536 262144 1048576
     * 5 25 125 625 3125 15625 78125 390625 1953125 9765625
     * ...
     */
    static void problem5() {
	int x = 10;
    int y = 5;
        
        
    int i = 1, u = 1;
    while (i <= y) {
        String values = "";
        while (u <= x)
            values += power(i, u++) + " ";
        System.out.println(values);
        i++;
        u = 0;
        }


        
    }


    

    /* 6. Booleans and if statements
     *    In the for-loop, print "fizz" if a number is divisible by 2, "buzz" if it is divisible
     *    by 3, and "fizzbuzz" if it is divisible by both. If none of these is true, print "nope".
     * 
     *    The first few entries (starting with the number 0) should be:
     *    fizzbuzz
     *    nope
     *    fizz
     *    buzz
     *    fizz
     *    nope
     *    fizzbuzz
     *    ...
     */
    static void problem6() {

        for (int i = 0; i<100; i++) {
            if (i%2 == 0 && i%3 == 0) {
                System.out.println("fizzbuzz");
            } else if (i%2 == 0) {
                System.out.println("fizz");
                
            } else if (i%3 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println("nope");
            }

            // Use if, else if, and else statements to decide what to print.
        }
    }

    /* 7. Arrays
        Write a method that returns an array containing all of the integers from
        0 to a value n that is specified by the caller.
    */
    static int[] numbersUpToN(int n) {
        int[] integers = new int[n+1]; // Can you see why we need n+1 elements?
        
        for (int i = 0; i < integers.length; i++)
         integers[i] = i;
            
        return integers;
    }

    static void problem7() {
        int[] upTo9 = numbersUpToN(9);
        for (int number : upTo9) {
            System.out.println(""+number);
        }
    }


    /* 8. let's use arrays to solve a problem!
        Implement the Sieve of Eratosthenes
    */
    static int[] findPrimesLessThanN(int n)
    {
	// We're using possiblePrimes to keep track of which numbers we've
	// eliminated as possibly being prime. This is like crossing them off a
	// sheet of paper. Here, we're making use of the array index to indicate what
	// the number is, so the only information about the number we have to store
	// is whether or not we've crossed it off our list.

    	boolean[] possiblePrimes = new boolean[n];
    // First: set all the elements of possiblePrimes to true.
        for (int x = 0; x < possiblePrimes.length; x++)
            possiblePrimes[x] = true;

    	// Second: set possiblePrimes[0] and possiblePrimes[1] to false, since we know
        // by definition that 0 and 1 are not prime.
        possiblePrimes[0] = false;
        possiblePrimes[1] = false;
        
	
	// Third: Make a for loop. Have a variable currentPossible that starts at 2, and have the
    // loop continue for as long as currentPossible < n, and increment by 1.
    
	
    	// Fourth: INSIDE the for loop mentioned above, make another for loop. This one should have
    	// a variable currentMultiple that starts at (currentPossible + currentPossible), and continues
        // for as long as currentMultiple < n, and increment by currentPossible.
        // Fifth, INSIDE this inner for loop, set possiblePrimes[currentMultiple] to false
        for (int currentPossible = 2; currentPossible < n; currentPossible++) {
            for (int currentMultiple = currentPossible * 2; currentMultiple < n; currentMultiple += currentPossible)
                possiblePrimes[currentMultiple] = false;
        }
	
	
	
    	// Sixth: OK, this is outside of both for loops. Now you need to count how many elements in possiblePrimes
        // are true. This is going to be the number of elements to return as primes.
        int primecount = 0;
        for (boolean possible : possiblePrimes) {
            if (possible)
            primecount++;
        }
        
    	// Seventh: Create an array of ints big enough to fit all the primes
        int[] primes = new int[primecount]; // Change 0 to the correct size

    // Eighth: Create a variable currentPrimeIndex = 0
        int currentPrimeIndex = 0;

    	// Ninth: Using a for loop with index i, go through the array of possiblePrimes. 
    	// Every time you find a true value, set primes[currentPrimeIndex] = i.
        // Then increment currentPrimeIndex
        for (int i = 0; i < possiblePrimes.length; i++) {
            if (possiblePrimes[i]) {
                primes[currentPrimeIndex] = i;
                currentPrimeIndex++;
            }
        }
	
        // Tenth: Return primes.
        return primes;
    }

    static void problem8() {
        int[] primesUpTo100 = findPrimesLessThanN(100);
        for (int prime : primesUpTo100) {
            System.out.println(""+prime);
        }

    }

}
