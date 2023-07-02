import java.util.Scanner;

class Big {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a value:");
    int a = sc.nextInt();
    System.out.println("enter b value:");
    int b = sc.nextInt();
    System.out.println("enter c value:");
    int c = sc.nextInt();
    if (a > b) {
      if (a > c) {
        System.out.println("A is big");
      } else {
        System.out.println("C is big");
      }
    } else {
      if (b > c) {
        System.out.println("B is big");
      } else {
        System.out.println("C is big");
      }
    }
  }
}
