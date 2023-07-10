/*  JFM1T2_Assignment1:

     Write a java program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Operations
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter first number: ");
      int a=sc.nextInt();
      System.out.println("Enter second number: ");
      int b=sc.nextInt();
      int sub=a-b;
      int mul=a*b;
      int div=a/b;
      int mod=a%b;
       System.out.println("difference between two numbers: "+sub);
      System.out.println(" product of two numbers: "+mul);
      System.out.println("division of  two numbers: "+div);
      System.out.println("increment value of the first number: "+a++);
      System.out.println("decrement value of the first number: "+a--);
      System.out.println("remainder of two numbers: "+mod);
      
    }
}