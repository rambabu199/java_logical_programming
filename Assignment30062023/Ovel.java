
/*Write a JAVAprogram to input any alphabet and check whether it is vowel or consonant.*/
import java.util.Scanner;

class Demo {
  Scanner sc = new Scanner(System.in);

  void ovel() {
    System.out.println("enter a charector:");
    char ch = sc.next().charAt(0);
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
      System.out.println(ch + "is a ovel");
    } else
      System.out.println(ch + "is a consonant");

  }
}

class Ovel {
  public static void main(String args[]) {
    Demo d = new Demo();
    d.ovel();
  }

}