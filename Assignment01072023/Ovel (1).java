import java.util.Scanner;

class Ovel {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a charector:");
    char ch = sc.next().charAt(0);
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
      System.out.println(ch + "is a ovel");
    } else
      System.out.println(ch + "is a consonant");

  }

}