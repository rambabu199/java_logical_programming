//JFM1T3_Assignment4:
/*
1.Write a program to store your best friend's mobile number in a variable and print the last 4 digits. Consider the following sample for reference.
  Mobile number should accept only 10 digits. Not less than 10 digits or greater than 10 digits. 
  Allow user to input the phone number from the terminal

  Sample Input:
        mobileNum=9393927890

  Expected Output:
        Your friend's mobile number ends with ******7890

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class MobileNumber {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter phone number (10 digits)");
    String mobileNum = scanner.nextLine();
    int length = mobileNum.length();
    if (length == 10) {
      /*
       * anothor approch
       * long m=(long)mobileNum;
       * int d=m%10000//because we need last 4 digits by
       * using% we can get remainder
       * System.out.println("******"+d);
       ***/
      String str1 = "";
      for (int i = 6; i < length; i++)
        str1 = str1 + mobileNum.charAt(i);
      System.out.println("Your friend's mobile number ends with ******" + str1);
    } else
      System.out.println("please enter 10 digits");

  }
}