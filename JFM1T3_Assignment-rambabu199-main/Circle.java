//JFM1T3_Assignment1: 
/* Write a program to calculate the circumference of a circle and print the result in whole number. 
  Allow user to input the cirlce radius from terminal. 

  Sample Input:
    radius of the circle=6

  Expected Output:
   Circumference of the circle=38
   

*/

//import statement for java program to read inputs using Scanner class 
import java.util.Scanner;

public class Circle {
  public static void main(String args[]) {
    int radius;
    float pi = 3.14F;
    float circumference;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter radius as a positive integer");
    radius = scanner.nextInt();
    circumference = 2 * pi * radius;
    System.out.println("Circumference of the circle=" + circumference);

  }
}
