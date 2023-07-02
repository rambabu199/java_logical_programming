
/*ading two numbers using method with return type and with args*/
import java.util.Scanner;

class Add {
  int a, b, c;

  int add() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a,b values:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    c = a + b;
    return c;
  }
}

class Methodadd {
  public static void main(String args[]) {
    Add a1 = new Add();
    int x = a1.add();
    System.out.println("the addition of two values are :" + x);
  }
}