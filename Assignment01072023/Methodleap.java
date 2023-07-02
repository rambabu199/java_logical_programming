import java.util.Scanner;

class Leap {
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

class Methodleap {
  public static void main(String args[]) {
    Leap l = new Leap();
    l.leap();
  }
}