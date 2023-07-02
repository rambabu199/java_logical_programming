
/* Write a JAVAprogram to check whether a character is alphabet or not. */
import java.util.Scanner;

class Demo {
  Scanner sc = new Scanner(System.in);

  void alfa() {
    char ch;
    System.out.println("Enter the character ");
    ch = sc.next().charAt(0);

    if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
      System.out.print(ch + " is an Alphabet ");
    } else {
      System.out.print(ch + " is not an Alphabet ");
    }
  }

}

class Alfa {
  public static void main(String args[]) {
    Demo d = new Demo();
    d.alfa();
  }
}