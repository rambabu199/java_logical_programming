
/* Write a JAVAprogram to check whether a number is even or odd.*/
import java.util.Scanner;

class Even1 {
  Scanner sc = new Scanner(System.in);

  void even() {
    System.out.println("enter a value");
    int a = sc.nextInt();
    if (a % 2 == 0) {
      System.out.println("a is a even number");

    } else {
      System.out.println("a is a odd number");
    }
  }
}

class Even {
  public static void main(String args[]) {
    Even1 e = new Even1();
    e.even();
  }

}