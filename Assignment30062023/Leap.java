
/* Write a JAVAprogram to check whether a year is leap year or not.*/
import java.util.Scanner;

class Leap1 {
  Scanner sc = new Scanner(System.in);

  void leap() {
    System.out.println("enter a year");
    int a = sc.nextInt();
    if (a % 4 == 0) {
      System.out.println("a is a leap year");

    } else {
      System.out.println("a is not a leap year");
    }
  }
}

class Leap {
  public static void main(String args[]) {
    Leap1 l = new Leap1();
    l.leap();
  }
}