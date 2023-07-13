//JFM1T3_Assignment3:
/*
1.Write a program to declare a character variable and initialize it with any alphabet
 between A-Z. Print the ASCII value/unicode of the respective character.

  Sample Input:
       character=M

  Expected Output:
      ASCII value of M is:77

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class Unicode {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter a alphabet between A-Z:");
    char character = scanner.next().charAt(0);
    int asciiValue = (int) character;
    System.out.println(" ASCII value of " + character + " is" + asciiValue);

    // Print the Result

  }
}
