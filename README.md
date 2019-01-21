# quiz-4-corrections
1. 9)
public double randomNumber(int seed) {
   if (seed > 1000) {
       return Math.random() * seed;
   } else if (seed > 500) {
       return Math.random() * seed * -1;
   }
}

Question: I keep getting an error message telling me that my method must return a value of type double. What's wrong with my code?

Correct Answer: For seed values less than or equal to 500, the method does not return a value.

Why this answer is correct: The method only allows for values of seed greater than 500 because the two if statements in the method definition checks for if the value of the variable seed is greater than 1000 and if not, 500. That means that any value of seed less than 500 does not return any value at all, causing an error.

10)
Consider the following method definition.
public static void saySomething(String something) {
   System.out.println(something);
}
Now, consider the following usages of this method.
saySomething("hello, there.");        // first usage

String message = "hello, there.";     // second usage
saySomething(message);

String something = "hello, there.";   // third usage
saySomething(something);
From the perspective of what is output to the console, what is the difference between the three ways in which the method is called?
 
Correct Answer:  There is no difference. 
Why this answer is correct: The first method definition just prints a message to the console. Now in the usages, the first usage prints the string “hello there” to the console. The second usage assigns the variable message a string and then prints the message. The third usage does the same thing as the second variable, but with a different name.  It does not matter the name of the variable though, and all three usages print the same string, “hello, there”.
 
13. 
Consider the following method definition.
public int add(int x, int y) {
   return x + y;
}
Assuming I've created an object of the class in which this method is defined called test, how can I use this method to compute and store the sum of two integers?
 
Correct Answer: int sum = test.add(123, 456);
 
Why this answer is correct: Because the object name is test, in order to compute the sum of two integers that, you use (objectname.methodname(parameters)) or test.add(x, y). In order to store the values, however, you have to create a variable that will keep the sum of those two integers. 

14.
Which of the following are valid access modifiers for methods in Java? Select all that apply.
  private 
  public 
  static
  package 
  dynamic 
  protected 
  default 
Correct Answers: public private protected default
 
Why these answers are correct: There are only four access modifiers: public, private, protected, and default that determine the accessibility of things.. Public modifiers can be accessed by anywhere, private only by its own class, protected only by its own package, and default only by classes and packages. Static is not a modifier but can be tacked on to access modifiers. 
 
 
 
 
 
 
 

