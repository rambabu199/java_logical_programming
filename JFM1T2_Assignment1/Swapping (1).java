/*  JFM1T2_Assignment6:

    Write a program that swaps the values of 2 variables without using third variable.
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: 
    12
    Enter second number: 
    45
    
    Expected Output:
    Before swapping: 12 , 45
    After swapping: 45 , 12
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Swapping {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a, b, t;
    System.out.println("enter the 1st number:");
    a = sc.nextInt();
    System.out.println("enter the 2nd number:");
    b = sc.nextInt();
    t = a;
    a = b;
    b = t;
    System.out.println("the 1st value: " + a);
    System.out.println("the 2nd value: " + b);

  }
}
