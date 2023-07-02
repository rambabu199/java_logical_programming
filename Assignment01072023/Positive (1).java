import java.util.Scanner;

class Positive {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a value");
    int a = sc.nextInt();
    if (a > 0) {
      System.out.println("a is a positive number");

    } else {
      System.out.println("a is a negitive number");
    }
  }
}