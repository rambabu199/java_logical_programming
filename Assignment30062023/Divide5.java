
/*Write a JAVAprogram to check whether a number is divisible by 5 and 11 or not*/
import java.util.Scanner;

class Div {
  Scanner sc = new Scanner(System.in);

  void div() {
    System.out.println("enter any  number");
    int a = sc.nextInt();
    if (a % 5 == 0 && a % 11 == 0) {
      System.out.println(a + "is divisible by 5 and 11");

    } else {
      System.out.println(a + "is not divisible");
    }
  }
}

class Divide5 {
  public static void main(String args[]) {
    Div d = new Div();
    d.div();
  }
}