
/*write a java program to enter product name,
product number,product cost,product quantity*/
import java.util.Scanner;

class Bill {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the product number:");
    int pnum = sc.nextInt();
    System.out.println("enter the product name:");
    String pname = sc.next();
    System.out.println("enter the product cost:");
    float pcost = sc.nextFloat();
    System.out.println("enter the product quantity:");
    int pqua = sc.nextInt();
    float bill = pcost * pqua;
    System.out.println("the report is:");
    System.out.println("product number:" + pnum);
    System.out.println("product name:" + pname);
    System.out.println("product cost:" + pcost);
    System.out.println("product quantity:" + pqua);
    System.out.println(" the total bill amount is :" + bill);

  }
}