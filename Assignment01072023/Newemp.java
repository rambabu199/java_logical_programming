import java.util.Scanner;

class Newemp {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int eno;
    String ename;
    float esalary;
    System.out.println("enter the employee number : ");
    eno = sc.nextInt();
    System.out.println("enter the employee name");
    ename = sc.next();
    System.out.println("enter the empoloyee salary");
    esalary = sc.nextFloat();
    System.out.println(" the empoloyee number is:" + eno);
    System.out.println(" the empoloyee name is:" + ename);
    System.out.println(" the empoloyee salary is:" + esalary);

  }
}