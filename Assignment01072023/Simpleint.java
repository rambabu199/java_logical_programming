
/*
 * write a java program to enter Enter Principle amount , Total Number of Months , Rate of Intrest , calculate Simple Intrest  and Total Amount , Display the Report?
 */
import java.util.Scanner;

class Simpleint {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the principle amount:");
    int p = sc.nextInt();
    System.out.println("enter the number of months:");
    int t = sc.nextInt();
    System.out.println("enter the rate of intrest:");
    float r = sc.nextFloat();
    float tintrest = (p * t * r) / 100;
    float tamount = p + tintrest;
    System.out.println("the report is:");
    System.out.println("********************");
    System.out.println("principle amount:" + p);
    System.out.println("number of months:" + t);
    System.out.println("rate of intrest:" + r);
    System.out.println("the total intrest is:" + tintrest);
    System.out.println("the total amount is:" + tamount);
  }
}
