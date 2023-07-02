
/*Write a JAVAprogram to check whether a number is negative, positive or zero*/
import java.util.Scanner;

class Demo {
  Scanner sc = new Scanner(System.in);

  void positive() {
    System.out.println("enter a value");
    int a = sc.nextInt();
    if (a > 0) {
      System.out.println("a is a positive number");

    } else if (a == 0) {
      System.out.println("a value is zero");
    } else {
      System.out.println("a is a negitive number");
    }
  }
}

class Positive {
  public static void main(String args[]) {
    Demo d = new Demo();
    d.positive();
  }

}