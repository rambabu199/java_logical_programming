
/* Write a JAVAprogram to input any character and check whether it is alphabet, digit or special character.*/
import java.util.Scanner;

class Demo {
  Scanner sc = new Scanner(System.in);

  void alfa() {
    char ch;
    System.out.println("Enter the character ");
    ch = sc.next().charAt(0);

    if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
      System.out.print(ch + " is an Alphabet ");
    } else if (ch >= '0' && ch <= '9') {
      System.out.print(ch + " is  an Digit ");
    } else {
      System.out.print(ch + " is  an special charecter ");
    }
  }

}

class Alfa2 {
  public static void main(String args[]) {
    Demo d = new Demo();
    d.alfa();
  }
}