
/*Write a JAVAprogram to check whether a character is uppercase or lowercase alphabet.*/
import java.util.Scanner;

class Demo {
  Scanner sc = new Scanner(System.in);

  void alfa() {
    char ch;
    System.out.println("Enter the character ");
    ch = sc.next().charAt(0);

    if (ch >= 'A' && ch <= 'Z') {
      System.out.print(ch + " is an Uppercase letter ");
    } else if (ch >= 'a' && ch <= 'z') {
      System.out.print(ch + " is  an Lower case letter ");
    } else {
      System.out.println("invalid entry");
    }
  }

}

class Upper {
  public static void main(String args[]) {
    Demo d = new Demo();
    d.alfa();
  }
}