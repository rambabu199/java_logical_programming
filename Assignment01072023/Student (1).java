
/*write a java program to enter student name,
student number, 3 subject of marks and calculate total
and avg and display report*/
import java.util.Scanner;

class Student {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the student number:");
    int snum = sc.nextInt();
    System.out.println("enter the student name:");
    String sname = sc.next();
    System.out.println("enter the marks of maths:");
    int mat = sc.nextInt();
    System.out.println("enter the marks of physics:");
    int phy = sc.nextInt();
    System.out.println("enter the marks of chemistry:");
    int che = sc.nextInt();
    int total = mat + phy + che;
    int avg = total / 3;
    System.out.println("the report is:");
    System.out.println("student number:" + snum);
    System.out.println("student name:" + sname);
    System.out.println("marks in maths:" + mat);
    System.out.println("marks in physics:" + phy);
    System.out.println("marks in chemistry:" + che);
    System.out.println("total marks are:" + total);
    System.out.println(" the avarage of marks:" + avg);

  }
}