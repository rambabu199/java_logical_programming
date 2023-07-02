
/*a java program to swap the two numbers */
import java.util.Scanner;

class Swap {
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