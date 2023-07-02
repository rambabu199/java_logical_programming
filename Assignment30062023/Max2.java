
/*Write a JAVAprogram to find maximum between three numbers.*/
import java.util.Scanner;

class Big {
  Scanner sc = new Scanner(System.in);

  void max() {
    System.out.println("enter any 3 numbers");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if (a > b) {
      if (a > c) {
        System.out.println(a + "is Big");
      } else {
        System.out.println(c + "is Big");
      }
    } else if (b > c) {
      System.out.println(b + "is Big");
    } else {
      System.out.println(c + "is Big");
    }
  }
}

class Max2 {
  public static void main(String args[]) {
    Big b = new Big();
    b.max();
  }
}