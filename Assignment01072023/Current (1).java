
/*
 * write a java program to enter consumer name,
 * consumer number, last month units,present month units, calculate total and display report 
 note :- rate per unit is 3.80
 */
import java.util.Scanner;

class Current {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    float urate = 3.80f;
    System.out.println("enter the consumer number:");
    int cnum = sc.nextInt();
    System.out.println("enter the consumer name:");
    String cname = sc.next();
    System.out.println("enter the last month reading:");
    int lmr = sc.nextInt();
    System.out.println("enter the present month reading:");
    int pmr = sc.nextInt();
    float tunits = pmr - lmr;
    float bamount = tunits * urate;
    System.out.println("the report is:");
    System.out.println("********************");
    System.out.println("consumer number:" + cnum);
    System.out.println("consumer name:" + cname);
    System.out.println("last month reading:" + lmr);
    System.out.println("present month reading:" + pmr);
    System.out.println("total units consumed:" + tunits);
    System.out.println("total bill amount is:" + bamount);
  }
}
