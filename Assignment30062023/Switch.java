
/*Write a JAVAprogram to print day of week name using switch case.*/
import java.util.Scanner;

class Switch1 {
  Scanner sc = new Scanner(System.in);

  void week() {
    System.out.println("enter a week number:");
    int a = sc.nextInt();
    switch (a) {
      case 1:
        System.out.println("monday");
        break;
      case 2:
        System.out.println("tuesday");
        break;
      case 3:
        System.out.println("wednesday");
        break;
      case 4:
        System.out.println("thursday");
        break;
      case 5:
        System.out.println("friday");
        break;
      case 6:
        System.out.println("saturday");
        break;
      case 7:
        System.out.println("sunday");
        break;
      default:
        System.out.println("no day");
        break;
    }
  }
}

class Switch {
  public static void main(String args[]) {
    Switch1 s = new Switch1();
    s.week();
  }
}