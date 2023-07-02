
/*Write a JAVAprogram to input electricity unit charges and calculate total electricity bill according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill*/
import java.util.Scanner;

class Demo {
  Scanner sc = new Scanner(System.in);
  float sur, total, bill, ur1 = 0.5f, ur2 = 0.75f, ur3 = 1.2f, ur4 = 1.5f;
  int pmr, lmr, tunits;

  void bill() {

    System.out.println("enter the last month reading:");
    lmr = sc.nextInt();
    System.out.println("enter the present month reading:");
    pmr = sc.nextInt();
    tunits = pmr - lmr;
    if (tunits <= 50) {
      total = (tunits * ur1);
      sur = (total * 20) / 100;
      bill = total + sur;
      System.out.println("BILL AMOUNT IS:" + bill);
    } else if (tunits > 50 && tunits <= 150) {
      total = (50 * ur1) + (tunits - 50) * ur2;
      sur = (total * 20) / 100;
      bill = total + sur;
      System.out.println("BILL AMOUNT IS:" + bill);
    } else if (tunits > 151 && tunits <= 250) {
      total = (50 * ur1) + (100 * ur2) + (tunits - 150) * ur3;
      sur = (total * 20) / 100;
      bill = total + sur;
      System.out.println("BILL AMOUNT IS:" + bill);
    } else if (tunits > 250) {
      total = (50 * ur1) + (100 * ur2) + (100 * ur3) + (tunits - 250) * ur4;
      sur = (total * 20) / 100;
      bill = total + sur;
      System.out.println("BILL AMOUNT IS:" + bill);
    }
  }
}

class Current {
  public static void main(String args[]) {
    Demo d = new Demo();
    d.bill();

  }
}
