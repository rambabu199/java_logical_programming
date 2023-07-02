import java.util.Scanner;

class Add {
  int c;

  void add(int x, int y) {
    c = x + y;
    System.out.println("the addition of two values are :" + c);
  }
}

class Method1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a,b values:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    Add a1 = new Add();
    a1.add(a, b);
  }
}