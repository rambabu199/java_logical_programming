
/* Write a JAVAprogram to find maximum between two numbers.*/
import java.util.Scanner;

class Big {
  Scanner sc = new Scanner(System.in);

  void max() {
    System.out.println("enter any 2 numbers");
    int a = sc.nextInt();
    int b = sc.nextInt();
    if (a > b) {
      System.out.println(a + "is Big");
    } else {
      System.out.println(b + "is Big");
    }
  }
}

class Max {
  public static void main(String args[]) {
    Big b = new Big();
    b.max();
  }
}