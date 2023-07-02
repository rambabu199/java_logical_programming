
/* Write a JAVAprogram to input basiJAVAsalary of an employee and calculate its Gross salary according to following:
BasiJAVASalary <= 10000 : HRA = 20%, DA = 80%
BasiJAVASalary <= 20000 : HRA = 25%, DA = 90%
BasiJAVASalary > 20000 : HRA = 30%, DA = 95%*/
import java.util.Scanner;

class Gross {
  Scanner sc = new Scanner(System.in);
  float gross, hra, da;

  void gross() {

    System.out.println("enter the Basic salary:");
    int basic = sc.nextInt();
    if (basic <= 10000) {
      hra = (basic * 20) / 100;
      da = (basic * 80) / 100;
      gross = basic + hra + da;
      System.out.println("GROSS SALARY IS:" + gross);
    } else if (basic <= 20000 && basic > 10000) {
      hra = (basic * 25) / 100;
      da = (basic * 90) / 100;
      gross = basic + hra + da;
      System.out.println("GROSS SALARY IS:" + gross);
    } else if (basic > 20000) {
      hra = (basic * 30) / 100;
      da = (basic * 95) / 100;
      gross = basic + hra + da;
      System.out.println("GROSS SALARY IS:" + gross);
    } else {
      System.out.println("invalid entry");
    }
  }
}

class Salary {
  public static void main(String args[]) {
    Gross g = new Gross();
    g.gross();

  }
}
