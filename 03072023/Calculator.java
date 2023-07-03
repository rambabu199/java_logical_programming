import java.util.Scanner;

class Demo {
  float c;

  void add(int a, int b) {
    c = (float) a + b;
    System.out.println("Addition value is" + c);
  }

  void sub(int a, int b) {
    c = (float) a - b;
    System.out.println("subtraction value is" + c);
  }

  void mul(int a, int b) {
    c = (float) a * b;
    System.out.println("Multiplication value is" + c);
  }

  void div(int a, int b) {
    c = (float) a / b;
    System.out.println("Division value is" + c);
  }

  void rem(int a, int b) {
    c = (float) a % b;
    System.out.println("Remainder value is" + c);
  }
}

class Calculator {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Demo d = new Demo();
    System.out.println(":calculator:");
    System.out.println("---------------");
    System.out.println("[1] ADDITION");
    System.out.println("[2] SUBTRACTION");
    System.out.println("[3] MULTIPLICATION");
    System.out.println("[4] DIVISION");
    System.out.println("[5] REMAINDER");
    System.out.println("ENTER YOUR CHOICE");
    int ch = sc.nextInt();
    System.out.println("enter a , b values");
    int a = sc.nextInt();
    int b = sc.nextInt();
    switch (ch) {
      case 1:
        d.add(a, b);
        break;
      case 2:
        d.sub(a, b);
        break;
      case 3:
        d.mul(a, b);
        break;
      case 4:
        d.div(a, b);
        break;
      case 5:
        d.rem(a, b);
        break;
      default:
        System.out.println("invaid");
    }
  }
}