
/*a java program to swap the two numbers with out using
 a temparary variable*/
import java.util.Scanner;

class Swap2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a, b;
    System.out.println("enter the 1st number:");
    a = sc.nextInt();
    System.out.println("enter the 2nd number:");
    b = sc.nextInt();
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("the 1st value: " + a);
    System.out.println("the 2nd value: " + b);
  }
}