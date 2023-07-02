import java.util.Scanner;

class Even {
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

class Methodeven {
  public static void main(String args[]) {
    Even e = new Even();
    e.even();
  }

}